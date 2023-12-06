package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarProdutoTela extends BaseTela{
    public AdicionarProdutoTela(WebDriver app){
        super(app);
    }
    public AdicionarProdutoTela preencherNome(String nome){
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(nome);
        return this;
    }

    public AdicionarProdutoTela preencherValor(String valor){
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(valor);
        return this;
    }

    public AdicionarProdutoTela preencherCores(String cores){
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(cores);
        return this;
    }

    public AdicionarProdutoTela submeterProdutoInvalido(){
        app.findElement(By.id("com.lojinha:id/saveButton")).click();
        return this;
    }

    public String capturarMsgApresentada(){
         return capturarToast();
    }
}
