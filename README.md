# Sistema de Funcionários em Java
## Sobre o projeto
Este projeto-teste foi criado com o intuito de gerenciar funcionários e departamentos, possibilitando a contratação de funcionários, aplicação de reajustes salariais, modificação e inserção de dados, cálculo da folha salarial e listagem dos funcionários.

## Preparando o código
Para realizar a instalação e deixar o código pronto para uso, clone o repositório:  

`git clone https://github.com/Miguelgsd/SistemaFuncionarios.git`  

Isso criará uma pasta com os arquivos do projeto, armazenados no repositório.

<hr>

Para que o código funcione, é necessário possuir o Java previamente instalado. Caso não possua, instale [aqui](https://www.oracle.com/br/java/technologies/downloads/).

Como o projeto está em código-fonte (.java), precisamos do bytecode (.class). Para isso, compile o arquivo com:  

`javac TesteSistema.java`

Em seguida, execute o bytecode com:  

`java TesteSistema`

## Funcionamento
O sistema criará um departamento (Tecnologia da Informação) e alguns funcionários, utilizando construtores parametrizados e default. Além disso, utilizará métodos das outras classes para a demonstração do funcionamento.  

## Classes
O sistema possui 3 classes, com as seguintes funções:  

<hr>

### Funcionario
Classe criada para dar atributos e métodos aos funcionários que serão atribuídos ao departamento criado. Possui um construtor parametrizado e um construtor default.  

**Atributos:**  
- String nome;
- String cpf;
- String cargo;
- double salario;
- boolean ativo.

**Métodos:**  
- getNome() - retorna o nome do funcionário;
- getCpf() - retorna o CPF do funcionário;
- getCargo() - retorna o cargo do funcionário;
- getSalario() - retorna o salário do funcionário;
- getAtivo() - retorna se o funcionário está ativo ou inativo;
- alterarDados() - altera os dados de um determinado funcionário;
- aplicarReajuste() - aplica um percentual de reajuste ao salário do funcionário;
- demitir() - demite o funcionário, tornando-o inativo;
- exibirdados() - exibe os dados do funcionário, além de fazer uma verificação de sua atividade.

<hr>

### Departamento
Classe responsável por criar e gerenciar um departamento. Possui um construtor default.  

**Atributos:**  
- String nomeDepartamento;
- Funcionario[] arrayFunc;
- int i;

**Métodos:**  
- adicionarFuncionario() - adiciona um funcionário ao array do departamento, caso ainda haja espaço disponível;
- listarFuncionarios() - percorre todo o array do departamento, checando se não há índice nulo. Após isso, exibe as informações de cada funcionário do departamento;
- calcularFolhaSalarial() - percorre todo o array do departamento, analisando quais funcionários estão ativos, somando o salário desses e retornando o valor.
