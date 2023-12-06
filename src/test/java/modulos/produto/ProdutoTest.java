package modulos.produto;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.LoginTela;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Testes Mobile do módulo de produto")
public class ProdutoTest {

    private WebDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {

        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platform", "Android");
        capacidades.setCapability("udid", "192.168.40.101:5555");
        capacidades.setCapability("appPackage", "com.lojinha");
        capacidades.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        capacidades.setCapability("app", "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Programa de Testes e Qualidade de software\\Testes Mobile com Android\\Lojinha+Android+Nativa\\lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
        this.app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @DisplayName("Validação do valor de produto não permitido")
    @Test
    public void testValorDeProdutoNaoPermitido() throws MalformedURLException {

        String msgApresentada = new LoginTela(app)
                .preencherUsuario("matheus13")
                .preencherSenha("123")
                .submeterLogin()
                .adicionarProduto()
                .preencherNome("Coca Zero")
                .preencherValor("700001")
                .preencherCores("Vermelho,preto")
                .submeterProdutoInvalido()
                .capturarMsgApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", msgApresentada);
    }

    @AfterEach
    public void afterEach(){
        app.quit();
    }
}
