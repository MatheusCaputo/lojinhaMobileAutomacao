package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListarProdutosTela extends BaseTela{

    public ListarProdutosTela(WebDriver app){
        super(app);
    }

    public AdicionarProdutoTela adicionarProduto(){
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();
        return new AdicionarProdutoTela(app);
    }
}
