package TestingFramework.StepDef;

import TestingFramework.PageClasses.RestApiTestClass;
import TestingFramework.PageClasses.TestClass;
import TestingFramework.Utility.WebBrowserDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;


public class MyStepdefs {

        public static WebDriver webDriver;
        public static ExtentTest testreport;
        public static ExtentReports report;
    /*static{
        System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");

    }*/
    public MyStepdefs() {

    }


        @Before
        public void init (Scenario scenario){
        testreport = report.startTest("Scenario Name : " + scenario.getName());
    }

        @After
        public void tearDown () {


    }


        @When("i launch google website")
        public void launchGoogle () {
        TestClass.launchGoogleWebsite(webDriver, testreport);
        // throw new io.cucumber.java.PendingException();
    }

        @When("i try a rest api automation")
        public void iTryARestApiAutomation () {
        RestApiTestClass.getAPIDetails();
    }

        @Then("i read values from config properties file")
        public void iReadValuesFromConfigPropertiesFile () {
        TestClass.readValueFromConfigFile(webDriver, testreport);
    }

        @Then("^i type \"(.*)\" inside search box$")
        public void typeQueryString (String queryString){
        TestClass.typeQueryString(webDriver, testreport, queryString);
    }

        @When("i launch Flipkart.com")
        public void iLaunchFlipkartCom () {
        TestClass.launchFlipkart(webDriver, testreport);
    }

        @Then("i should see Flipkart logo")
        public void iShouldSeeFlipkartLogo () {
        TestClass.checkFlipkartLogo(webDriver, testreport);
    }



}
