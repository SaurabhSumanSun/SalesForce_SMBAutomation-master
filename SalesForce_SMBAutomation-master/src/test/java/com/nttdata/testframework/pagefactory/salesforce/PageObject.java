/*
 * Added by Archana for Mobile Automation Testing
 */

package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import com.nttdata.testframework.utils.Excel;
import com.nttdata.testframework.utils.SystemDetails;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.security.auth.login.FailedLoginException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Boolean.TRUE;
import static java.lang.Thread.sleep;

public abstract class PageObject {
    static Logger logger = (Logger) LogManager.getLogger(PageObject.class);
    public static WebDriver driver;
    protected static WebDriverWait webDriverWait;
    public String automationTarget;
    private static String currentPin;
    private static String alternatePin;
    private static boolean pinInitRequired = TRUE;
    Robot robot = new Robot();
    private static SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    private static DataFormatter formatter = new DataFormatter();
    HashMap<String, Integer> uniqueMsgId = new HashMap<String, Integer>();
    @Autowired
    private Configuration configuration;
    @Autowired
    private CustomWebDriver customWebDriver;
    @Autowired
    readCDR readCDR;
    @Autowired
    readScenarioTemplate rc;

    @Autowired
    public PageObject(CustomWebDriver customWebDriver) throws AWTException {
        this.driver = (WebDriver) customWebDriver.getWebDriver();
        webDriverWait = new WebDriverWait(driver, 20);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
        automationTarget = SystemDetails.automationTarget;
    }
    int sendingCount=0;
    int recevingCount=0;
    String testResultServiceKey="";
    String testResultMsgID="";
    String testFailureReason="";

    //for RCS - Vishnu

    public ArrayList<String> StringArrayList(int row, int col, Excel excel) throws IOException {

        ArrayList<String> value = new ArrayList<String>();

        for (int i = 1; i < row; i++) {
            // System.out.println("LIne breaks removed"+excel.readExcelString(i,col).replaceAll("\\r\\n|\\r|\\n",","));


            //value.add(excel.readExcelString(i, col));
            value.add(excel.readExcelString(i, col));
        }

        return value;
    }

    // To Extract the data specific to a sceanrio from the cdr data
    public ArrayList<Integer> ScenarioDateExtract(int index) throws IOException {

        ArrayList<Integer> value = new ArrayList<Integer>();

        for (String p : readCDR.cdr) {
            String k = p.replace("/", "");
            if (k.contains(rc.dates.get(index))) {
                value.add(readCDR.cdr.indexOf(p));
            }
        }
        return value;
    }


    public ArrayList<Integer> ScenarioTimeExtract3(int index, String[] Dtime, String[] BufTime, int timer) {
        ArrayList<Integer> value = new ArrayList<Integer>();
        int timeTestCase, timeBuffer, timeCdr;



        //  System.out.println("The value of Test case is: " + Dtime[timer] + "And buffer time is: "+BufTime[i]);
        if (!Dtime[timer].isEmpty()) {
            //     System.out.println("Datablank");
            timeTestCase = Integer.parseInt(Dtime[timer]);
            timeBuffer = Integer.parseInt(BufTime[timer]);
//            System.out.println("Date Value in TC is :" + s);

        String g = "";
        for (String s : readCDR.cdr) {
            if (readCDR.cdr.indexOf(s) == 0) {
                continue;
            }
            Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                g = matcher.group();
                //   System.out.println("Matcher is: " + g);
            } else {
                System.out.println("");
            }
            //    System.out.println("String value is:"+s);
            g = g.replace(":", "");
            timeCdr = Integer.parseInt(g);
            if ((timeTestCase <= timeCdr) && (timeBuffer >= timeCdr)) {

                value.add(readCDR.cdr.indexOf(s));
                //      System.out.println("The value of Time for the value is: " + count);
                //  System.out.println("TIME Index of" + rc.SceanrioName.get(index) + "is: " + readCDR.cdr.indexOf(s));

            } else {

                //        System.out.println("Not matching");
            }
        }

    }


