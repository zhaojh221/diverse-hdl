/*
 * generated by Xtext
 */
package fr.inria.diverse.hdl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HipsterDomainLanguageStandaloneSetup extends HipsterDomainLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new HipsterDomainLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

