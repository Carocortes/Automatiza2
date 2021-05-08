package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class AmazonRegistroPagina {

	private WebDriver driver;
	
    //Elementos que se encuentran en la página
	
	@FindBy( how = How.ID, using = "createAccountSubmit")
	private WebElement btnCrear;                              //Variables que se utilizan dentro de la clase
	@FindBy( how = How.XPATH, using = "//input[]")
	private WebElement textoNombre;
	
	
// Creación de constructor
	public AmazonRegistroPagina (WebDriver driver) {
	
//llamado a libreria de pagefactory donde vamos a utilizar la sentencia de localizadores
		PageFactory.initElements(driver, this);
	}
	
	@Step //Identificar los pasos que va a realizar.
	
	public void RegistroAmazone() {
		btnCrear.click();
	}
	
	public void diligenciarCampo(String nombres) {
		textoNombre.sendKeys(nombres);
		System.out.println(nombres);
		System.out.println("Entro");
	}
	
}
