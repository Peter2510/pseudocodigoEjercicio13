import java.util.Scanner;

public class Ejercicio13{

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);

		//variables globales	
		int opcion=0, num1, num2;


		System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
		opcion = sc.nextInt();

		

		while (opcion != 3) {

			if (opcion == 1) {

						
						System.out.println("\nIngresa un numero para sumar");
						num1 = sc.nextInt();
			

						System.out.println("\nIngresa un numero para sumar");
						num2 = sc.nextInt();
			
			
						int suma = num1 + num2;
			
						System.out.println("La suma de "+num1 +" + "+ num2+ " es: "+ suma);

						System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
						opcion = sc.nextInt();
					
			
					}	



							if (opcion==2) {



						System.out.println("\nIngresa un numero para dividir");
						Double divnum1 = sc.nextDouble();
			

						System.out.println("\nIngresa un numero para dividir");
						Double divnum2 = sc.nextDouble();

								if (divnum2==0) {

									System.out.println("No se puede dividir entre cero");
									System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
									opcion = sc.nextInt();
									
								}

								else{


									Double division = divnum1 / divnum2;
			
									System.out.println("La division de "+divnum1 +" entre "+ divnum2+ " es: "+ division);

									System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
									opcion = sc.nextInt();


								}
			
			
						

								
							}

							
								
							}

							if (opcion!=1 && opcion!=2 && opcion!=3) {
									System.out.println("\nIngresa una opcion valida");
									System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
									opcion = sc.nextInt();
								
							}

					
		}
		
	

		

		
	

			
	}

