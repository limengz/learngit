
Feature:商品同步
  Scenario:同步商品至hub
    Given 已知已经创建商品同步定时任务
    When 触发商品同步定时任务
    Then 商品列表保存至数据库及RMQ，且同步至HUB成功

Feature:库存同步
  Scenario: 全量库存同步
    Given 已知接受到IM同步全量库存信息
    When 触发库存同步定时任务
    Then 同步成功，平台库存正确更新且异步反馈同步信息至pac
    And  同步失败，进行重试
    And  重试至最大次数，反馈失败信息至IM
    And  IM同步全量小于等于0，同步0库存至平台

  Scenario: 增量库存同步
    Given 已知接受到IM同步增量库存信息
    When 触发库存同步定时任务
    Then 同步成功，平台库存正确更新
    Then 同步日志实时反馈信息至pac

Feature:订单同步
  Scenario: 将待发货订单同步至HUB（单sku多数量、多sku多数量、平台&店铺满减、满赠、折扣、其他）
    Given 已知已经创建订单同步定时任务
    When 触发订单同步定时任务
    Then 订单列表保存至数据库及RMQ，且同步至HUB成功
    And  同步失败，进行重试

Feature:物流同步
  Background: WMS/shopdog出库，填写物流信息,推送至hub
  Scenario: 物流信息同步
    Given 已知从hub获取订单物流信息
    When 触发物流信息同步
    Then 同步成功，平台订单物流信息更新
    And  同步失败，进行重试
    And  同步失败，记录失败日志


Feature:取消单同步
  Scenario: 取消单同步
    Given 已知已经创建取消单同步定时任务
    When 触发取消单同步定时任务
    Then 订单信息保存至数据库及RMQ，并同步至HUB成功
    And  同步失败，记录失败日志
    And  如果取消的订单没有同步过详情时，先需要同步订单详情给oms P01 状态1新建，并同步支付信息，然后再调用P14取消订单


Feature:退货单同步
  Scenario:退货订单信息同步
    Given 已知已经创建退货单同步定时任务
    When 触发退货单同步定时任务
    Then 将退货订单信息推送至HUB，同步成功数据库记录成功
    And  同步失败进行重试

Feature:退货订单确认回传
  Background: WMS/shopdog退货入库后，进行状态回传，同步至hub
    Given 从HUB获取到退货确认信息
    When  触发退货单退货确认信息同步
    Then  将退货单退货确认信息同步至平台，退货成功，平台退货单状态变为已退货
    And   同步至平台成功，反馈回传结果

