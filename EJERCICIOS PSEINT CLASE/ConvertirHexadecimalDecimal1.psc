Algoritmo ConvertirHexadecimalDecimal
	Definir h0,h1,h2 Como Caracter
	Escribir "Ingrese dígito hexadecimal posición 0 ?"
	Leer h0 //0 1 2 3 4 5 6 7 8 9 A B C D E F  
	Segun h0 Hacer
			caso "0" d = 0
			caso "1" d = 1
			caso "2" d = 2
			caso "3" d = 3
			caso "4" d = 4
			caso "5" d = 5
			caso "6" d = 6
			caso "7" d = 7
			caso "8" d = 8
			caso "9" d = 9
			caso "A" d = 10
			caso "B" d = 11
			caso "C" d = 12
			caso "D" d = 13
			caso "E" d = 14
			caso "F" d = 15
    FinSegun
	t0 = d * 16^0
	Escribir "Ingrese dígito hexadecimal posición 1 ?"
	Leer h1
	Segun h1 Hacer
			caso "0" d = 0
			caso "1" d = 1
			caso "2" d = 2
			caso "3" d = 3
			caso "4" d = 4
			caso "5" d = 5
			caso "6" d = 6
			caso "7" d = 7
			caso "8" d = 8
			caso "9" d = 9
			caso "A" d = 10
			caso "B" d = 11
			caso "C" d = 12
			caso "D" d = 13
			caso "E" d = 14
			caso "F" d = 15
    FinSegun
	t1 = d * 16^1
	Escribir "Ingrese dígito hexadecimal posición 2 ?"
	Leer h2
	Segun h1 Hacer
			caso "0" d = 0
			caso "1" d = 1
			caso "2" d = 2
			caso "3" d = 3
			caso "4" d = 4
			caso "5" d = 5
			caso "6" d = 6
			caso "7" d = 7
			caso "8" d = 8
			caso "9" d = 9
			caso "A" d = 10
			caso "B" d = 11
			caso "C" d = 12
			caso "D" d = 13
			caso "E" d = 14
			caso "F" d = 15
    FinSegun
	t2 = d * 16^2
	decimal = t0 + t1 + t2
	Escribir "Decimal = ", decimal
FinAlgoritmo
