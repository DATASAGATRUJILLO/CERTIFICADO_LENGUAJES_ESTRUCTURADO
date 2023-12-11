Algoritmo Invertirnumerodosdigitos
	
	
	// (1)DEFINIR TIPO DE DATOS 
	Definir c, n, ni, r Como Entero 
	
	// (2)ENTRADA 
	Escribir "ingrese numero dos digitos"
	
	Leer n 
	
	// (3) PROCESO   
	
	c = trunc (n/10)
	r = n mod 10 
	escribir r * 10 + c 
	// (4) SALIDA  
	escribir"Cociente = " , c 
	escribir "residuo"
	escribir "numero invertido = ", ni 

	
FinAlgoritmo
