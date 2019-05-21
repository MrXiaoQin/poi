package com.poitest.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import com.poitest.entity.StudentBaseInfo;
import com.poitest.entity.StudentStatistics;
import com.poitest.util.ImportExcelUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/poi")
@RestController
public class TestImportExcel {
    @RequestMapping("/import")
    public static void main(String[] args) throws IOException, Exception {
        String fileName = "student.xlsx";
        InputStream in = new FileInputStream(new File("excelfile/student.xlsx"));
        Workbook wb = ImportExcelUtil.chooseWorkbook(fileName, in);
        StudentStatistics studentStatistics = new StudentStatistics();

        //读取一个对象的信息
        StudentStatistics readDateT =
                ImportExcelUtil.readDateT(wb, studentStatistics, in, new Integer[]{12, 5}, new Integer[]{13, 5});
        System.out.println(readDateT);

        //读取对象列表的信息
        StudentBaseInfo studentBaseInfo = new StudentBaseInfo();
        //第二行开始，到倒数第三行结束（总数减去两行）
        List<StudentBaseInfo> readDateListT = ImportExcelUtil.readDateListT(wb, studentBaseInfo, 2, 2);
        System.out.println(readDateListT);

  }
}
