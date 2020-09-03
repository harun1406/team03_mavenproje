package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day07_BeforeAfterMethod {

    @BeforeClass
    public static void setUp(){
        System.out.println("BeforeClass calisti.");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }

    @Test
    public void test1(){
        System.out.println("Test01 calisti");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("Test02 calisti");
    }

    @Test
    public void test3(){
        System.out.println("Test03 calisti");
    }

    @Before
    public void methoddanOnce(){
        System.out.println("methoddanOnce calisti");
    }

    @After
    public void methoddanSonra(){
        System.out.println("methoddanSonra Calisti");
    }



}