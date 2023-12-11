Algoritmo ConvertirBinarioDecimal
	// (1) DEFINIR TIPO DE DATO
	Definir b0,b1,b2,decimal Como Entero
	// (2) ENTRADA
	Escribir "Ingrese bit 0 ? "
	Leer b0	
	Escribir "Ingrese bit 1 ? "
	Leer b1
	Escribir "Ingrese bit 2 ? "
	Leer b2
	// (4) VALIDAR ENTRADA
	Si (b0 = 1 O b0 = 0) Y (b1 = 1 O b1 = 0) Y (b2 = 1 O b2 = 1) Entonces
		// (3) SALIDA
		Escribir "Entrada correcta"
		decimal = b0*2^0 + b1*2^1 + b2*2^2
		Escribir "El número binario: ", b2,b1,b0," es igual al decimal: ",decimal
	SiNo
		// (3) SALIDA
		Escribir "Entrada incorrecta"
	FinSi
FinAlgoritmo
