package main;

import interfaces.Estudiante;
import interfaces.Login;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		/*
		File docentes = new File("docentes.txt");
		Login login = new Login();
		login.ventana();
		*/
		
		Estudiante estudiante = new Estudiante();
		estudiante.ventana();
		
	}

}
