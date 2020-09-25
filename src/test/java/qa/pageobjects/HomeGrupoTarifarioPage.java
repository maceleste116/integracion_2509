package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class HomeGrupoTarifarioPage extends PageBase {

    @Autowired
    public HomeGrupoTarifarioPage(WebDriver driver) {
        super(driver);
    }

    //LINKEDIN

    /*@FindBy(id="session_key")
    private WebElement inputNameUser;

    @FindBy(id="session_password")
    private WebElement inputPasswordUser;

    @FindBy(xpath="(//button[@type='submit'])[3]")
    private WebElement buttonSubmit;

    @FindBy(xpath="(//button[@type='button'])[7]")
    private WebElement starPost;*/













}
