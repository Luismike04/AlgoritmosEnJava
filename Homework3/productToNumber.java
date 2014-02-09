/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   int resultado = integer.parseInt(args[0].toString());
                 int val=0;
for(int i=0; i<=resultado;i++){
val=val*i;
   		System.out.print(i+"x");

}
Sysitem.out.println();
   	System.out.println("= "+val);
      
   }

}