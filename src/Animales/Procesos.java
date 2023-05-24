package Animales;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	int opc = 0;
	Mascotas ms = new Mascotas();
	boolean salir = false;

	public Procesos() {
		iniciar();
	}

	public void iniciar() {

		String menu = " Creacion Animalitos \n";
		menu += "1.Creen n cantidad de mascotas \n";
		menu += "2.Consulten mascotas individuales \n";
		menu += "3.salir \n";

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			menu();
		} while (opc != 3);

	}

	public void menu() {

		switch (opc) {
		case 1:
			ms.princi();

			break;
		case 2:
			ms.ConsultarMascota();
			break;
		case 3:
			salir = true;
			System.out.println("se cuida");
			break;
		default:
			break;
		}
	}

}
