/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
int num=0;
num= Integer.parseInt(args[0].toString());
      if(num%2==1){
      	
// si el numero es impar
	System.out.println("numero es impar");
}
 else{  		// si el numero es par
   		System.out.println("numero es par");
}
   }
}