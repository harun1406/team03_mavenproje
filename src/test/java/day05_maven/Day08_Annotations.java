package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_Annotations {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Before
    public void testtenOnce(){
        driver.get("http://ammazon.com");

    }

    @Test
    public void test1(){

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("drone" + Keys.ENTER);




    }

    @Test
    public void test2(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Business Laptop" + Keys.ENTER);
    }

    @Test
    public void test3(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Patek Philippe" + Keys.ENTER);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
    }

    @Test
    public void test4(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("mund nasen mask" + Keys.ENTER);
    }

    @After
    public void testtenSonra(){
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println(sonucSayisi.getText());
    }
    @AfterClass
    public static void teerDown(){
        driver.quit();

    }
}
