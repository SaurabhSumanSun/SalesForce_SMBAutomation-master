package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Excel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class readCDR extends PageObject {


    @Autowired
    Excel excel;
    int count = 0;
    ArrayList<String> cdr, testcase;

    public readCDR(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void readCDRS() throws IOException {


        System.out.println("CSV TRIALS");
        cdr = excel.readCSV();


        //testcase = excel.readCSV();
//        for (String value : cdr) {
//
//            System.out.println();
//            System.out.println();
//            System.out.println();
//            System.out.println();
//
////            value =value.replace(":", "");
//            System.out.println("CDR:" + value);

//        }
//    }
    }
}

//            System.out.println("Data extracted from cdr is: " + value);
//
//            if (value.contains("11:30:00")) {
//
//                System.out.println("Found");
//                count++;
//            }
//
//            System.out.println();
//            System.out.println();
//            System.out.println();
//            System.out.println();
//        }
//        System.out.println("Total Matching records is:" + count);
//
//






