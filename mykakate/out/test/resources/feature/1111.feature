Feature:商品同步
  Scenario: 从平台获取在售商品列表保存到数据库和RMQ
    Given  已知平台获取在售商品列表接口
    When   调用获取在售商品列表接口
    Then   获取到在售商品列表，并保存到数据库和RMQ中

  Scenario: 从平台获取在售商品详情保存到数据库中
    Given  已知平台获取商品详情接口
    When   调用获取商品详情接口
    Then   将获取到的商品详情保存到数据库中

  Scenario: 同步商品信息至HUB
    Given  已经获取到了商品信息
    When   调用hub在售商品同步，推送接口
    Then   将在售商品信息推送给HUB