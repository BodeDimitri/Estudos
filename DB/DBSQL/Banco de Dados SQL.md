### Esquemas e tabelas:
*Todos os comandos acabam com `;`.*
**CREATE SCHEMA {NOME}** - Cria o esquema, onde vai ser inserido as tabelas.
**CREATE TABLE {NOME} (CAMPOS)** - Para criar tabelas.
Exemplo: 
````sql
CREATE TABLE LIVROS(
	ID_LIVRO INT NOT NULL,
    NOME_LIVRO VARCHAR(100) NOT NULL,
	AUTORIA VARCHAR(100) NOT NULL,
	EDITORA VARCHAR(100) NOT NULL,
	CATEGORIA VARCHAR(100) NOT NULL,
	PREÇO DECIMAL(5,2) NOT NULL,
    
    PRIMARY KEY(ID_LIVRO)
);
`````
---
1. Tabela de Tipos de Dados Numéricos:

|Tipo de Dado|Descrição|
|---|---|
|INT|Inteiro de precisão fixa|
|BIGINT|Inteiro de precisão maior|
|SMALLINT|Inteiro de precisão menor|
|DECIMAL(p, s)|Número decimal com precisão total e escala|
|NUMERIC(p, s)|Número decimal com precisão total e escala|
|FLOAT(p)|Número de ponto flutuante com precisão (p)|
|REAL|Número de ponto flutuante de precisão simples|
|DOUBLE|Número de ponto flutuante de dupla precisão|

2. Tabela de Tipos de Dados de Texto:

|Tipo de Dado|Descrição|
|---|---|
|CHAR(n)|String de comprimento fixo|
|VARCHAR(n)|String de comprimento variável, máximo de n caracteres|
|TEXT|Texto de comprimento variável|
|ENUM|Conjunto de valores pré-definidos|
|JSON|Armazena dados em formato JSON|

3. Tabela de Tipos de Dados de Data e Hora:

|Tipo de Dado|Descrição|
|---|---|
|DATE|Data no formato "AAAA-MM-DD"|
|TIME|Horário no formato "HH:MM:SS"|
|DATETIME|Data e horário combinados no formato "AAAA-MM-DD HH:MM:SS"|
|TIMESTAMP|Carimbo de data e horário|
|INTERVAL|Intervalo de tempo|

4. Tabela de Tipos de Dados Booleanos:

|Tipo de Dado|Descrição|
|---|---|
|BOOLEAN|Representa verdadeiro (true) ou falso (false)|
|BIT|Armazena 0 ou 1|

5. Tabela de Tipos de Dados Binários:

|Tipo de Dado|Descrição|
|---|---|
|BINARY(n)|Dados binários de comprimento fixo|
|VARBINARY(n)|Dados binários de comprimento variável, máximo de n bytes|
|BLOB|Dados binários de comprimento variável (grande objeto)|

---
Primeiro ele recebe o nome, depois o tipo de caractere, se vai ser inteiro ou caractere, depois disso recebe a quantidade de caracteres entre aspas.
Na primeira parte e informado a quantidade de números antes da virgula e após a virgula a quantidade números após ela.
Também e informado o Primary Key.
**ALTER TABLE** - Altera tabela que já foi criada. Usado para definir FK
**ADD CONSTRAINT** - Adiciona restrição.
````sql
ALTER TABLE ESTOQUE 
ADD CONSTRAINT FK_ESTOQUE_LIVRO
FOREIGN KEY (ID_LIVRO)
REFERENCES LIVROS (ID_LIVRO)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
`````
Altera a tabela do estoque e adiciona uma restrição, criando a `FK_ESTOQUE_LIVRO`, seleciona a `FOREIGN KEY` que e o `ID_LIVRO`, e depois faz a referencia aos Livros (tabela pai) `REFERENCES LIVROS (ID_LIVRO)`. `NO ACTION`, `ON DELETE` e `ON UPDATE` gera um erro quando altera uma observação na tabela filha que não existe na tabela pai.

**SET FOREIGN_KEY_CHECKS = 0** - E usado quando você precisa recriar a tabela.

---
### Inserindo Dados:

