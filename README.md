# Trabalho-LogicaComputacional
# Algoritmo de Seleção Inteligente

Projeto desenvolvido para a disciplina de **Lógica para Computação**.

O objetivo do trabalho é criar um programa em Java que leia uma base de dados de candidatos em um arquivo `.csv` e aplique regras lógicas para selecionar ou classificar os candidatos.

---

## Tecnologias Utilizadas

* Java
* Arquivo CSV
* Programação Orientada a Objetos
* ArrayList
* Operadores lógicos
* Estruturas condicionais

---

## Estrutura do Projeto

```text
Trabalho-LogicaComputacional/
│
├── base_de_dados.csv
├── Candidato.java
└── Principal.java
```

---

## Sobre os Arquivos

### `base_de_dados.csv`

Arquivo que contém os dados dos candidatos.

Formato utilizado:

```csv
ID,Nome,Idade,Exp,Tecnico,Ingles
01,Alice Santos,19,1,Sim,Não
02,Bruno Alves,25,4,Não,Sim
```

---

### `Candidato.java`

Classe que representa cada candidato.

Ela possui os atributos:

* ID
* Nome
* Idade
* Experiência
* Curso técnico
* Inglês

Também possui o método construtor e os métodos `get`.

---

### `Principal.java`

Classe principal do projeto.

Ela faz as seguintes etapas:

1. Cria uma lista de candidatos com `ArrayList`;
2. Lê o arquivo `base_de_dados.csv`;
3. Separa os dados de cada linha;
4. Cria objetos do tipo `Candidato`;
5. Adiciona os candidatos na lista;
6. Aplica os desafios usando `if`, `else`, `&&` e `||`;
7. Exibe os resultados no console.

---

## Desafios Implementados

### Desafio 1

Exibe candidatos com maioridade legal **E** curso técnico completo.

```java
if (c.getIdade() >= 18 && c.temTecnico())
```

---

### Desafio 2

Exibe candidatos com pelo menos 3 anos de experiência **OU** inglês.

```java
if (c.getExperiencia() >= 3 || c.temIngles())
```

---

### Desafio 3

Exibe candidatos com menos de 25 anos que tenham curso técnico **OU** pelo menos 1 ano de experiência.

```java
if (c.getIdade() < 25 && (c.temTecnico() || c.getExperiencia() >= 1))
```

---

### Desafio 4

Classifica os candidatos como **SÊNIOR** ou **JÚNIOR**.

```java
if (c.getExperiencia() > 5) {
    System.out.println("Nome: " + c.getNome() + " | Categoria: SÊNIOR");
} else {
    System.out.println("Nome: " + c.getNome() + " | Categoria: JÚNIOR");
}
```

---

## Como Executar

No terminal, compile os arquivos:

```bash
javac Candidato.java Principal.java
```

Depois execute:

```bash
java Principal
```

O arquivo `base_de_dados.csv` deve estar na mesma pasta do projeto.

---

## Conceitos Aplicados

Neste projeto foram utilizados:

* Classe e objeto;
* Encapsulamento;
* Construtor;
* Métodos `get`;
* `ArrayList`;
* Leitura de arquivo CSV;
* Laços de repetição;
* Condicionais;
* Operadores lógicos `&&` e `||`.

---

## Conclusão

O projeto aplica conceitos de lógica computacional e programação em Java para automatizar a triagem de candidatos.

A partir da leitura de uma base de dados em CSV, o programa percorre os candidatos, aplica as regras de negócio e exibe no console os resultados de cada desafio.
