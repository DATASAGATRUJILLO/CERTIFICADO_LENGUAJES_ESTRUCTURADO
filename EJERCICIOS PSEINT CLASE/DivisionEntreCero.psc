Algoritmo DivisionEntreCero
	// (1) DEFINIR TIPO DATOS
	Definir a, b, c, x Como Entero
	// (2) ENTRADA
	Escribir "Ingrese n�mero entero a ? "
	Leer a
	Escribir "Ingrese n�mero entero b ? "
	Leer b
	Escribir "Ingrese n�mero entero c ? "
	Leer c
	//VALIDAR ENTRADA
	d = b - c
	Si d = 0 Entonces
		// (3) SALIDA
		Escribir "Divisi�n Entre Cero"
	SiNo  
		// (3) SALIDA
		x = (a-b)/(b-c) 
		Escribir "Resultado x = ", x
	FinSi
	//SE CAE EL PROGRAMA: POR DAR UN NUMERO REAL     8-3/3-2
    //SE CAE EL PROGRAMA POR DAR DIVISION ENTRE CERO 5-2/2-2  
FinAlgoritmo
