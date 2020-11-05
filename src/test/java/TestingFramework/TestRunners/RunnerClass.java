package TestingFramework.TestRunners;

import TestingFramework.StepDef.MyStepdefs;
import TestingFramework.Utility.TempReportUtil;
import TestingFramework.Utility.WebBrowserDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles/StoryFile.feature",
        glue = "classpath:TestingFramework",
        plugin = { "pretty", "html:target/cucumber-reports"},
        monochrome = true

)

public class RunnerClass{
    public static ExtentTest testreport;
    public static ExtentReports report;
    @BeforeClass
    public static void bef(){

        WebBrowserDriver obj = WebBrowserDriver.getInstance();
        MyStepdefs.webDriver = obj.webDriver;
        MyStepdefs.webDriver.manage().window().fullscreen();
        report = new ExtentReports(System.getProperty("user.dir") + "\\Execution_Reports\\ExtentReportResults.html");
        MyStepdefs.report=report;
    }

    @AfterClass
    public static void af(){
        WebBrowserDriver obj = WebBrowserDriver.getInstance();
        obj.webDriver.quit();
        report.endTest(MyStepdefs.testreport);
        report.flush();
        TempReportUtil.show();
    }

}



