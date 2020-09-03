package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_AssertionTekrar {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }
    @Test
    public void test1(){
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        Assert.assertEquals("Google", title);


    }
    @Test
    public void test2(){
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        Assert.assertEquals("Amazon",title);


    }
    @Test
    public void test3() {
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        boolean iceriyorMu = title.contains("Amazon");
        Assert.assertTrue(iceriyorMu);


    }

    @Test
    public void test4() {
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        boolean iceriyorMu = title.contains("Audi");
        Assert.assertFalse(iceriyorMu);


    }

    @Test
    public void test5() {
        driver.get("http://facebook.com");
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        boolean iceriyorMu = title.contains("In");
        Assert.assertTrue(iceriyorMu);
    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
