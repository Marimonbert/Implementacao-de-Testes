package Cucumber.Steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import DateCoverter.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contador {

	int contador = 0;

	@Given("^que o valor do contador e (\\d+)$")
	public void queOValorDoContadorE(int arg1) throws Throwable {

		contador = arg1;
	}

	@When("^eu incrementar (\\d+)$")
	public void euIncrementar(int arg1) throws Throwable {

		contador = contador + arg1;
	}

	@Then("^o valor final sera (\\d+)$")
	public void oValorFinalSera(int arg1) throws Throwable {

		Assert.assertTrue(arg1 == contador);

	}

	Date entrega = new Date();

	@Given("^o praso eh no dia (.*)$")
	public void oPrasoEhNoDia(@Transform(DateConverter.class) Date data)throws Throwable {
		entrega = data;
		System.out.println(entrega);
	}

	@When("^se a entrega atrasar (\\d+) (dia||dias||meses)$")
	public void seAEntregaAtrasarDias(int arg1, String tempo) throws Throwable {

		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();

	}

	@Then("^a entrega serah efetuada no dia (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSerahEfetuadaNoDia(String data) throws Throwable {

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);

	}

//----------------------------------------------------------------------------------------------------------------//

	@Given("^que o ticket( especial)? eh (A.\\d{3})$")
	public void queOTicketEhAF(String tipo, String arg1) throws Throwable {
	
	}

	@Given("^que o valor da passagem eh R\\$ (.*)$")
	public void queOValorDaPassagemEhR$(Double numero) throws Throwable {
		
		System.out.println(numero);
	
	}

	@Given("^que o nome do passageiro eh \"(.{5,20})\"$")
	public void queONomeDoPassageiroEh(String arg1) throws Throwable {
	 
	}


	@Given("^que o telefone do passageiro eh (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroEh(String telefone) throws Throwable {
	   
	
}

	@When("^criar steps$")
	public void criarSteps() throws Throwable {

	}

	@Then("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {

	}



}
