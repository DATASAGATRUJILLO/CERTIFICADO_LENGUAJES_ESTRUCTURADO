Algoritmo DeterminarNumeroPositivoNegativo2
	// (1) DEFINIR TIPO DATOS
	Definir n Como Entero
	// (2) ENTRADA
	Escribir "Ingrese número ? "
	Leer n 
	// (3) PROCESO
	Si n > 0 Entonces
		mensaje = "Positivo "
	SiNo
		mensaje = "Negativo "
	FinSi  
	// (4) SALIDA
	Escribir mensaje, n
FinAlgoritmo
