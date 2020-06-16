package tests.cucumber.steps;

import com.google.common.collect.ImmutableMap;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import io.appium.java_client.AppiumDriver;
import screens.OnboardingScreen;
import suporte.driver.ThreadDriver;

public class OnboardingSteps extends BaseSteps {

	AppiumDriver driver;

	public void initiliazeSteps() {
		initializeCucumber();
	}

	@Dado("que estou no app conta midway")
	public void que_estou_no_app_conta_midway() throws Exception {

		new OnboardingScreen(ThreadDriver.getTDriver()).clicarBotaoMinhaConta();

	}

	@Quando("clico em abrir minha conta midway")
	public void clico_em_abrir_minha_conta_midway() throws Exception {

		new OnboardingScreen(ThreadDriver.getTDriver()).clicarBotaoEntrar();
		new OnboardingScreen(ThreadDriver.getTDriver()).escreverCpf("98051973011");
		new OnboardingScreen(ThreadDriver.getTDriver()).clicarContinuar();
		new OnboardingScreen(ThreadDriver.getTDriver()).escreverNome("Rodrigo de Deus");
		new OnboardingScreen(ThreadDriver.getTDriver()).escreverComoQuerSerChamado("Rodrigo Deus");
		new OnboardingScreen(ThreadDriver.getTDriver()).escreverCelular("11972563388");
		new OnboardingScreen(ThreadDriver.getTDriver()).escreverEmail("rodrigo.florindo@gmail.com");
		new OnboardingScreen(ThreadDriver.getTDriver()).escreverDataNascimento("11121988");
		new OnboardingScreen(ThreadDriver.getTDriver()).swipeScreenFaceId();

	}

	
	}


