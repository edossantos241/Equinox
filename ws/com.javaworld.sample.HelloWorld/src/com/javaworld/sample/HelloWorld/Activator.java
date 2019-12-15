package com.javaworld.sample.HelloWorld;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.javaworld.sample.clientGUI.ClientGUI;
import com.javaworld.sample.service.helloservice.HelloService;
import com.javaworld.sample.service.helloservice.HelloServiceEn;
import com.javaworld.sample.service.helloservice.HelloServiceFr;

public class Activator implements BundleActivator {
	
	ClientGUI clientGUI;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		
		// Instancie deux HelloService (anglais et francais)
		HelloService helloEn = new HelloServiceEn();
		HelloService helloFr = new HelloServiceFr();
		String text1 = helloEn.sayHello();
		String text2 = helloFr.sayHello();
		
		// Affiche dans la console les deux HelloService
		System.out.println(text1);
		System.out.println(text2);
		
		// Instancie un clientGUI et l'affiche
		this.clientGUI = new ClientGUI(text1, text2);
		this.clientGUI.setVisible(true);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
		this.clientGUI.dispose(); // Ferme la fenêtre IHM
		System.exit(0); // Arrete le programme
	}
}
