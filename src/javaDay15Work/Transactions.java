package javaDay15Work;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;

public class Transactions {
	
	Transactions() {
		
	}
		
	void saveFile() {
		JFileChooser fileChooser = new JFileChooser();
		Component modalToComponent = null;
		if (fileChooser.showOpenDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
		  @SuppressWarnings("unused")
		File file = fileChooser.getSelectedFile();
		  // load from file
		}
		
		if (fileChooser.showSaveDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
		  @SuppressWarnings("unused")
		File file = fileChooser.getSelectedFile();
		  // save to file
		}
	}
	public static void main(String[] a) {
		Transactions transactions = new Transactions();
		transactions.saveFile();
	}
}