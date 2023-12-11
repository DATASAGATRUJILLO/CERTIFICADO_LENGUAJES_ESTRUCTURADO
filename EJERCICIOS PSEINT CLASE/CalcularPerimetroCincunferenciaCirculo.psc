Algoritmo CalcularPerimetroCincunferenciaCirculo
	// (1) DEFINIR TIPOS DE DATOS
	Definir radio, area, perimetro Como Real
	// (2) ENTRADA
	Escribir "Ingrese radio ? "
	Leer radio
	// (3) PROCESO
	area = PI * radio ^ 2
	perimetro = 2 * PI * radio
	// (4) SALIDA
	Escribir "Area Circulo = ", area
	Escribir "Perimetro Circulo = ", perimetro
FinAlgoritmo
