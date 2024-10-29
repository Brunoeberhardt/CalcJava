<h1 align=center>Calculadora Simples em Java</h1>

## Descrição do Projeto
Este projeto implementa uma calculadora simples em Java utilizando a biblioteca Swing para interface gráfica. A calculadora permite realizar operações básicas como soma, subtração, multiplicação e divisão, além de tratar erros como a tentativa de divisão por zero.

## Funcionalidades
- **Soma**: Adiciona dois números.
- **Subtração**: Subtrai o segundo número do primeiro.
- **Multiplicação**: Multiplica dois números.
- **Divisão**: Divide o primeiro número pelo segundo, com tratamento para divisão por zero.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada para desenvolver a calculadora.
- **Swing**: Biblioteca para a criação de interfaces gráficas.

## Estrutura do Código
O código é dividido em métodos que realizam operações específicas. A seguir, estão os principais componentes:

### Métodos Principais
- `public static double soma(float num1, float num2)`: Retorna a soma de dois números.
- `public static double subtracao(float num1, float num2)`: Retorna a subtração de dois números.
- `public static double multiplicacao(float num1, float num2)`: Retorna a multiplicação de dois números.
- `public static double divisao(float num1, float num2)`: Retorna a divisão do primeiro número pelo segundo. Retorna `NaN` se o divisor for zero.

## Lógica Principal
A lógica principal do programa utiliza um `switch` para escolher a operação a ser realizada, baseado na entrada do usuário. O programa continua em execução até que o usuário escolha encerrar.

## Uso
1. Compile e execute o programa.
2. Siga as instruções exibidas em janelas de diálogo para inserir números e escolher a operação desejada.
3. O resultado da operação será exibido em uma nova janela.

## Tratamento de Erros
O programa inclui tratamento para evitar a divisão por zero, exibindo uma mensagem de erro apropriada.

## Conclusão
Este projeto oferece uma introdução prática à programação em Java e ao uso de interfaces gráficas. O código pode ser expandido para incluir mais operações matemáticas ou melhorias na interface do usuário.

