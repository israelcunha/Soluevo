package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import src.test.suport.*;

public class LoginPage {
   public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
   @FindBy(how = How.NAME, using = "//span[contains(.,'Soluevo')]")
   public WebElement txtHeader;
   @FindBy(how = How.NAME, using = "//input[contains(@name,'requisitante')]")
   public WebElement NomeReq;
   @FindBy(how = How.NAME, using = "//input[@name='customFields.email']")
   public WebElement Email;
   @FindBy(how = How.CLASSNAME, using = "//select[@class='pp-select']")
   public WebElement Criticidade;
   @FindBy(how = How.NAME, using = "//textarea[contains(@name,'priority')]")
   public WebElement Prioridade;
   @FindBy(how = How.NAME, using = "//input[contains(@name,'bug')]")
   public WebElement NomeBug
   @FindBy(how = How.NAME, using = "//textarea[@name='customFields.descreva_o_bug']")
   public WebElement DesBug
   @FindBy(how = How.XPATH, using = "//span[contains(.,'Solte arquivos para anexar, ou Busque')]")
   public WebElement Upload;
   @FindBy(how = How.NAME, using = "//button[contains(.,'Submit')]")
   public WebElement btnSubmit;
   @FindBy(how = How.XPATH, using = "//h2[contains(.,'Você brilhou! Obrigado pela participação do nosso processo de seleção de QA.")
   public WebElement Mensagem;
   @FindBy(how = How.XPATH, using = "//a[contains(.,'Preencher formulário novamente')]")
   public WebElement Sucesso;
   public void preencherCampos() throws InterruptedException {
        String textoElement = setUp.seletorQueryXpath(txtHeader)).getText();
        Assert.assertEquals("Soluevo", textoElement);
        setUp.seletorQueryXpath(NomeReq)).sendKeys("Israel");
        setUp.seletorQueryXpath(Email)).sendKeys("icunha@sl.com");
        setUp.seletorQueryXpath(Criticidade)).sendKeys("Top Priority");
        setUp.seletorQueryXpath(Prioridade)).sendKeys("Bug vital para o sistema");
        setUp.seletorQueryXpath(NomeBug)).sendKeys("Crash na Aplicação");
        setUp.seletorQueryXpath(DesBug)).sendKeys("Ao acessar  a tela a aplicação não responde ao usuario"));
        setUp.seletorQueryXpath(Upload)).sendKeys(@"C:\\Screen.jpg");
   }
   public void clickSubmit() throws InterruptedException {
        btnSubmit.click();
   }
   public void validarMensagem() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(Sucesso));
        String textoMensagem = setUp.seletorQueryXpath(Mensagem)).getText();
        Assert.assertEquals("Você brilhou! Obrigado pela participação do nosso processo de seleção de QA.", textoMensagem);
        Assert.assertTrue(textoMensagem, true);
   }
   public void setCriticidade() throws InterruptedException {
       setUp.seletorQueryXpath(Criticidade)).sendKeys("Top Priority");
   }
   public void DesMotivo() throws InterruptedException {
        setUp.seletorQueryXpath(Prioridade)).sendKeys("Crash na Aplicação");
   }
   Public void validaCampos() throws InterruptedException {
        String textoPrioridade = driver.findElement(By.xpath(Criticidade)).getText();
        assertEquals("Top Priority", textoPrioridade);
        String textoPrioridade = driver.findElement(By.xpath(Prioridade)).getText();
        assertEquals("Crash na Aplicação", textoPrioridade);
    }
}