package tests.cucumber.steps;

import com.br.packageObjectMobile.MobilePageObect;
import com.google.common.collect.ImmutableMap;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import io.appium.java_client.AppiumDriver;
import suporte.driver.ThreadDriver;

public class OnboardingSteps extends BaseSteps {

	AppiumDriver driver;

	public void initiliazeSteps() {
		initializeCucumber();
	}

	@Dado("que estou no app conta midway")
	public void que_estou_no_app_conta_midway() throws Exception {

		new MobilePageObect(ThreadDriver.getTDriver()).clicarBotaoMinhaConta();

	}

	@Quando("clico em abrir minha conta midway")
	public void clico_em_abrir_minha_conta_midway() throws Exception {

		new MobilePageObect(ThreadDriver.getTDriver()).clicarBotaoEntrar();
		new MobilePageObect(ThreadDriver.getTDriver()).escreverCpf("98051973011");
		new MobilePageObect(ThreadDriver.getTDriver()).clicarContinuar();
		new MobilePageObect(ThreadDriver.getTDriver()).escreverNome("Rodrigo de Deus");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverComoQuerSerChamado("Rodrigo Deus");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverCelular("11974262854");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverEmail("rodrigo.florindo@gmail.com");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverDataNascimento("11121988");
		new MobilePageObect(ThreadDriver.getTDriver()).swipeScreenFaceId();

	}

	
	}


