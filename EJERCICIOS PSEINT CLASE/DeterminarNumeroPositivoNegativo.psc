Algoritmo DeterminarNumeroPositivoNegativo
	// (1) DEFINIR TIPO DATOS
	Definir n Como Entero
	// (2) ENTRADA
	Escribir "Ingrese número ? "
	Leer n 
	// (3) PROCESO
	Si n > 0 Entonces
		x = 1
	SiNo
		x = 0
	FinSi  
	// (4) SALIDA
	Segun x Hacer
		1:
			Escribir "Positivo ", n
		0:
			Escribir "Negativo ", n
	Fin Segun
FinAlgoritmo
