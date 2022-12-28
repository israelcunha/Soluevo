package steps;

import src.test.suport.*;
import src.test.pages.*;
public class mainSteps {

    @Dado("que o usuario esteja na tela de cadastro"){
    public void acessoSite() throws InterruptedException {
        setUp.OpenBrowser("https://app.pipefy.com/public/form/Lid-wF");
    }

   @Quando("preencher o formulário com todos os campos obrigatórios"){
        LoginPage.preencherCampos();
   }

    @E("clicar no botão Submit"){
        LoginPage.clickSubmit();
        }

    @Entao("o sistema deve apresentar a mensagem Você brilhou! Obrigado pela participação do nosso processo de seleção de QA."){
        LoginPage.validarMensagem();
    }

    @Quando ("apontar bug de criticidade Top Priority"){
        LoginPage.setCriticidade();
    }

    @E ("o usuario informar o motivo da classificação no campo"){
        LoginPage.DesMotivo();
    }

    @Então ("a os campos foram preenchidos com sucesso"){
        LoginPage.validaCampos();
    }
}
