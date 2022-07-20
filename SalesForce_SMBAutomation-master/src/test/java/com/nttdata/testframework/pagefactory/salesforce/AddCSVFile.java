package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

@Component
public class AddCSVFile extends PageObject{

    public AddCSVFile(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "//button[@class='btn-basic dropdown-arrow icon-toggle-expanded ng-scope']")
    public static WebElement downArrow;
    @FindBy(how= How.XPATH, using = "//button[text()=' CCW Estimate & Deal Id ']")
    public static WebElement CCWEstimate;
    @FindBy(how= How.XPATH, using = "//input[@value='Edit']")
    public static WebElement edit;
    @FindBy(how= How.XPATH, using = "//input[@id='j_id0:theform:j_id50']")
    public static WebElement chooseFile;
    @FindBy(how= How.XPATH, using = "//input[@value='Save']")
    public static WebElement savebtn;

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    public void uploadFile(String fileLocation) throws InterruptedException {

        String parentwindow= driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        for (String child:allwindows)
        {
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
                System.out.println("Inside Child");
            }
        }
        clickElement(downArrow);
        Thread.sleep(1000);
        clickElement(CCWEstimate);
        Thread.sleep(2000);
        try {
            setClipboardData(fileLocation);
            Thread.sleep(10000);
            TabKey();EnterKey();
            Thread.sleep(3000);
            TabKey();TabKey();TabKey();TabKey();EnterKey();
            System.out.println("select doc clicked");
            Thread.sleep(2000);
            CtrlplusV();
            Thread.sleep(3000);
            EnterKey();
            Thread.sleep(5000);
            logger.debug("CSV File added Successfully");
            takeScreenShot("CSV File added Successfully");
            TabKey();TabKey();TabKey();TabKey();TabKey();TabKey();TabKey();TabKey();TabKey();EnterKey(); //save button
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        Thread.sleep(5000);
    }
}
