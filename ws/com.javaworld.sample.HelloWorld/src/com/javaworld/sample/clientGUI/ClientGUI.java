/**
 * 
 */
package com.javaworld.sample.clientGUI;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

/**
 * @author Kamal AARAB & Emma DOS SANTOS
 *
 */
public class ClientGUI extends Frame {
	
	public ClientGUI() {
		Panel window = new Panel();
		Label label1 = new Label("Label");
		window.add(label1);
		this.setTitle("OSGi Client GUI");
		this.setSize(300, 200);
//		this.setVisible(true);
	}
	
	/*
	 * Constructeur de la classe ClientGUI
	 * @param String text1, String text2
	 */
	public ClientGUI(String text1, String text2) {
		Panel window = new Panel();
		Label label1 = new Label(text1);
		Label label2 = new Label(text2);
		window.add(label1);
		window.add(label2);
		this.setTitle("OSGi Client GUI");
		this.setSize(300, 200);
//		this.setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientGUI client = new ClientGUI("aaaa","aaaa");
		client.setVisible(true);
	}

}