        return value;
    }


    //Date pull based on TIme match
    public ArrayList<Integer> ScenarioDateExtract2(int index, ArrayList<Integer> time) throws IOException {

        ArrayList<Integer> value = new ArrayList<Integer>();
        for (int i = 0; i < time.size(); i++) {
            // System.out.println("INDI: "+time.get(i));
            String k = readCDR.cdr.get(time.get(i)).replace("/", "");
            //  System.out.println("INDI2: "+rc.dates.get(index));
            if (k.contains(rc.dates.get(index))) {
                //  System.out.println("Adding"+readCDR.cdr.indexOf(readCDR.cdr.get(time.get(i))));
                value.add(readCDR.cdr.indexOf(readCDR.cdr.get(time.get(i))));
            }
        }
        return value;
    }

    public ArrayList<Integer> ScenarioImsiExtract(int index, ArrayList<Integer> data) throws IOException {

        ArrayList<Integer> value = new ArrayList<Integer>();
        String p = rc.IMSI.get(index);
        String[] Imsi = p.split("(?<=\\G...............)");
        for (int i = 0; i < Imsi.length; i++) {
//            System.out.println(Imsi[i]);
            if (Imsi[i].isEmpty()) {
                //System.out.println("Datablank");
            } else {
                for (int j = 0; j < data.size(); j++) {
                    String s = readCDR.cdr.get(data.get(j));
                    //   System.out.println("Extracted cdr index and value is :"+data.indexOf(j)+s+" IMSI ="+Imsi[i]);
                    //System.out.println("Date Value is:" + p);
                    if (s.contains(Imsi[i])) {
//                        System.out.println(readCDR.cdr.indexOf(s)+"*******");
                        value.add(readCDR.cdr.indexOf(s));
                    }
                }
            }
        }
        return value;
    }


    //Individual time wise per scenario data extractor:

    public String[] ScenarioTimeExtractor(int index, ArrayList<String> time) throws IOException {

        String p = time.get(index);

        String[] Dtime = p.split("(?<=\\G......)");

        return Dtime;

    }


    // To Extract the data specific to a sceanrio from the cdr data
    public ArrayList<Integer> ScenarioTimeExtract(int index) throws IOException {

        ArrayList<Integer> value = new ArrayList<Integer>();

        int timeTestCase, timeBuffer, timeCdr;
        String p = rc.Time.get(index);

        //  System.out.println("The initial value is:" + p);


        String[] Dtime = p.split("(?<=\\G......)");
        String[] BufTime = rc.BufferTime.get(index).split("(?<=\\G......)");


        for (int i = 0; i < Dtime.length; i++) {

            //  System.out.println("The value of Test case is: " + Dtime[i] + "And buffer time is: "+BufTime[i]);
            if (Dtime[i].isEmpty()) {
                //     System.out.println("Datablank");
                continue;
            } else {
                timeTestCase = Integer.parseInt(Dtime[i]);
                timeBuffer = Integer.parseInt(BufTime[i]);
//            System.out.println("Date Value in TC is :" + s);
            }
            String g = "";
            for (String s : readCDR.cdr) {
                if (readCDR.cdr.indexOf(s) == 0) {
                    continue;
                }
                Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {
                    g = matcher.group();
                    //   System.out.println("Matcher is: " + g);
                } else {
                    System.out.println("");
                }
                //    System.out.println("String value is:"+s);
                g = g.replace(":", "");
                timeCdr = Integer.parseInt(g);
                if ((timeTestCase < timeCdr) && (timeBuffer > timeCdr)) {

                    value.add(readCDR.cdr.indexOf(s));
                    //      System.out.println("The value of Time for the value is: " + count);
                    //  System.out.println("TIME Index of" + rc.SceanrioName.get(index) + "is: " + readCDR.cdr.indexOf(s));

                } else {

                    //        System.out.println("Not matching");
                }
            }

        }
        return value;
    }


    public static void clickElement(WebElement webElement) {
        try {
            logger.debug("clicking on " + webElement.getText());
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();

        } catch (Exception e) {
            logger.error(e.toString());
            Assert.fail("Element " + webElement.getText() + " is not present");
        }
    }

    public static void sendKeys(WebElement webElement, String keys) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            webElement.click();
            webElement.sendKeys(keys);
        } catch (Exception e) {
            logger.error(e.toString());
            Assert.fail("unable to enter text " + keys);
        }
    }

    public static void sendEnter(WebElement webElement, String keys) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            webElement.click();
            webElement.sendKeys(keys);
            webElement.sendKeys(Keys.ENTER);
            Thread.sleep(4000);
        } catch (Exception e) {
            logger.error(e.toString());
            Assert.fail("unable to enter text " + keys);
        }
    }

    public void clickOn(WebElement element) {
        try {
            logger.debug("Clicking on " + element.getText());
            waitFor(element);
            element.click();
        } catch (Exception e) {
            Assert.fail("Element is not present");
        }
    }

    public void waitFor(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForMobileElement(MobileElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scroll(WebElement element) throws InterruptedException {
        waitFor(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
    }

    //refined by Pankaj
    public void scrollTo(String parentResourceId, String elementWithClass, String elementWithText) {
        logger.debug("scrolling to " + elementWithText);
        String scrollableList = "uk.co.o2.android.myo2.enterprise:id/fragment_container_main_activity";
        String className = "android.view.View";
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"" + parentResourceId + "\")).getChildByText("
                        + "new UiSelector().className(\"" + elementWithClass + "\"), \"" + elementWithText + "\")"));

        //Perform the action on the element
        //element.click();
    }

    public void scrollToElement(String visibleText) {
        logger.debug("scrolling to " + visibleText);
        try {
            if (SystemDetails.getAutomationTarget().equalsIgnoreCase("ANDROID")) {
                ((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))");
                //((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().textContains("+visibleText+")).scrollIntoView(" + visibleText +")");
            } else {
                MobileElement searchElement = driver.findElement(By.name(visibleText));
                logger.debug("element with text [" + visibleText + "] visible? " + searchElement.isDisplayed());
                int i = 0; //temporary loop exit
                while (!searchElement.isDisplayed() && i < 6) {
                    scrollBySwipe_BottomUp();
                    logger.debug("element with text [" + visibleText + "] visible?" + searchElement.isDisplayed());
                    i++;
                    Thread.sleep(1000);
                }
                /*
                RemoteWebElement parent = (RemoteWebElement) driver.findElement(By.name(visibleText));
                //RemoteWebElement parent = (RemoteWebElement)driver.findElement(By.className("XCUIElementTypeTable"));
                String parentID = parent.getId();
                HashMap<String, String> scrollObject = new HashMap<String, String>();
                scrollObject.put("element", parentID);
                //scrollObject.put("toVisible", visibleText);
                scrollObject.put("direction", "down");
                scrollObject.put("name", visibleText);
                JavascriptExecutor js = ((JavascriptExecutor) driver);
                js.executeScript("mobile: scroll", scrollObject);
                Thread.sleep(2000);
                */
            }
        } catch (Exception e) {
            logger.error("unable to scroll..." + e.toString());
        }

    }

    // Scroll Page
    public void scrollBySwipe_BottomUp() throws InterruptedException {
        if (SystemDetails.getAutomationTarget().equalsIgnoreCase("ANDROID")) {
            //Android logic here
        } else {
            logger.debug("scrolling by screen swipe vertical bottom up .");
            Dimension dim = driver.manage().window().getSize();
            int width = dim.getWidth() / 2;
            Double ScreenHeightStart = dim.getHeight() * 0.80;
            int scrollS = ScreenHeightStart.intValue();
            Double ScreenHeightEnd = dim.getHeight() * 0.20;
            int scrollE = ScreenHeightEnd.intValue();
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(width, scrollS))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(width, scrollE))
                    .release().perform();
            sleep(1000);
        }
    }


    public String getTextOfWebElement(WebElement element) {
        waitFor(element);
        String text = element.getText();
        logger.info("Element text [" + text + "]");
        return text;
    }

    public String getTextOfMobileElement(MobileElement element) {
        String text;
        waitFor(element);
        text = element.getText();
        logger.info("element text is: " + text);
        //element.clear();
        return text;

    }

    public void printList(List<WebElement> list) {
        logger.info("size of the list is " + list.size());
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                logger.info(list.get(i).getText());
            }
        } else {
            logger.info("elements are not present");
        }
    }

    public void printListMobile(List<MobileElement> list) {
        logger.info("size of the list is " + list.size());
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                logger.info(list.get(i).getText());
            }
        } else {
            logger.info("elements are not present");
        }
    }

    public void navigateBack() {
        try {
            driver.navigate().back();
            logger.info("back button clicked...");
            pause(5000);
        } catch (Exception e) {
            logger.error(e.toString());
        }
    }

    public void navigateUp() {
        logger.debug("navigating back");
        List<MobileElement> list = driver.findElements(By.xpath("//*[@content-desc='Navigate up']"));
        if (list.size() > 0) {
            list.get(0).click();
            logger.debug("back button clicked...");
        } else {
            logger.debug("unable to navigate back");
        }
        pause(5000);
    }

    public void isElementDisplayed(WebElement element) {
        waitFor(element);
        if (element.isDisplayed()) {
            logger.info(element.getText() + " is displayed ");
        } else {
            Assert.fail("element is not displayed");
        }
    }

    public void isMobileElementDisplayed(MobileElement element) {
        waitFor(element);
        if (element.isDisplayed()) {
            logger.info(element.getText() + " is displayed ");
        } else {
            Assert.fail("element is not displayed");
        }
    }

    public void enterText(WebElement element, String value) {
        waitFor(element);
        element.sendKeys(value);
    }

    public String getTitleOfScreen() {
        String title = driver.getTitle();
        logger.info("title of the screen is " + title);
        return title;
    }

    public void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            logger.error(e.toString());
        }
    }

    public void setValue(MobileElement element, String value) {
        element.setValue(value);
    }

    //Get all available contexts
    public void getAllContexts() {
        Set<String> contextNames = ((AppiumDriver) driver).getContextHandles();
        logger.debug("Available contexts >> " + contextNames);
    }

    public String getPresentContext() {
        Set<String> contextNames = ((AppiumDriver) driver).getContextHandles();
        return getLastElement(contextNames).toString();
    }

    public Object getLastElement(final Collection c) {
        final Iterator itr = c.iterator();
        Object lastElement = itr.next();
        while (itr.hasNext()) {
            lastElement = itr.next();
        }
        return lastElement;
    }


    public static Integer[] getDigits(int num) {
        List<Integer> digits = new ArrayList<Integer>();
        collectDigits(num, digits);
        return digits.toArray(new Integer[]{});
    }

    private static void collectDigits(int num, List<Integer> digits) {
        if (num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }

    public String getPageTitle() {
        logger.debug("pageTitle");
        return "testpage";
    }

    public static void dropDown(WebElement webElement, String value) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            Select drp = new Select(webElement);
            drp.selectByVisibleText(value);

        } catch (Exception e) {
            logger.error(e.toString());
            Assert.fail("Element " + webElement.getText() + " is not present");
        }

    }

    public static void dropDownIndex(WebElement webElement, int index) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
        Select drp = new Select(webElement);
        drp.selectByIndex(index);
    }

    public static void takeScreenShot(String screenShotName) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        DateFormat dateFormat1 = new SimpleDateFormat("ddMMyyyy HHmmss");
        Date date2 = new Date();
        String dateTime = dateFormat1.format(date2);
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("target/testResult/screenshots/" + date1 + "/" + screenShotName + dateTime + ".JPEG");
        FileUtils.copyFile(SrcFile, DestFile);
    }

    public static void clearElement(WebElement webElement) {
        try {
            logger.debug("clearing on " + webElement.getText());
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.clear();
        } catch (Exception e) {
            logger.error(e.toString());
            Assert.fail("Element " + webElement.getText() + " is not present");
        }
    }

    public void TabKey() throws InterruptedException, AWTException {
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
    }

    public void EnterKey() throws InterruptedException, AWTException {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    public void CtrlplusV() throws InterruptedException, AWTException {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public ArrayList<String> extractNumbers(ArrayList<String> stringValue) {

        ArrayList<String> s2 = new ArrayList<String>();
        for (String s : stringValue) {
            s2.add(s.replaceAll("[^0-9]", ""));

        }

        return s2;

    }

    public ArrayList<String> extractNumbersDate(ArrayList<String> stringValue) throws ParseException {

        ArrayList<String> s2 = new ArrayList<String>();
        for (String s : stringValue) {

//            System.out.println(s);
//            System.out.println(s.trim().equalsIgnoreCase("N/A"));
//            System.out.println(s.contains("N/A"));

            if ((s.trim().equalsIgnoreCase("N/A") || s.isEmpty())) {
                s = "";
                s2.add(s);
                //  System.out.println("added blank for: " + s);
            } else {
                DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
                Date convertedDate = (Date) formatter.parse(s);
//                System.out.println("Date from dd-MMM-yy String in Java : " + convertedDate);
//
//                System.out.println("Date is:" + convertedDate);
                SimpleDateFormat in = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
                Date date = in.parse(String.valueOf(convertedDate));
                SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
                String newdate = out.format(date);
                s = newdate;
                //System.out.println(newdate);
                s2.add(s.replaceAll("[^0-9]", ""));

            }
        }
        return s2;

    }

    public ArrayList<String> extractTime(ArrayList<String> stringValue) {

        ArrayList<String> s2 = new ArrayList<String>();
        for (String s : stringValue) {
            // s= s.replace(String.valueOf(s.indexOf(":")),"");
            //System.out.println(s+"**********");
            s2.add(s.replaceAll("[^[^0-9][^0-9]:[^0-9][^0-9]:[^0-9][^0-9]]", ""));

        }

        return s2;

    }

    public ArrayList<String> extractTimebuffer(ArrayList<String> stringValue) throws ParseException {
        ArrayList<String> s2 = new ArrayList<String>();
        String temp = "";
        for (String p : stringValue) {


            String[] Times = p.split("(?<=\\G......)");
            temp = "";
            for (int i = 0; i < Times.length; i++) {

                //  System.out.println("The value of Test case is: " + Times[i]);
                if (Times[i].isEmpty()) {
                    // System.out.println("Datablank");
                    temp += Times[i];
                } else {
                    SimpleDateFormat df = new SimpleDateFormat("HHmmss");
                    Date date = df.parse(Times[i]);
                    //Adding 2 mins to the time
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    cal.add(Calendar.MINUTE, 2);
                    String newTimeAfterMinAdd = df.format(cal.getTime());
                    //System.out.println("Addtime: " + newTimeAfterMinAdd);
                    temp += newTimeAfterMinAdd;

                }
            }
            s2.add(temp);


        }
        return s2;
    }


    //Scenario Validator

    public void csvValidator(String scenarioName,ArrayList<Integer>rowNumbers,int cdrTimeCount) throws IOException {
        sendingCount=0;
        recevingCount=0;
        testResultServiceKey="";
        testResultMsgID="";
        testFailureReason="";
        int k=0;
        String Fpath = "src/test/resources/excelFiles/CdrFile.csv";
        String line;
        ArrayList <String> date= new ArrayList<String>();
        ArrayList <String> time= new ArrayList<String>();
        ArrayList <String> imsi= new ArrayList<String>();
        ArrayList<String> serviceType=new ArrayList<>();
        ArrayList<String> msgId=new ArrayList<>();
        ArrayList<String> serviceKey=new ArrayList<>();
        File file = new File(Fpath);
        BufferedReader bufRdr;
        bufRdr = new BufferedReader(new FileReader(file));
        while ((line = bufRdr.readLine()) != null) {
            String[] cell = line.split(",");
            date.add(cell[2]);
            time.add(cell[3]);
            imsi.add(cell[49]);
            serviceType.add(cell[11]);
            msgId.add(cell[104]);
            serviceKey.add(cell[16]);
        }


        if(scenarioName.equals("RCSCX-1")||scenarioName.equals("RCSCX-2")||scenarioName.equals("RCSCX-4")||scenarioName.equals("RCSCX-18")||scenarioName.equals("RCSCX-20")||scenarioName.equals("RCSCX-21")||scenarioName.equals("RCSCX-3") ||scenarioName.equals("RCSCX-19")||scenarioName.equals("RCSCX-10")||scenarioName.equals("RCSCX-8")
        ||scenarioName.equals("A2P_25")||scenarioName.equals("A2P_26")||scenarioName.equals("A2P_27")||scenarioName.equals("A2P_28")||scenarioName.equals("A2P_29")||scenarioName.equals("A2P_30")||scenarioName.equals("A2P_31")||scenarioName.equals("A2P_32")||scenarioName.equals("A2P_33")||scenarioName.equals("A2P_34")||scenarioName.equals("A2P_35")||scenarioName.equals("A2P_36")||scenarioName.equals("A2P_37") ||scenarioName.equals("A2P_38")||scenarioName.equals("A2P_39")||scenarioName.equals("A2P_40")||scenarioName.equals("A2P_41")||scenarioName.equals("A2P_42")||scenarioName.equals("A2P_43")||scenarioName.equals("A2P_46")
                ||scenarioName.equals("P2A_44")||scenarioName.equals("P2A_47")||scenarioName.equals("P2A _48")||scenarioName.equals("P2A _49")||scenarioName.equals("RCSCX-7")||scenarioName.equals("RCSCX-22")||scenarioName.equals("RCSCX-23")||scenarioName.equals("RCSCX-11")||scenarioName.equals("RCSCX-9"))
        {
          //System.out.println(rowNumbers);
           for(int i: rowNumbers)
            {
                 getServiceTypeCount(i,serviceType);
                 getServiceKey(i,serviceKey,scenarioName);
                 getMsgID(i,msgId,rowNumbers);
                 k=k+1;
            }


                if(sendingCount==cdrTimeCount&&recevingCount==cdrTimeCount&&testResultServiceKey.equals("Passed")&&uniqueMsgId.size()==cdrTimeCount)
                {
                    System.out.println(scenarioName+" is Passed");
                }

                else if(scenarioName.contains("A2P_")&&sendingCount==0&&recevingCount==cdrTimeCount&&testResultServiceKey.equals("Passed")&&uniqueMsgId.size()==cdrTimeCount)
                {
                    System.out.println(scenarioName+" is Passed");
                }


                else if((scenarioName.contains("P2A_")||(scenarioName.contains("P2A _")))&&sendingCount==cdrTimeCount&&recevingCount==0&&testResultServiceKey.equals("Passed")&&uniqueMsgId.size()==cdrTimeCount)
                {
                    System.out.println(scenarioName+" is Passed");
                }

                else if(sendingCount==(cdrTimeCount*3)&&recevingCount==(cdrTimeCount*2)&&testResultServiceKey.equals("Passed")&&uniqueMsgId.size()==cdrTimeCount)
                {
                    System.out.println(scenarioName+" is Passed");
                }


                else
                {

                    System.out.println(scenarioName+" is Failed");

                    if(k==0)
                    {
                        testFailureReason=testFailureReason+ "There is no matching CDR found";
                    }
                    else {
                        testFailureReason = testFailureReason + "Count of Service type (sending/receiving) or Msg ID is not as expected.  Please verify the CDR";
                    }
                    System.out.println(testFailureReason);



                }
                uniqueMsgId.clear();

        }

    }


    public void getServiceTypeCount(int i,ArrayList<String>serviceType)
    {

        if(serviceType.get(i).equals("sending"))
        {
            sendingCount=sendingCount+1;
        }
        else if (serviceType.get(i).equals("receiving"))
        {
            recevingCount=recevingCount+1;
        }


    }

    public void getServiceKey(int i,ArrayList<String>serviceKey,String scenarioName)
    {

        if((!scenarioName.equals("RCSCX-10")&&!scenarioName.equals("RCSCX-8")&& serviceKey.get(i).equals("IMCHAT"))||(scenarioName.contains("A2P_")&&serviceKey.get(i).equals("IMCHAT"))||((scenarioName.contains("P2A_")||(scenarioName.contains("P2A _")))&&serviceKey.get(i).equals("IMCHAT")))
        {
            testResultServiceKey="Passed";
        }
        else if(scenarioName.equals("RCSCX-10")&&!scenarioName.equals("RCSCX-8")&& serviceKey.get(i).equals("httpFileTransfer"))
        {
            testResultServiceKey="Passed";
        }
        else if((scenarioName.equals("RCSCX-8")||scenarioName.equals("P2A _49"))&&serviceKey.get(i).equals("PushLocation"))
        {
            testResultServiceKey="Passed";
        }
        else if ((scenarioName.equals("RCSCX-7")||scenarioName.equals("RCSCX-22")||scenarioName.equals("RCSCX-23"))&&serviceKey.get(i).equals("GroupChat"))
        {

            testResultServiceKey="Passed";
        }

        else if ((scenarioName.equals("RCSCX-11"))&&serviceKey.get(i).equals("GrphttpFileTransfer"))
        {

            testResultServiceKey="Passed";
        }

        else if ((scenarioName.equals("RCSCX-9"))&&serviceKey.get(i).equals("GroupPushLocation"))
        {

            testResultServiceKey="Passed";
        }

        else
        {

            testResultServiceKey="Failed";
            testFailureReason=testFailureReason+" Service Key is incorrect for this scenario";
        }

    }

public void getMsgID(int i,ArrayList<String>msgId,ArrayList<Integer>rowNumbers)
{
    if(uniqueMsgId.containsKey(msgId.get(i))==true)
    {

    }
    else
    {
       uniqueMsgId.put(msgId.get(i), Collections.frequency(msgId, msgId.get(i)));

    }


}

}