**INSERT INTO** - Inserir linha na tabela do SQL, definimos nessa linha os campos da tabela em sequencia.  
````sql
INSERT INTO LIVROS VALUES (
 1,
'Percy Jackson e o Ladrão de Raios',
'Rick Riordan',
'Intrínseca',
'Aventura',
34.45
);
`````
Se você não quiser seguir a sequencia você pode inserir após o `insert into {nome}` um () com a sequencia das linhas.

---

### Consultando e alterando os dados:

**SELECT {COLUNA} FROM {TABELA}** - Para procurar algo em especifico na tabela. Exemplo:
````sql
SELECT * FROM LIVROS;
SELECT ID_LIVRO FROM LIVROS;
`````
Você também pode usar `as` para adicionar um apelido a tabela.
````SQL
SELECT ID_LIVRO AS "Código do livro" FROM LIVROS;
`````
**WHERE {COLUNA} = {PESQUISA}** - Usado para criar filtro para pesquisas no banco de dados.
````sql
SELECT * FROM LIVROS
WHERE CATEGORIA = "Biografia";
`````
Pode adicionar mais condições ao where usando o `AND`. Exeplo:
````sql
SELECT * FROM LIVROS
WHERE CATEGORIA = "Romance" AND PREÇO < 48;
`````
````SQL
SELECT * FROM LIVROS
WHERE CATEGORIA = "Poesia" AND NOT AUTORIA = "Luís Vaz de Camões" OR AUTORIA = "Gabriel Pedrosa"
`````
Lembrando que praticamente todos os globbing do Linux funcionam aqui, exemplo:
````sql
SELECT CIDADE, ESTADO
FROM MAPA
WHERE CIDADE LIKE '%LÂNDIA';
``````
O `%` e usado para qualquer valor.
**DISTINCT** - Elimina as repetições dentro das colunas. `SELECT DISTINCT ID_LIVRO FROM VENDAS.
**ORDER BY {TABELA}** - Coloca a tabela em sequencia.
**DELETE FROM {TABELA} WHERE {COLUNA} = {VALOR}** - Serve para excluir uma linha do banco de dados.
**UPDATE {TABELA} SET {COLUNA} = {VALOR}** - Atualiza a tabela com os parâmetros passados. 
**SET SQL_SAFE_UPDATES = 0;** - Permite que seja alterado linhas de valores.

---
### Unindo Tabelas:

````SQL
SELECT VENDAS.ID_VENDEDOR, VENDEDORES.NOMEE_VENDEDOR, SUM(VENDAS.QTD_VENDIDA)
FROM VENDAS, VENDEDORES 
WHERE VENDAS.ID_VENDEDOR = VENDEDORES.ID_VENDEDOR
GROUP BY VENDAS.ID_VENDEDOR;
`````
Esse código seleciona duas tabelas diferentes, no seguinte padrão {Tabela}.{Coluna} e separados por virgula. Pega Vendas e Vendedores onde o VENDAS.ID_VENDEDOR e igual ao VENDEDORES.ID_VENDEDOR. Group by junta todas as linhas com o mesmo nome.

**GROUP BY {COLUNA}** - A cláusula GROUP BY é usada em consultas SQL para agrupar linhas de dados com base em um ou mais critérios. Ela permite que você agrupe os resultados da consulta por valores específicos em uma ou mais colunas. Ao usar o GROUP BY, você pode aplicar funções de agregação, como ``SUM, COUNT, AVG,`` entre outras, para obter informações resumidas sobre os grupos de dados. Isso é particularmente útil quando você deseja realizar cálculos ou análises em conjuntos de dados agrupados, permitindo obter insights sobre tendências, totais ou estatísticas agregadas. O GROUP BY ajuda a organizar e resumir os resultados da consulta com base nas suas necessidades de análise ou relatórios.

**INNER JOIN....ON** - E a intersecção o do que esta em ambas as tabelas, e `ON` vai ser usado para especificar a condição.
````sql
SELECT VENDAS.ID_VENDEDOR, VENDEDORES.NOMEE_VENDEDOR, SUM(VENDAS.QTD_VENDIDA)
FROM VENDAS 
INNER JOIN VENDEDORES 
ON VENDAS.ID_VENDEDOR = vendedores.ID_VENDEDOR
GROUP BY VENDAS.ID_VENDEDOR;
`````
**RIGHT JOIN** E **LEFT JOIN** - O que esta em uma tabela e o que a outra tem em comum com ela.
1. RIGHT JOIN
```sql
SELECT <CAMPOS>
FROM TABELA_A
RIGHT JOIN TABELA_B
ON TABELA_A.CAMPO = TABELA_B.CAMPO
```
2. LEFT JOIN
```sql
SELECT <CAMPOS>
FROM TABELA_A
LEFT JOIN TABELA_B
ON TABELA_A.CAMPO = TABELA_B.CAMPO
```
Além desses ainda existe o **FULL OUTER JOIN** que seleciona todos os elementos menos os que ambos tem em comum.
```sql
SELECT <CAMPOS>
FROM TABELA_A
INNER JOIN TABELA_B
ON TABELA_A.CAMPO = TABELA_B.CAMPO
WHERE TABELA_A.CAMPO IS NULL OR TABELA_B.CAMPO IS NULL
```

