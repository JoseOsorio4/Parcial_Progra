/**
 * 
 */
/**
 * 
 */
module Parcial_Progra {
}

//estrutura para conectar 
		/*  int opcion;

	        do {
	            System.out.println("\n MENU");
	            System.out.println("1. Ejercicio 1");
	            System.out.println("2. Ejercicio 2");
	            System.out.println("3. Ejercicio 3");
	            System.out.println("0. Salir");
	            System.out.print("Seleccione opcion: ");
	            opcion = sc.nextInt();

	            switch(opcion){
	                case 1: ejercicio1(); break;
	                case 0: System.out.println("Saliendo...");
	                default: System.out.println("Opcion invalida");
	            }

	        } while(opcion != 0);
	    }
	    // Aquí abajo pegas todos los métodos
	// Suma los numeros divisibles entre 5 desde 1 hasta n
	public static void ejercicio1(){
	    System.out.print("Ingrese n: ");
	    int n = sc.nextInt();
	    int suma = 0;

	    for(int i = 1; i <= n; i++){
	        if(i % 5 == 0){
	            suma += i;
	        }
	    }

	    System.out.println("Suma: " + suma);
	}
*/

//ejercicios
/*
 case 1: tablaMultiplicar(); break;
case 2: numeroPrimo(); break;
case 3: correoNombreApellido(); break;
case 4: correoInicialApellido(); break;
1️⃣ Tabla de multiplicar (1-10)
public static void tablaMultiplicar(){

    System.out.print("Ingrese un numero entre 1 y 12: ");
    int n = sc.nextInt();

    if(n >= 1 && n <= 12){

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }else{
        System.out.println("Numero fuera de rango");
    }

}
2️⃣ Verificar número primo
public static void numeroPrimo(){

    System.out.print("Ingrese un numero: ");
    int n = sc.nextInt();

    boolean primo = true;

    if(n <= 1){
        primo = false;
    }

    for(int i = 2; i < n; i++){

        if(n % i == 0){
            primo = false;
        }

    }

    if(primo){
        System.out.println("El numero es PRIMO");
    }else{
        System.out.println("El numero NO es primo");
    }

}
3️⃣ Correo nombre.apellido
public static void correoNombreApellido(){

    sc.nextLine();

    System.out.print("Ingrese nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese apellido: ");
    String apellido = sc.nextLine();

    nombre = nombre.toLowerCase().trim();
    apellido = apellido.toLowerCase().trim();

    String correo = nombre + "." + apellido + "@umg.edu.gt";

    System.out.println("Correo generado: " + correo);

}
4️⃣ Correo inicial + apellido
public static void correoInicialApellido(){

    sc.nextLine();

    System.out.print("Ingrese nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese apellido: ");
    String apellido = sc.nextLine();

    nombre = nombre.toLowerCase().trim();
    apellido = apellido.toLowerCase().trim();

    char inicial = nombre.charAt(0);

    String correo = inicial + apellido + "@umg.edu.gt";

    System.out.println("Correo generado: " + correo);

}

5️⃣ Número par o impar
public static void parImpar(){

    System.out.print("Ingrese un numero: ");
    int n = sc.nextInt();

    if(n % 2 == 0){
        System.out.println("El numero es PAR");
    }else{
        System.out.println("El numero es IMPAR");
    }

}
6️⃣ Factorial
public static void factorial(){

    System.out.print("Ingrese un numero: ");
    int n = sc.nextInt();

    int factorial = 1;

    for(int i = 1; i <= n; i++){
        factorial = factorial * i;
    }

    System.out.println("El factorial es: " + factorial);

}
7️⃣ Suma de números del 1 al n
public static void sumaHastaN(){

    System.out.print("Ingrese un numero: ");
    int n = sc.nextInt();

    int suma = 0;

    for(int i = 1; i <= n; i++){
        suma = suma + i;
    }

    System.out.println("La suma total es: " + suma);

}
8️⃣ Contar vocales en un texto
public static void contarVocales(){

    sc.nextLine();

    System.out.print("Ingrese un texto: ");
    String texto = sc.nextLine();

    texto = texto.toLowerCase();

    int contador = 0;

    for(int i = 0; i < texto.length(); i++){

        char letra = texto.charAt(i);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            contador++;
        }

    }

    System.out.println("Cantidad de vocales: " + contador);

}
Ejemplo de cómo quedaría tu menú
System.out.println("1. Tabla de multiplicar");
System.out.println("2. Numero primo");
System.out.println("3. Correo nombre.apellido");
System.out.println("4. Correo inicial + apellido");
System.out.println("5. Par o impar");
System.out.println("6. Factorial");
System.out.println("7. Suma hasta N");
System.out.println("8. Contar vocales");

y en el switch:

case 1: tablaMultiplicar(); break;
case 2: numeroPrimo(); break;
case 3: correoNombreApellido(); break;
case 4: correoInicialApellido(); break;
case 5: parImpar(); break;
case 6: factorial(); break;
case 7: sumaHastaN(); break;
case 8: contarVocales(); break;
 
 */
