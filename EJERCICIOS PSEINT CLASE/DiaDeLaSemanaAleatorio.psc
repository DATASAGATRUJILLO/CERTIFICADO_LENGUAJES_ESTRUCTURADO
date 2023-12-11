Algoritmo DiaDeLaSemanaAleatorio
	Dimension x[7]
	
	x[1] = "Lunes"
	x[2] = "Martes"
	x[3] = "Miercoles"
	x[4] = "Jueves"
	x[5] = "Viernes"
	x[6] = "Sabado"
	x[7] = "Domingo"
	
	n = AZAR(7) + 1 // 0 1 2 3 4 5 6 
	               // 1 2 3 4 5 6 7
	Escribir x[n], "   ", n
FinAlgoritmo
