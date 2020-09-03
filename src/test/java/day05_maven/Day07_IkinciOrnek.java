package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day07_IkinciOrnek {

    @BeforeClass
    public static void setUp(){
        System.out.println("BeforeClass calisti.");
    }

    @Test
    public void test1(){
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.get("https://google.com");
        System.out.println("Test01 calisti.");
        //driver.quit();
    }

    @Test
    public void test2(){
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.get("https://facebook.com");
        System.out.println("Test02 calisti.");
        //driver.quit();
    }

    @Test
    public void test3(){
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.get("https://amazon.com");
        System.out.println("Test03 calisti.");
        //driver.quit();
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("AfterClass calisti");
    }

}
