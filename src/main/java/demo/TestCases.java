package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);
      //  WebDriver driver = new ChromeDriver();

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        driver.get("https://leetcode.com/");
        driver.getCurrentUrl().contains("leetcode");
        System.out.println("end Test case: testCase01");
    }

    public void testCase02(){

        System.out.println("Start Test case: testCase02");
        // Open LeetCode homepage
        //driver.get("https://leetcode.com/");

        //Click on the "Questions" link
       WebElement view_Questions= driver.findElement(By.linkText("View Questions"));
       view_Questions.click();

        //Verify that you are on the problem set page
        System.out.println(driver.getCurrentUrl().contains("problemset"));

        //Retrieve the details of the first 5 questions
        // List<WebElement> questions=driver.findElements(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div/div[2]/div"));
        // int count=0;
        // for(WebElement question :questions){
        //     if (count < 5) {
        //         String output = question.getText();
        //         System.out.println(output);
        //         count++;
        //     } else {
        //         break; // Break out of the loop once completed 5 questions
        //     }
        // }
        try{
        WebElement question1=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/a"));        
        question1.getText();
        question1.click();
       WebElement element= driver.findElement(By.xpath("//a[@href='/problems/two-sum/']"));
        String pageTitle = element.getText();
        System.out.println("Page Title of Question1: " + pageTitle);
        driver.navigate().back();
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex) {
            // Handle the stale element reference exception
            System.out.println("StaleElementReferenceException occurred. Retrying...");
            WebElement question1=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/a"));        
            question1.getText();
            question1.click();
           WebElement element= driver.findElement(By.xpath("//a[@href='/problems/two-sum/']"));
            String pageTitle = element.getText();
            System.out.println("Page Title of Question1: " + pageTitle);
            driver.navigate().back();
        }
        try{
        WebElement question2=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div/div/a"));        
        question2.getText();
        question2.click();
       WebElement element2= driver.findElement(By.xpath("//a[@href='/problems/add-two-numbers/']"));
        String pageTitle2 = element2.getText();
        System.out.println("Page Title of Question1: " + pageTitle2);
        driver.navigate().back();
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex) {
            // Handle the stale element reference exception
            System.out.println("StaleElementReferenceException occurred. Retrying...");
            WebElement question2=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div/div/a"));        
        question2.getText();
        question2.click();
       WebElement element2= driver.findElement(By.xpath("//a[@href='/problems/add-two-numbers/']"));
        String pageTitle2 = element2.getText();
        System.out.println("Page Title of Question1: " + pageTitle2);
        driver.navigate().back();
           
        }

        

        try{
        WebElement question3=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[4]/div[2]/div/div/div/div/a"));        
        question3.getText();
        question3.click();
       WebElement element3= driver.findElement(By.xpath("//a[@href='/problems/longest-substring-without-repeating-characters/']"));
        String pageTitle3 = element3.getText();
        System.out.println("Page Title of Question1: " + pageTitle3);
        driver.navigate().back();
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex) {
            // Handle the stale element reference exception
            System.out.println("StaleElementReferenceException occurred. Retrying...");
            WebElement question3=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[4]/div[2]/div/div/div/div/a"));        
        question3.getText();
        question3.click();
       WebElement element3= driver.findElement(By.xpath("//a[@href='/problems/longest-substring-without-repeating-characters/']"));
        String pageTitle3 = element3.getText();
        System.out.println("Page Title of Question1: " + pageTitle3);
        driver.navigate().back();
           
        }

        try{
        WebElement question4=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[5]/div[2]/div/div/div/div/a"));        
        question4.getText();
        question4.click();
       WebElement element4= driver.findElement(By.xpath("//a[@href='/problems/median-of-two-sorted-arrays/']"));
        String pageTitle4 = element4.getText();
        System.out.println("Page Title of Question1: " + pageTitle4);
        driver.navigate().back();
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex) {
            // Handle the stale element reference exception
            System.out.println("StaleElementReferenceException occurred. Retrying...");
            WebElement question4=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[5]/div[2]/div/div/div/div/a"));        
            question4.getText();
            question4.click();
           WebElement element4= driver.findElement(By.xpath("//a[@href='/problems/median-of-two-sorted-arrays/']"));
            String pageTitle4 = element4.getText();
            System.out.println("Page Title of Question1: " + pageTitle4);
            driver.navigate().back();
           
        }
        try{
        WebElement question5=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[6]/div[2]/div/div/div/div/a"));        
        question5.getText();
        question5.click();
       WebElement element5= driver.findElement(By.xpath("//a[@href='/problems/longest-palindromic-substring/']"));
        String pageTitle5 = element5.getText();
        System.out.println("Page Title of Question1: " + pageTitle5);
        driver.navigate().back();
        }
        catch (org.openqa.selenium.StaleElementReferenceException ex) {
            // Handle the stale element reference exception
            System.out.println("StaleElementReferenceException occurred. Retrying...");
            WebElement question5=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[6]/div[2]/div/div/div/div/a"));        
        question5.getText();
        question5.click();
       WebElement element5= driver.findElement(By.xpath("//a[@href='/problems/longest-palindromic-substring/']"));
        String pageTitle5 = element5.getText();
        System.out.println("Page Title of Question1: " + pageTitle5);
        driver.navigate().back();
           
        }

        System.out.println("end Test case: testCase02");
    }

    public void testCase03(){
        System.out.println("Start Test case: testCase03");

        // Open LeetCode homepage
        //driver.get("https://leetcode.com/");

        //Click on the "Questions" link
       // driver.findElement(By.linkText("View Questions")).click();
       try {
       WebElement question1=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/a"));        
       question1.getText();
       question1.click();
       System.out.println(driver.getCurrentUrl().contains("two-sum"));
       }
       catch (org.openqa.selenium.StaleElementReferenceException ex) {
        // Handle the stale element reference exception
        System.out.println("StaleElementReferenceException occurred. Retrying...");
        WebElement question1=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/a"));        
       question1.getText();
       question1.click();
       System.out.println(driver.getCurrentUrl().contains("two-sum"));
       System.out.println("end Test case: testCase03");
       
    }

    }

    public void testCase04() throws InterruptedException{
        System.out.println("Start Test case: testCase04");
        WebElement submissionTab=driver.findElement(By.xpath("//*[@id='submissions_tab']/div[2]/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submissionTab);

        submissionTab.click();

        Thread.sleep(10000);

        WebElement registerOrSignInMessage = driver.findElement(By.xpath("//*[text()='Register or Sign In' and @href='/accounts/login/?next=%2Fproblems%2Ftwo-sum%2Fsubmissions%2F']"));
        String actualMessage = registerOrSignInMessage.getText();
        String expectedMessage = "Register or Sign In";

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Test Passed: The message \"" + expectedMessage + "\" is displayed when you click on the submissions tab.");
        } else {
            System.out.println("Test Failed: The message \"" + expectedMessage + "\" is not displayed when you click on the submissions tab. Actual message: " + actualMessage);
        }

        System.out.println("end Test case: testCase04");

    }


}
