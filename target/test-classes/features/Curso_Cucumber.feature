Feature: Contador
  como um aluno 
  eu quero aprender a utilizar Cucumber 
  para que eu possa automatizar critérios de aceitação

  Scenario: Deve incrementar contador
    Given que o valor do contador e 15
    When eu incrementar 3
    Then o valor final sera 18

  Scenario: Deve incrementar contador
    Given que o valor do contador e 123
    When eu incrementar 35
    Then o valor final sera 158

  Scenario: Calcular prazo de entrega
    Given o praso eh no dia 20/04/2021
    When se a entrega atrasar 02 dias
    Then a entrega serah efetuada no dia 22/04/2021

  Scenario: Calcular prazo de entrega da China
    Given o praso eh no dia 20/04/2021
    When se a entrega atrasar 2 meses
    Then a entrega serah efetuada no dia 20/06/2021
    

  Scenario: Deve criar steps genéricos para estes passos
    Given que o ticket eh AF345
   	And que o valor da passagem eh R$ 230,45
    And que o nome do passageiro eh "Fulano da Silva"
    And que o telefone do passageiro eh 9999-9999
    When criar steps
    Then o teste vai funcionar	
    

  Scenario: Deve reaproveitar os steps "Dado" do cenário anterior
    Given que o ticket eh AB167
    Given que o ticket especial eh AB167
    Given que o valor da passagem eh R$ 110,23
    Given que o nome do passageiro eh "Cicrano de Oliveira"
    Given que o telefone do passageiro eh 9888-8888

  Scenario: Deve negar todos os steps "Given" dos cenários anteriores
    Given que o ticket eh CD123
    Given que o ticket eh AG1234
    Given que o valor da passagem eh R$ 1.1345,56
    Given que o nome do passageiro eh "Beltrano Souza Matos de Alcântara Azevedo"
    Given que o telefone do passageiro eh 1234-5678
    Given que o telefone do passageiro eh 999-2223
