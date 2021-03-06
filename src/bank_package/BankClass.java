package bank_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankClass {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
//    	System.setProperty("webdriver.gecko.driver","C:\\selenium-java-4.2.1\\browsers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
    	
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.2.1\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
//		System.setProperty("webdriver.edge.driver","C:\\selenium-java-4.2.1\\browsers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();

    	String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}
