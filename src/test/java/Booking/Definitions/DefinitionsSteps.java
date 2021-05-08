package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.AmazonRegistroPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
    private AmazonRegistroPagina amazonRegistroPagina = new AmazonRegistroPagina(driver); //llama y ejecuta 
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
//Palabras Claves
	@When("^Haga click en boton Crear$")
	public void diligenciarFormulario() {
		
		this.amazonRegistroPagina = new AmazonRegistroPagina (driver);
		this.amazonRegistroPagina.RegistroAmazone();
	}
}