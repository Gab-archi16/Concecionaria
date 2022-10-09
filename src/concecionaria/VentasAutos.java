/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concecionaria;
import java.util.Vector;
import java.util.Scanner;

/**
 *
 * @author Gabriel García
 */
public class VentasAutos {
     static Vector<Auto> almacena = new Vector<Auto>();
 
    public static void main(String[] args) {
        int opcion = -1;
        Scanner entrada = new Scanner(System.in);
        
        while(opcion != 0){
            System.out.println("Selecciona la opción");
           System.out.println(" 1 Agregar autos \n 2 Mostrar autos libres \n 3 Comprar auto \n 4 Mostrar autos vendidos");
           System.out.println("Inserta la opcion a escojer");
           opcion = entrada.nextInt();
           
           if(opcion == 1){
               
               System.out.println("Agragar id del auto");
               int cod = entrada.nextInt();
               System.out.println("Agrega la marca del auto");
               String mar = entrada.next();
               System.out.println("Agrega el model del auto");
               String mod = entrada.next();
               System.out.println("Agrega el año del auto");
               int an = entrada.nextInt();
               System.out.println("Agrega el precio");
               float prec = entrada.nextFloat();
               System.out.println("Agrega el descuento");
               float des  = entrada.nextFloat();
               System.out.println("");
        
           Auto a1 = new Auto();
           a1.id = cod;
           a1.marca = mar;
           a1.modelo = mod;
           a1.año = an;
           a1.precio = prec;
           a1.descuento = des;
       
        
        almacena.add(a1);
    
        }
           if(opcion == 2){
               for(Auto at: almacena){
                   System.out.println(almacena.toString());
               }
           }
    }   
    }
}
    

