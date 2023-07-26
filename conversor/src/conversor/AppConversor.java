package conversor;

import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AppConversor extends JFrame {
	private JMenuBar menuBar;
	private JMenu menu;
	
	
	public AppConversor() {
		setSize(600, 400);
		setVisible(true);
		setTitle("Conversor Challenge ONE \\m/ -.- \\m/");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);
	}

	public void mostrarMenu() {
		//inicialización de los atributos
		menuBar = new JMenuBar();
		menu = new JMenu("Elija una opción valida");
		
		menuBar.add(menu);
	}
	
	public static void main(String[] args) {
		AppConversor ventana = new AppConversor();
	}
}
