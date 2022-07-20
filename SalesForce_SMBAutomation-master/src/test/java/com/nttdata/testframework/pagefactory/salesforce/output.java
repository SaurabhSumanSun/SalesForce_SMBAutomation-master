package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Excel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class output extends PageObject{

    @Autowired
    Excel excel;

    public output(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void OutPut(String dealType, String typeOfSupport, String Basketlink) throws InterruptedException, IOException {
        int rowCount =excel.getRowCount() + 1;
        System.out.println(dealType);
        excel.writeExcel(rowCount,1,dealType);
        System.out.println(typeOfSupport);
        excel.writeExcel(rowCount,2,typeOfSupport);
        System.out.println(Basketlink);
        excel.writeExcel(rowCount,3,Basketlink);
        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date2 = new Date();
        String dateTime= dateFormat1.format(date2);
        System.out.println(dateTime);
        excel.writeExcel(rowCount,0,dateTime);
        logger.debug("Output Recorded");
    }
}
