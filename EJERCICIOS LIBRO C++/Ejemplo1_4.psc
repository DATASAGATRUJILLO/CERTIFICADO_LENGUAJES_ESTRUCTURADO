Algoritmo Ejemplo1_4
	Definir c1,c2,c3,c4,c5,pro Como Real
	Escribir "Ingrese califiación 1 ? "
	Leer c1
	Escribir "Ingrese califiación 2 ? "
	Leer c2
	Escribir "Ingrese califiación 3 ? "
	Leer c3
	Escribir "Ingrese califiación 4 ? "
	Leer c4
	Escribir "Ingrese califiación 5 ? "
	Leer c5
	pro = (c1+c2+c3+c4+c5)/5
	Escribir "Promedio sin redondear = ", pro
	Escribir "Promedio redondeado    = ", redon(pro)
FinAlgoritmo
