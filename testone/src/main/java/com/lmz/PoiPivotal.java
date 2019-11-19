package com.lmz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFPivotTable;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiPivotal {

  public static void main(String[] args) throws IOException {
    //创建一个模板文件，里面自己手动填入数据
    FileInputStream file = new FileInputStream(new File("D:\\poi\\a.xlsx"));
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet =workbook.getSheetAt(0);
    //获取sheet页数据行数
    int num = sheet.getLastRowNum();
    //手动填充数据的区域
    AreaReference a = new AreaReference("A1:D11", SpreadsheetVersion.EXCEL2007);
    //数据透视表生成为位置
    CellReference b=new CellReference("L12");
    //生成数据透视图
    XSSFPivotTable pivotTable = sheet.createPivotTable(a,b);
    //添加行标签
    /*pivotTable.addRowLabel(0);
    System.out.println(pivotTable.getRowLabelColumns());*/

    //添加列数据
  /*  pivotTable.addReportFilter(0);
    pivotTable.addReportFilter(1);
    pivotTable.addReportFilter(2);
    pivotTable.addReportFilter(3);*/

    pivotTable.addDataColumn(0,true);
    pivotTable.addDataColumn(1,true);
    pivotTable.addDataColumn(2,true);
    pivotTable.addDataColumn(3,true);
   // pivotTable.addColumnLabel(DataConsolidateFunction.SUM, 1, "订单号");
    //指定生成文件位置
    FileOutputStream output_file = new FileOutputStream(new File("D:\\poi\\"+"POI_XLS_Pivot_Example.xlsx"));
    workbook.write(output_file);//write excel document to output stream
    output_file.close(); //close the file
  }

}
