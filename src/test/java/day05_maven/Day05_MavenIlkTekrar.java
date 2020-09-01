package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day05_MavenIlkTekrar {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); //System.setProperty() ayni islemi

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");

        //<a aria-label="Best Sellers in Kitchen - See more" class="a-link-normal"
        // href="https://www.amazon.com/b?node=18505439011&amp;pf_rd_r=N5C85JG9Z03H6WFSD1PH&amp;pf_rd_p=000fa563-9003-47fd-b569-486d528b7413&amp;pd_rd_r=6b6c3971-9904-4606-bb24-1117c97832ea&amp;pd_rd_w=sVkSR&amp;pd_rd_wg=bvIHq&amp;ref_=pd_gw_unk">See more</a>
        WebElement bestSellerLink= driver.findElement(By.xpath("//a[@aria-label='Best Sellers in Kitchen - See more']"));
        bestSellerLink.click();
           /*
           <span class="a-color-state a-text-bold">Best Sellers in Kitchen</span>
            */
        WebElement urunAdedi=driver.findElement(By.id("s-result-info-bar-content"));
        System.out.println(urunAdedi.getText());
        List<WebElement> list= driver.findElements(By.xpath("//h2[@class='a-size-medium s-inline s-access-title a-text-normal']"));

        for (WebElement w:list){
            System.out.println(w.getText());

        }
        System.out.println("sayfadaki urun sayisi"+list.size());
        System.out.println(list.get(6));

    }
}