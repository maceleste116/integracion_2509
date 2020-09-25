package qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class HomeGrupoTarifarioServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private HomeGrupoTarifarioPage homeGrupoTarifarioPage;

    //LINKEDIN

    /*public void writeInputNameUser(String nameUser){
        this.homeGrupoTarifarioPage.getInputNameUser().sendKeys(nameUser);
    }

    public void writeInputPassword(String password){
        this.homeGrupoTarifarioPage.getInputPasswordUser().sendKeys(password);
    }

    public void clickOnButtonSubmit(){
        this.homeGrupoTarifarioPage.getButtonSubmit().click();
    }

    public String getStartPost(){
        //this.wait.until(ExpectedConditions.visibilityOf(this.crearGrupoTarifarioPage.getMensajeCrear()));
        return this.homeGrupoTarifarioPage.getStarPost().getText();
    }
*/






}












