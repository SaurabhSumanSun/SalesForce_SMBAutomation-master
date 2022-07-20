package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class CompareTestAndCdr extends PageObject {
    public CompareTestAndCdr(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @Autowired
    readCDR readCDR;
    @Autowired
    readScenarioTemplate readScenarioTemplate;

    ArrayList<String> cdrData, testCaseTime, testCaseBufferTime, testCaseDate, testcCaseImsi, SceanrioName;
    ArrayList<Integer> cdrsceanriodate;

    public void comparedata() throws IOException, ParseException {
//
//        cdrData = readCDR.cdr;
//        testCaseTime = readScenarioTemplate.Time;
//        testCaseBufferTime = readScenarioTemplate.BufferTime;
//        testCaseDate = readScenarioTemplate.dates;
//        testcCaseImsi = readScenarioTemplate.IMSI;
//        SceanrioName = readScenarioTemplate.SceanrioName;
//
//        readScenarioTemplate.ScenarioDateExtract();

//
////Count of dates that are matching.
//
//        for (String s : testCaseDate) {
//            int count = 0;
//            String k = "";
////            System.out.println("Date Value in TC is :" + s);
//            for (String p : cdrData) {
//                k = p.replace("/", "");
//                //     System.out.println("Date Value is:" + k);
//                if (k.contains(s)) {
//                    System.out.println("DATE Index of" + SceanrioName.get(testCaseDate.indexOf(s)) + "is: " + cdrData.indexOf(p));
//                    count++;
//
//                }
//            }
//            // System.out.println("The value of CDR record count is:: " + count);
//
//        }
//
//
//        // Count of IMSI that is matching within range
//        int count = 0;
//        for (String p : testcCaseImsi) {
//
//            // System.out.println("The initial value is:" + p);
//            // System.out.println(testcCaseImsi.indexOf(p));
//
//            String[] Imsi = p.split("(?<=\\G...............)");
//
//
//            for (int i = 0; i < Imsi.length; i++) {
//                count = 0;
//                //   System.out.println("The value of Test case is: " + Imsi[i]);
//                if (Imsi[i].isEmpty()) {
//                    //System.out.println("Datablank");
//                } else {
//
////            System.out.println("Date Value in TC is :" + s);
//                    for (String s : cdrData) {
//
////                System.out.println("Date Value is:" + p);
//                        if (s.contains(Imsi[i])) {
//
//                            count++;
//                            System.out.println("IMSI Index of+" + SceanrioName.get(testcCaseImsi.indexOf(p)) + " is: " + cdrData.indexOf(s));
//
//                        }
//                    }
//
//                }
//                // System.out.println("The value of IMSI for the value is: " + count);
//                // System.out.println("IMSI Index is: "+ cdrData.indexOf(p));
//
//
//            }
//
//        }
//
//
//        // Count of Time that is matching within range
//
//        int timeTestCase, timeBuffer, timeCdr;
//        for (String p : testCaseTime) {
//
//            System.out.println("The initial value is:" + p);
//
//
//            String[] Dtime = p.split("(?<=\\G......)");
//            String[] BufTime = testCaseBufferTime.get(testCaseTime.indexOf(p)).split("(?<=\\G......)");
//
//
//            for (int i = 0; i < Dtime.length; i++) {
//                count = 0;
//                //  System.out.println("The value of Test case is: " + Dtime[i] + "And buffer time is: "+BufTime[i]);
//                if (Dtime[i].isEmpty()) {
//                    //     System.out.println("Datablank");
//                    continue;
//                } else {
//                    timeTestCase = Integer.parseInt(Dtime[i]);
//                    timeBuffer = Integer.parseInt(BufTime[i]);
////            System.out.println("Date Value in TC is :" + s);
//                }
//                String g = "";
//                for (String s : cdrData) {
//                    if (cdrData.indexOf(s) == 0) {
//                        continue;
//                    }
//                    Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
//                    Matcher matcher = pattern.matcher(s);
//                    if (matcher.find()) {
//                        g = matcher.group();
//                        //   System.out.println("Matcher is: " + g);
//                    } else {
//                        System.out.println("");
//                    }
//                    //    System.out.println("String value is:"+s);
//                    g = g.replace(":", "");
//                    timeCdr = Integer.parseInt(g);
////                    System.out.println();
////                    System.out.println();
////                    System.out.println("TimeCDR is:" + timeCdr);
////                    System.out.println("Time Test case is: " + timeTestCase);
////                    System.out.println("Time Buffer for test case is:" + timeBuffer);
////                    System.out.println();
////                    System.out.println();
//
////                    System.out.println(timeTestCase < timeCdr);
////                    System.out.println(timeBuffer > timeCdr);
////                System.out.println("Date Value is:" + p);
//                    if ((timeTestCase < timeCdr) && (timeBuffer > timeCdr)) {
//
//                        count++;
//                        //      System.out.println("The value of Time for the value is: " + count);
//                        System.out.println("TIME Index of" + SceanrioName.get(testCaseTime.indexOf(p)) + "is: " + cdrData.indexOf(s));
//
//                    } else {
//
//                        //        System.out.println("Not matching");
//                    }
//                }
//
//            }
//
//        }
//
    }

    //Count of dates that are matching.
//    public ArrayList<Integer> DateExtractor(int i) {
//
//        String k = "";
////            System.out.println("Date Value in TC is :" + s);
//        for (String p : cdrData) {
//            k = p.replace("/", "");
//            //     System.out.println("Date Value is:" + k);
//            if (k.contains(testCaseDate.get(i))) {
//                System.out.println("DATE Index of" + SceanrioName.get(i) + "is: " + cdrData.indexOf(p));
//                cdrsceanriodate.add(cdrData.indexOf(p));
//            }
//        }
        // System.out.println("The value of CDR record count is:: " + count);
//        return cdrsceanriodate;
//    }
}


//        for (String p : testcase) {
//
//
//            String[] Times = p.split("(?<=\\G......)");
//            for (int i = 0; i < Times.length; i++) {
//                System.out.println("The value of Test case is: " + Times[i]);
//                if (Times[i].isEmpty()) {
//                    System.out.println("Datablank");
//                } else {
//                    SimpleDateFormat df = new SimpleDateFormat("HHmmss");
//                    Date date = df.parse(Times[i]);
//                    //Adding 2 mins to the time
//                    Calendar cal = Calendar.getInstance();
//                    cal.setTime(date);
//                    cal.add(Calendar.MINUTE, 2);
//                    String newTimeAfterMinAdd = df.format(cal.getTime());
//                    System.out.println("Addtime: " + newTimeAfterMinAdd);
//                }
//            }

