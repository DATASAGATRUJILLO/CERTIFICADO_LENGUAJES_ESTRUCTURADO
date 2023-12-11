Algoritmo InveritrNumeroDosDigitos
	// (1) DEFINIR TIPOS DATOS
	Definir c,n,ni,r Como Entero
	// (2) ENTRADA
	Escribir "Ingrese número dos dígitos ?"
	Leer n
	// (3) PROCESO
	c = trunc(n / 10)
	r = n mod 10
	ni = r * 10 + c
	// (4) SALIDA
	Escribir "Cociente         = ", c
	Escribir "Residuo          = ", r
	Escribir "Número Invertido = ", ni
FinAlgoritmo
