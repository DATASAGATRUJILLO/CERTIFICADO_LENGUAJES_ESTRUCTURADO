@ECHO OFF
schtasks /create ^
         /sc once ^
         /tn "PROYECTO CONSOLA JAVA" ^
         /tr "C:\CURSOS\OTROS\PROJECTSCMD\COMANDOS_0007.CMD\EJECUTAR.CMD" ^
         /st 01:08 ^
         /f
PAUSE