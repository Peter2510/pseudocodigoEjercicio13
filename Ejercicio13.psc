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
			
		Fin Si
	Fin Mientras
	
FinAlgoritmo
