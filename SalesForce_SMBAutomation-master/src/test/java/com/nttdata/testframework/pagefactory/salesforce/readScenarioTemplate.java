package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Excel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

@Component
public class readScenarioTemplate extends PageObject {


    @Autowired
    Excel excel;
    CompareTestAndCdr extract;
    String date;
    String time;
    String imsi;
    String imsiTrimed;
    ArrayList<String> IMSI;
    ArrayList<String> dates;
    ArrayList<String> Time;
    ArrayList<String> BufferTime;
    ArrayList<String> SceanrioName;
    ArrayList<Integer> sceanrioWiseDate;
    ArrayList<Integer> ScenarioWiseTimer;
    ArrayList<Integer> rowNumbers=new ArrayList<Integer>();;
    String[] scenarioWiseTime,scenarioWiseTimeBuf;
    ArrayList<Integer> ScenarioWiseImsi;

    String scenarioName;
    public readScenarioTemplate(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void readTestCondition() throws IOException, ParseException {
        SceanrioName = StringArrayList(excel.getRowCount(), 0, excel);
        IMSI = StringArrayList(excel.getRowCount(), 8, excel);
        IMSI = extractNumbers(IMSI);
        dates = StringArrayList(excel.getRowCount(), 9, excel);
        dates = extractNumbersDate(dates);
        Time = StringArrayList(excel.getRowCount(), 10, excel);
        Time = extractTime(Time);
        BufferTime = extractTimebuffer(Time);
        ScenarioDateExtract();

    }

    public void ScenarioDateExtract() throws IOException, ParseException {

        for (int i = 0; i <excel.getRowCount()-1; i++) {
            scenarioName=SceanrioName.get(i);
            scenarioWiseTime = ScenarioTimeExtractor(i,Time);
            scenarioWiseTimeBuf = ScenarioTimeExtractor(i,BufferTime);

            for(int timer =0; timer<scenarioWiseTime.length;timer++)
            {
                ScenarioWiseTimer = ScenarioTimeExtract3(i, scenarioWiseTime,scenarioWiseTimeBuf,timer);
                sceanrioWiseDate = ScenarioDateExtract2(i, ScenarioWiseTimer);
                ScenarioWiseImsi = ScenarioImsiExtract(i, sceanrioWiseDate);


                for(int a:ScenarioWiseImsi) {
                 if(rowNumbers.contains(a))
                 {

                 }
                 else {
                     rowNumbers.add(a);
                 }


                }

              if(scenarioName.equals("RCSCX-7"))
              {


                for(int a:sceanrioWiseDate) {
                    if(rowNumbers.contains(a))
                    {

                    }
                    else {
                        rowNumbers.add(a);
                    }


                }
              }

            }


           csvValidator(scenarioName,rowNumbers,scenarioWiseTime.length);
            rowNumbers.clear();

        }

    }


}



