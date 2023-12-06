
# [Lojinha Mobile Automação](https://github.com/MatheusCaputo/lojinhaMobileAutomacao)

Esse é um repositório que contém a automação de alguns testes de Mobile com Android de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## [Tecnologias Utilizadas](https://github.com/MatheusCaputo/lojinhaMobileAutomacao#tecnologias-utilizadas)

-   Java  [https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
-  JUnit  [https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.0-M1)
-    Appium  [https://mvnrepository.com/artifact/io.appium/java-client](https://mvnrepository.com/artifact/io.appium/java-client/7.5.1)
-  Appium Inspector  [https://sourceforge.net/projects/appium-desktop.mirror/files/v1.22.3-4/Appium-Server-GUI-windows-1.22.3-4.zip/download](https://sourceforge.net/projects/appium-desktop.mirror/files/v1.22.3-4/Appium-Server-GUI-windows-1.22.3-4.zip/download)
- Genymotion [https://www.genymotion.com/download/](https://www.genymotion.com/download/)
- James Proxy [https://github.com/james-proxy/james](https://github.com/james-proxy/james)



## [Testes Automatizados](https://github.com/MatheusCaputo/lojinhaAPIAutomacao#testes-automatizados)

Testes para validar as partições de equivalência relacionadas ao valor do produto na Lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

### CT1 - Validação do valor de produto não permitido
**Resultado esperado:** visualizar um pop-up com a seguinte mensagem: O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

**Passo a passo:** Faça login na aplicação Mobile, adicione um produto com valor igual a 7000,01.

**Resultado obtido:** Passou ✅

## [Notas Gerais](https://github.com/MatheusCaputo/lojinhaAPIAutomacao#notas-gerais)

- O Genymotion foi utilizado para emular um device real.
- O James Proxy é uma aplicação Open Source, que permite verificar o que está sendo enviado de requisição e obtido como resposta entre o App e a API. Só pode ser utilizado quando o App ainda não foi para produção e PARA APLICAÇÕES NATIVAS.
-   Sempre utilizamos a anotação **Before Each** configurar todas as capacidades que o driver do Appium terá para controlar e navegar por nosso device emulado nesse contexto.
- O Appium Inspector é uma interface gráfica para o Appium que permite obter o nome do componente na tela do device para auxiliar na automação dos testes mobile.
-   Nesse projeto fiz uso do JUnit 5, o que me dá a possibilidade de usar a anotação DisplayName para dar descrições em português para meus testes. 