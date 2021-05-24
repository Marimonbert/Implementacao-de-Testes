Feature: Alugar filme
Como um usuário 
Eu quero cadastrar o aluguel de um filme, 
para controlar preços e datas de entrega

Scenario: Deve alugar um filme com sucesso
Given um filme com estoque de 2 unidades
And que o preco do aluguel seja R$ 3 
When alugar
Then o preco do aluguel sera R$ 3
And a data de entrega serah no dia seguinte
And o estoque do filme serah 1 unidade