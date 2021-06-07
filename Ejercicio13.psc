Algoritmo Ejercicio13
	
	Escribir "Ingresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir"
	leer opcion
	
	Mientras opcion != 3 Hacer
		
		Si opcion = 1 Entonces
			Escribir "Ingresa un numero para sumar"
			leer num1
			
			Escribir "Ingresa un numero para sumar"
			leer num2
			
			suma = num1 + num2
			
			Escribir "La suma de ", num1 " + ", num2, " es: ", suma
			
			Escribir "Ingresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir"
			leer opcion
			
		SiNo
			Si opcion = 2 Entonces
				
				Escribir "Ingresa un numero para dividir"
				leer num1
				
				Escribir "Ingresa un numero para dividir"
				leer num2
				
				Si num2 = 0 Entonces
					
					Escribir "No se puede dividir entre 0"
					
				SiNo
					division = num1 / num2
				Fin Si
				
				Escribir "La division de ", num1 " entre ", num2, " es: ", division
				
				Escribir "Ingresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir"
				leer opcion
			SiNo
				
			Fin Si
			
		Fin Si
	Fin Mientras
	
FinAlgoritmo
