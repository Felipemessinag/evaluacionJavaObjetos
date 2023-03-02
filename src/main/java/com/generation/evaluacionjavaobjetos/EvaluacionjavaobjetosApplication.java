package com.generation.evaluacionjavaobjetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.evaluacionjavaobjetos.models.Alumno;
import com.generation.evaluacionjavaobjetos.models.Asignatura;
import com.generation.evaluacionjavaobjetos.models.Curso;
import com.generation.evaluacionjavaobjetos.models.Profesor;

@SpringBootApplication
public class EvaluacionjavaobjetosApplication {
/*
 * Te contactaron desde un colegio municipal para que los ayudes a generar un software pensando en ordenar su funcionamiento. Este colegio siempre ha funcionado de manera análoga por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos, documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio. En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del colegio utilizando herencia. Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del colegio
Puntos a considerar:
● El colegio cuenta con distintos cursos, profesores, materias y alumnos
● Se debe crear una función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio de cada estudiante.
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.
● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor nota y el promedio de notas.
*/
/*
 * Pasos para realizar el programa.
 * generar las 3 funciones en public class
 * generar función que permita ingresar nota por estudiante y que calcule el promedio de cada estudiante.
 * generar función que guarde en un arreglo los alumnos del curso y luego los muestre.
 * generar una función que muestre la mejor nota, la peor nota y el promedio de notas.
 * crear los objetos Curso, Profesor, Materia, Alumno.
 * solicitar al usuario la asignatura.
 * solicitar al usuario el profesor que imparte la asignatura.
 * solicitar al usuario la cantidad de alumnos.
 * solicitar al usuario los nombres de los alumnos.
 * solicitar al usuario la cantidad de notas por alumno.
 */
//Esta función permite calcular el promedio de las notas de los alumnos
public static Double promedioNotas(ArrayList<Double> notas){
	double suma = 0;
	for (int i = 0; i < notas.size(); i++) {
		suma += notas.get(i);
		
	}
	return suma/notas.size();
}

//Esta función permite guardar a los alumnos en un arreglo para posteriormente mostrarlo.
// public static String arregloAlumnos(ArrayList<String> alumnos){
// 	for (int i = 0; i < alumnos.size(); i++) {
// 	}
// 	}

// Esta función permite mostrar la mejor y peor nota y el promedio de notas de cada alumno.
// public static double notas(ArrayList<Double> notas, double notaAlta, double notaBaja){
// 	Alumno alumnoNotas = new Alumno();
// 	System.out.println("Indique el nombre del alumno para indicarle su mejor y peor nota y su promedio.");

// }









	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombAlumno = "";
		ArrayList<Alumno> alumnoPrograma = new ArrayList<Alumno>();
		ArrayList<Curso> cursoPrograma = new ArrayList<Curso>();
		ArrayList<Double> notasAlumno = new ArrayList<Double>();
		HashMap<String, ArrayList<Double>> libroDeNotas = new HashMap<String, ArrayList<Double>>();
		
		//HashMap<String, ArrayList<Double>> libroDeNotas = new HashMap<String, ArrayList<Double>>();


		//Se le solicita al usuario que nos indique la cantidad de alumnos.
		int cantidadAlumnos;
		int cantidadDeNotas;
		String asignaturaProfesor;
		Asignatura asignaturaUsuario = new Asignatura();
		//En esta sección se solicitarán datos para armar el curso, como el nombre del profesor, la asignatura que imparte y la cantidad de alumnos que tiene su curso. Estos datos de asignarán a los objetos creados para utilizarse posteriormente.
		do{
			Curso cursoUsuario = new Curso();
			System.out.println("Indíquenos el nombre del profesor a cargo del curso: ");
			String nombreProfesor = teclado.nextLine();
			cursoUsuario.setNombreProfesor(nombreProfesor);
			System.out.println("Indique la asignatura que imparte el profesor: ");
			asignaturaProfesor = teclado.nextLine();
			asignaturaUsuario.setNombreAsignatura(asignaturaProfesor);
			System.out.println("Indique la cantidad de alumnos del curso: ");
			cantidadAlumnos = teclado.nextInt();
			cursoUsuario.setCantidadAlumnos(cantidadAlumnos);
			teclado.nextLine();
			cursoPrograma.add(cursoUsuario);

			if(cantidadAlumnos <= 0){
				System.out.println("La cantidad de alumnos debe ser mayor a cero, favor inténtelo nuevamente: ");
			}
		} while (cantidadAlumnos <= 0);
			System.out.print(cursoPrograma);
			System.out.println(" para la asignatura de " + asignaturaProfesor);
			//En esta sección solicitaremos el nombre de los alumnos y la cantidad de nota por alumno para posteriormente mostrar en pantalla las notas por alumno y sus promedios.
			do{
				System.out.println("Indique la cantidad de notas por alumno: ");
				cantidadDeNotas = teclado.nextInt();
				if(cantidadDeNotas <= 0){
					System.out.print("La cantidad de notas debe ser mayor a cero: ");
				}	
			}while (cantidadDeNotas <= 0);  

			for(int i = 1; i <= cantidadAlumnos; i++){
				teclado.nextLine();
				ArrayList<Double> notasAlumnos = new ArrayList<Double>();
				Alumno alumnoUsuario = new Alumno();
				System.out.println("Ingrese el nombre y apellido del alumno " + i + ". " );
				nombAlumno = teclado.nextLine();
				alumnoUsuario.setNombre(nombAlumno);
				//alumnoUsuario.setCantidadNotas(cantidadDeNotas);
				for(int j = 1; j <= cantidadDeNotas; j++ ){
					System.out.println("Ingrese la nota " + j + " de " + nombAlumno + ": ");
					double notas = teclado.nextDouble();
					notasAlumnos.add(notas);
				}
				
				libroDeNotas.put(nombAlumno, notasAlumno);
				System.out.println("Los datos ingresados hasta el momento son: " +libroDeNotas);
			}
				//Esta parte corresponde al menú, en el que se dan 3 opciones por las 3 funciones que debía contener el programa.
				int opcion = 1;
				System.out.println("****************************Comienzo del menú***********************");
				while(opcion!=0){
					do{
						System.out.println("..............................................................................");
						System.out.println("Bienvenido");
						System.out.println("...............................................................................");
						System.out.println("Seleccione 1 si quiere obtener el promedio de notas de cada estudiante: ");
						System.out.println("Seleccione 2  si quiere ver los alumnos ingresados: ");
						System.out.println("Seleccione 3 si desea ver la mejor y peor nota junto con el promedio de un alumno: ");
						System.out.println("Seleccione 0 para terminar el programa");
						System.out.println("Seleccione una opción");
						opcion = teclado.nextInt();

					}while (opcion <0 || opcion > 3);
					if (opcion == 1){

						for(String i : libroDeNotas.keySet()){
							
							Double promedioAlum = promedioNotas(libroDeNotas.get(i));
							System.out.println("El promedio de "+ i + " es : " + promedioAlum);
						}
						
						
					}
				}
					


				
			
			
		


		teclado.close();
	}

}
