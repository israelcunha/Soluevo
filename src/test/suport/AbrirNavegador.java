import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setUP {
    public static WebDriver driver;
    public static void OpenBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Soluevo\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(@"C:\\Screen.jpg"));
    }
    public static void CloseBrowser() {
        driver.close();
        driver = null;
    }
    public static WebElement seletorQueryXpath(String seletor) {
        return setUP.driver.findElement(By.xpath(seletor));
    }
}