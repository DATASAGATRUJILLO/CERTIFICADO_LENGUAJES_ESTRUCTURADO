Algoritmo DivisionEntreCero
	// (1) DEFINIR TIPO DATOS
	Definir a, b, c, d Como Entero
	Definir x Como Real
	// (2) ENTRADA
	Escribir "Ingrese n�mero entero a ? "
	Leer a
	Escribir "Ingrese n�mero entero b ? "
	Leer b
	Escribir "Ingrese n�mero entero c ? "
	Leer c
	// (4) VALIDAR ENTRADA
	d = b - c
	Si d = 0 Entonces
		// (3) SALIDA
		Escribir "Divisi�n Entre Cero"
	SiNo  
		// (3) SALIDA
		x = (a-b)/(b-c) 
		Escribir "Resultado x = ", x
	FinSi
FinAlgoritmo
