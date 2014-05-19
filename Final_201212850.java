import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Final_201212850{
     File archivo;
     Scanner scan;
     
     FileWriter fichero;
    BufferedWriter buffer;
    PrintWriter escritura;
       
     String contenido;
     int NumeroLineas;
     int NumeroCaso, maximo, minimo;
     boolean comprobar;
     public Final_201212850(){
         archivo = null;
         scan = null;
         contenido="";
          fichero = null;
        escritura = null;
        buffer = null;
     }
 public void leerArchivo(String direccion){
        contenido="";
         
         try{
             archivo = new File(direccion);
             scan = new Scanner(archivo);         
             NumeroLineas=scan.nextInt();
             int contador=0;
             String datos[]=new String[NumeroLineas];
            // System.out.println(NumeroLineas);
              while(scan.hasNextLine()){
                   datos [contador]=scan.nextInt()+"  "+scan.nextInt();
                // System.out.println(datos[contador]);
                   contador++; 
              }
             for(int i=0; i<NumeroLineas; i++){
                 NumeroCaso=0;
                 comprobar=false;
                 String temporal1="";
                 String temporal2="";
            for(int j=0; j<datos[i].length(); j++){
                if(!comprobar){
                    if(!" ".equals(datos[i].substring(j,j+1))){
                        temporal1+=datos[i].substring(j,j+1);
                    }
                }
                if(comprobar){
                    if(!" ".equals(datos[i].substring(j,j+1))){
                        temporal2+=datos[i].substring(j,j+1);
                    }
                }
                if(!comprobar&&" ".equals(datos[i].substring(j,j+1))){
                    comprobar=true;
                }
            }    
            int valor1=Integer.valueOf(temporal1);
            int valor2=Integer.valueOf(temporal2);
                    
            maximo=Math.max(valor1,valor2);
            minimo=Math.min(valor1,valor2);
            String Arreglo[]=new String[maximo];
            for(int j=minimo; j<=maximo; j++){
                String temp=String.valueOf(j);      
                for(int z=1; z<temp.length(); z++){
                    String cadena=temp.substring(z, temp.length()).concat(temp.substring(0, z));
                    if(!"0".equals(cadena.substring(0,1))){
                        int longitud=Integer.parseInt(cadena);
                        if(j<longitud&&longitud<=maximo){
                            int size=sizeArreglo(Arreglo);
                            boolean comprobar=false;
                            for(int w=0; w<size; w++){
                                if((j+" "+longitud).equals(Arreglo[w])){
                                    comprobar=true;
                                    w=size;
                                }
                            }
                            if(!comprobar){
                                Arreglo[size]=j+" "+longitud;
                                NumeroCaso++;
                            }
                        }
                    }
                }
            }
            System.out.println("Caso #"+(i+1)+":"+NumeroCaso);
            String archivo="Caso #"+(i+1)+":"+NumeroCaso;
            String direccion2=direccion.replaceAll("dataset1","dataset2");
            escrituraArchivoAgregar(archivo,direccion2);
        }
         }catch(Exception ex){
            //System.out.println(ex.getMessage()); 
         }
        try{
            if(scan!=null)
            {
                scan.close();
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
       public void escrituraArchivoAgregar(String archivo, String direccion){
        try {
            fichero = new FileWriter(direccion,true);
            buffer = new BufferedWriter(fichero);
            escritura = new PrintWriter(buffer);
            
            escritura.println(archivo);
            escritura.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 public  int sizeArreglo(String Arreglo[]){
        int size=0;
        for(int i=0;i<Arreglo.length; i++)
        {
            if(Arreglo[i]==null)
            {
                size=i;
                i=Arreglo.length;
            }
        }
        return size;
    }
    public static void main(String[] args) {
    String datos=args[0];
    System.out.println(datos);
    new Final_201212850().leerArchivo(datos);   
    }   
}
