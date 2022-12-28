# language: pt
#encoding: utf-8

Funcionalidade: Apontar bug de criticidade Top Priority

  Cenario: Cadastrar de Bug com sucesso
    Dado que o usuario esteja na tela de cadastro
    Quando preencher o formulário com todos os campos obrigatórios
    E clicar no botão Submit
    Então o sistema deve apresentar a mensagem Você brilhou! Obrigado pela participação do nosso processo de seleção de QA.