Algoritmo DivisionEntreCero
	// (1) DEFINIR TIPO DATOS
	Definir a, b, c, d Como Entero
	Definir x Como Real
	// (2) ENTRADA
	Escribir "Ingrese número entero a ? "
	Leer a
	Escribir "Ingrese número entero b ? "
	Leer b
	Escribir "Ingrese número entero c ? "
	Leer c
	// (4) VALIDAR ENTRADA
	d = b - c
	Si d = 0 Entonces
		// (3) SALIDA
		Escribir "División Entre Cero"
	SiNo  
		// (3) SALIDA
		x = (a-b)/(b-c) 
		Escribir "Resultado x = ", x
	FinSi
FinAlgoritmo
