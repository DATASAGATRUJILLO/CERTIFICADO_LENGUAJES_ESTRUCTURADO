Algoritmo GenerarGuardar10NumerosAleatorios
	
	Definir n Como Entero
	n = 10
	Dimension x[n]
	
	//LLENAR VECTOR
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		x[i] = AZAR(6) + 1 
	Fin Para
	//RECORRER VECTOR
    Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir i," = ",x[i]
	Fin Para
	//CUANTOS SON NUMEROS PARES EN EL VECTOR
	c = 0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Si x[i] mod 2 = 0 Entonces
		   c = c + 1 // CONTADOR
		Fin Si
	Fin Para
	Escribir "Cantidad Pares: ", c
	Escribir numero
	
	
	
FinAlgoritmo
