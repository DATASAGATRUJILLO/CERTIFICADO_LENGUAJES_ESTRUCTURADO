Algoritmo ConvertirHexadecimalDecimal
	Definir h0,h1,h2 Como Caracter
	Escribir "Ingrese dígito hexadecimal posición 0 ?"
	Leer h0 //0 1 2 3 4 5 6 7 8 9 A B C D E F    
	Si h0 = "0" Entonces
		t0 = 0 * 16^0
    FinSi
	Si h0 = "1" Entonces
		t0 = 1 * 16^0
    FinSi
	Si h0 = "2" Entonces
		t0 = 2 * 16^0
    FinSi
	Si h0 = "3" Entonces
		t0 = 3 * 16^0
    FinSi
	Si h0 = "4" Entonces
		t0 = 4 * 16^0
    FinSi
	Si h0 = "5" Entonces
		t0 = 5 * 16^0
    FinSi
	Si h0 = "6" Entonces
		t0 = 6 * 16^0
    FinSi
	Si h0 = "7" Entonces
		t0 = 7 * 16^0
    FinSi
	Si h0 = "8" Entonces
		t0 = 8 * 16^0
    FinSi
	Si h0 = "9" Entonces
		t0 = 9 * 16^0
    FinSi
	Si h0 = "A" Entonces
	   t0 = 10 * 16^0
    FinSi
    Si h0 = "B" Entonces
	   t0 = 11 * 16^0
    FinSi
    Si h0 = "C" Entonces
	   t0 = 12 * 16^0
   FinSi
   Si h0 = "D" Entonces
	   t0 = 13 * 16^0
   FinSi
   Si h0 = "E" Entonces
	   t0 = 14 * 16^0
   FinSi
   Si h0 = "F" Entonces
	   t0 = 15 * 16^0
   FinSi
	Escribir "Ingrese dígito hexadecimal posición 1 ?"
	Leer h1
	Si h1 = "0" Entonces
		t1 = 0 * 16^1
    FinSi
	Si h1 = "1" Entonces
		t1 = 1 * 16^1
    FinSi
	Si h1 = "2" Entonces
		t1 = 2 * 16^1
    FinSi
	Si h1 = "3" Entonces
		t1 = 3 * 16^1
    FinSi
	Si h1 = "4" Entonces
		t1 = 4 * 16^1
    FinSi
	Si h1 = "5" Entonces
		t1 = 5 * 16^1
    FinSi
	Si h1 = "6" Entonces
		t1 = 6 * 16^1
    FinSi
	Si h1 = "7" Entonces
		t1 = 7 * 16^1
    FinSi
	Si h1 = "8" Entonces
		t1 = 8 * 16^1
    FinSi
	Si h1 = "9" Entonces
		t1 = 9 * 16^1
    FinSi
	Si h1 = "A" Entonces
		t1 = 10 * 16^1
    FinSi
    Si h1 = "B" Entonces
		t1 = 11 * 16^1
    FinSi
    Si h1 = "C" Entonces
		t1 = 12 * 16^1
	FinSi
	Si h1 = "D" Entonces
		t1 = 13 * 16^1
	FinSi
	Si h1 = "E" Entonces
		t1 = 14 * 16^1
	FinSi
	Si h1 = "F" Entonces
		t1 = 15 * 16^1
	FinSi
	Escribir "Ingrese dígito hexadecimal posición 2 ?"
	Leer h2
	Si h2 = "0" Entonces
		t2 = 0 * 16^2
    FinSi
	Si h2 = "1" Entonces
		t2 = 1 * 16^2
    FinSi
	Si h2 = "2" Entonces
		t2 = 2 * 16^2
    FinSi
	Si h2 = "3" Entonces
		t2 = 3 * 16^2
    FinSi
	Si h2 = "4" Entonces
		t2 = 4 * 16^2
    FinSi
	Si h2 = "5" Entonces
		t2 = 5 * 16^2
    FinSi
	Si h2 = "6" Entonces
		t2 = 6 * 16^2
    FinSi
	Si h2 = "7" Entonces
		t2 = 7 * 16^2
    FinSi
	Si h2 = "8" Entonces
		t2 = 8 * 16^2
    FinSi
	Si h2 = "9" Entonces
		t1 = 9 * 16^2
    FinSi
	Si h2 = "A" Entonces
		t2 = 10 * 16^2
    FinSi
    Si h2 = "B" Entonces
		t2 = 11 * 16^2
    FinSi
    Si h2 = "C" Entonces
		t2 = 12 * 16^2
	FinSi
	Si h2 = "D" Entonces
		t2 = 13 * 16^2
	FinSi
	Si h2 = "E" Entonces
		t2 = 14 * 16^2
	FinSi
	Si h2 = "F" Entonces
		t2 = 15 * 16^2
	FinSi
	decimal = t0 + t1 + t2
	Escribir "Decimal = ", decimal
FinAlgoritmo
