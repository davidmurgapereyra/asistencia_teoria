package ar.edu.unju.fi.main;
import java.util.Scanner;

import ar.edu.unju.fi.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno = new Alumno();
		Materia materia = new Materia();
		RegistroNota registro = new RegistroNota();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del alumno:");
		String nombre = scanner.next();
		System.out.println("Ingrese el apellido del alumno:");
		String apellido = scanner.next();
		System.out.println("Ingrese el legajo del alumno:");
		Integer legajo = scanner.nextInt();
		alumno.setLegajo (legajo);
		alumno.setApellido (apellido);
		alumno.setNombre (nombre);
		System.out.println(alumno.toString());
		
		int numMaterias = 1;
		while (numMaterias <= 4) { 
			
		System.out.println("Ingrese el nombre de la materia: ");
		String nombreMateria = scanner.next();
		materia.setNombre(nombreMateria);
		
		System.out.println("Ingrese el codigo de la materia: ");
		String codigoMateria = scanner.next();
		materia.setCodigo(codigoMateria);
		
		
		System.out.println("Ingrese el codigo del registro de nota: ");
		String codigoRegistro = scanner.next();
		registro.setCodigo(codigoRegistro);
		
		System.out.println("Ingrese la nota final: ");
		Float notaRegistro = scanner.nextFloat();
		registro.setNotaFinal(notaRegistro);
		
		registro.setAlumno(alumno);
		registro.setMateria(materia);
		
		System.out.println(registro.toString());
		
		numMaterias++;
		
		}
		
		scanner.close();
	}

}
