# servico-restful-archetype

Arquétipo para construir projetos de serviços Restful usando Spring Boot.

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8: Necessário para executar o projeto Java](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.5.3: Necessário para realizar o build do projeto Java](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip)

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/condessalovelace/servico-restful-archetype.git
```

#### Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
```
O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

Após instalar o archetype, acesse o diretório de geração do projeto para gerá-lo:

```shell
cd "diretorio para gerar projeto"

mvn archetype:generate -DarchetypeGroupId=br.com.condessalovelace  -DarchetypeArtifactId=servico-restful-archetype -DarchetypeVersion=0.0.1-SNAPSHOT -DgroupId=br.com.condessalovelace  -DartifactId=servicorestfularchetype -DpackageName=br.com.condessalovelace.servicorestfularchetype
```

## Features

O projeto pode ser usado como arquétipo para iniciar o desenvolvimento de um projeto de serviços Restful usando o SpringBoot com suporte a *Basic Authentication*.

## Configuração

A única coisa que poderá mudar é a porta de execução do projeto. Se a porta 9090 estiver em uso, altere a mesma no arquivo `application.properties`.

## Links

- [Blog de desenvolvimento](https://condessalovelace.blogspot.com)

## Licença

Não se aplica.
