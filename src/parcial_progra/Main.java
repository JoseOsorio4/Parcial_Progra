package parcial_progra;

import java.util.Scanner;

public class Main {
	
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//estrutura para conectar 
				 int opcion;

			        do {
			            System.out.println("\n MENU");
			            System.out.println("1. Ejercicio 1");
			            System.out.println("2. Ejercicio 2");
			            System.out.println("3. Ejercicio 3");
			            System.out.println("3. Ejercicio 4");
			            System.out.println("0. Salir");
			            System.out.print("Seleccione opcion: ");
			            opcion = sc.nextInt();

			            switch(opcion){
			                case 1: ejercicio1();
			                break;
			                case 2: ejercicio2();
			                break;
			                case 3: ejercicio3();
			                case 4: ejercicio4();
			                case 0: System.out.println("Saliendo...");
			                default: System.out.println("Opcion invalida");
			            }

			        } while(opcion != 0);
			    }
			    // mis metodos o modularizacion
// ejercicio 1: escriba un programa que lea un numero n ( entre 1 y 12 ) y genere la  tabla de multiplicar de n del 1 al 12
			public static void ejercicio1(){
				 System.out.print("Ingrese un numero entre el n1 y el n12: ");
				    int n = sc.nextInt();

				    if(n >= 1 && n <= 12){

				        for(int i = 1; i <= 10; i++){
				            System.out.println(n + " x " + i + " == " + (n * i));
				        }

				    }else{
				        System.out.println("Numero no disponible");
				    }

				}
// ejerccicio 2: escriba un programa que lea 5 calificaciones y calcule el promedio con dos decimales 
			public static void ejercicio2(){
            
				        
				        double cal1, cal2, cal3, cal4, cal5;
				        double Promedio;

				        System.out.print("Ingrese la  primer calificacion 1: ");
				        cal1 = sc.nextDouble();

				        System.out.print("Ingrese la segunda calificacion 2: ");
				        cal2 = sc.nextDouble();

				        System.out.print("Ingrese la tercer calificacion 3: ");
				        cal3 = sc.nextDouble();

				        System.out.print("Ingrese la cuarta calificacion 4: ");
				        cal4 = sc.nextDouble();

				        System.out.print("Ingrese la quinta calificacion 5: ");
				        cal5 = sc.nextDouble();

				        Promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

				        System.out.printf("El promedio es: %.2f", Promedio);

				    }
			
	
// ejercicio 3:escriba un correo que lea nombre y apellido y genere un correo con el formato de la umg (nombreapellido@mi umg.edu.gt) se debe convertir el texto a minusculas y eliminar espacioos si los hay 			
			public static void ejercicio3(){
			

				        String nombre;
				        String apellido;
				        String correo;

				        System.out.print("Ingrese su nombre: ");
				        nombre = sc.nextLine();

				        System.out.print("Ingrese su apellido: ");
				        apellido = sc.nextLine();

				        // convertir a minusculas
				        nombre = nombre.toLowerCase();
				        apellido = apellido.toLowerCase();

				        // eliminar espacios
				        nombre = nombre.replace(" ", "");
				        apellido = apellido.replace(" ", "");

				    
				        correo = nombre + apellido + "@miumg.edu.gt";

				        System.out.println("Correo generado: " + correo);

				    }
				
// ejercicio 4: escriba un programa que lea nombre y apellido y genere un usuario con el formato: Inicial nombre+apellido
//como por ejemploa:juan Perez=jPerez			
			public static void ejercicio4(){
				String nombre;
				String Apellido;
				String Usuario;

				System.out.print("Ingrese su nombre: ");
				nombre = sc.nextLine();

				System.out.print("Ingrese su apellido: ");
				Apellido = sc.nextLine();


				char inicial = nombre.charAt(0);

				Usuario = inicial + Apellido;

				System.out.println("El usario generado es: " + Usuario);

				}
}
				//finalizado	