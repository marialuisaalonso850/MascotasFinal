package Animales;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Mascotas {
	// Atributos
	int codigo;
	String nombre;
	String especie;
	int edad;
	ArrayList<Mascotas> listaMascotas = new ArrayList<Mascotas>();
	int n = 0;

	// Constructor sin parametros
	public Mascotas() {
		nombre = "Firu";
		especie = "Default";
		edad = 0;
		listaMascotas = new ArrayList<Mascotas>();
	}

	public Mascotas(int codigo, String nombre, String especie, int edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;

	}

	public void ingresar() {
		nombre = JOptionPane.showInputDialog("Ingrese nombre");
		especie = "Default";
		edad = 0;
	}

	// Constructor con parametros
	public Mascotas(String nombre, String especie, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
	}

	// Método para mostrar información de la mascota
	public void mostrarInformacion(ArrayList<Mascotas> listaMascotas) {
		for (Mascotas mascota : listaMascotas) {

			System.out.println("codigo " + mascota.codigo);
			System.out.println("Nombre: " + mascota.nombre);
			System.out.println("Especie: " + mascota.especie);
			System.out.println("Edad: " + mascota.edad + " años");
			System.out.println();
		}
	}

	// Método para hacer que la mascota realice un sonido
	public void hacerSonido() {
		if (especie.equalsIgnoreCase("perro")) {
			System.out.println("¡Guau guau!");
		} else if (especie.equalsIgnoreCase("gato")) {
			System.out.println("¡Miau miau!");
		} else {
			System.out.println("La mascota no hace sonidos conocidos.");
		}

	}

	public void princi() {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de mascotas a ingresar"));
		for (int i = 0; i < n; i++) {
			Mascotas ms = new Mascotas();
			ms.codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código"));
			ms.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
			ms.especie = JOptionPane.showInputDialog("Ingrese la especie de la mascota");
			ms.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota"));
			listaMascotas.add(ms);

		}
		mostrarInformacion(listaMascotas);

	}

	public void ConsultarMascota() {

		String mascota = JOptionPane.showInputDialog("Ingrese el nombre de la mascota a buscar");
		int codigoAnimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código"));
		boolean encontrada = false;

		for (Mascotas mascotaActual : listaMascotas) {
			if (mascotaActual.nombre.equalsIgnoreCase(mascota) && mascotaActual.codigo == codigoAnimal) {
				System.out.println("La mascota " + mascota + " está registrada.");
				encontrada = true;
				break;
			}
		}

		if (!encontrada) {
			System.out.println("La mascota " + mascota + " no está registrada.");
		}

	}
}
