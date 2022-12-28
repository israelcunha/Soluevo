Cenarios 1 : Cadastrar de Bug com sucesso
Dado que o usuario esteja na tela de cadastro
Quando preencher o formulário com todos os campos obrigatórios
E clicar no botão Submit
Então o sistema deve apresentar a mensagem Você brilhou! Obrigado pela participação do nosso processo de seleção de QA.

Cenario 2 : Justificar uma criticidade
Dado que o usuario esteja na tela de cadastro
Quando apontar bug de criticidade Top Priority
E o usuario informar o motivo da classificação no campo
Então a os campos foram preenchidos com sucesso

-----------------------------------------------------------------------------------------------------------
Critério de Aceitação

* Garantir que e furmulário seja preenchido considerando que os campos Nome de requisitante, E-mail, Criticidade,
Motivos do Bug, Qual é o Bug e anexar evidncia sejam todos obrigatórios.

* Garantir que quando o cadastro for finalizado o usuario será direcionado para outra página com Mensagem de sucesso.