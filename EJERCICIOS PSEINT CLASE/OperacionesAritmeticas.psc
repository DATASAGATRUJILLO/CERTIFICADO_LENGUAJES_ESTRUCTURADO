Algoritmo OperacionesAritmeticas
	//(1) DEFINIR TIPOS DATOS
	Definir n1, n2, resultado Como Real
	Definir operacion Como Caracter
	//(2) ENTRADA
	Escribir "Ingrese n�mero 1? "
	Leer n1
	Escribir "Ingrese n�mero 2? "
	Leer n2
	Escribir "Ingrese operaci�n aritm�tica (+ - / *) ? "
	Leer operacion
	//(3) PROCESO
	Segun operacion Hacer
		"+":
			resultado = n1 + n2
			Escribir "Sumar: ", resultado //(4) SALIDA
		"-":
			resultado = n1 - n2
			Escribir "Restar: ", resultado//(4) SALIDA
		"/":
			resultado = n1 / n2
			Escribir "Dividir: ", resultado//(4) SALIDA
		"*":
			resultado = n1 * n2
			Escribir "Multiplicar: ", resultado//(4) SALIDA
		De Otro Modo:
			Escribir "Entrada Incorrecta, debe ingresar + - / *"
	Fin Segun
FinAlgoritmo
