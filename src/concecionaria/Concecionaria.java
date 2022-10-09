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
public class Concecionaria {
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
                   if(at.status == false){
                   System.out.println(at.toString());
                }
               }
           }
           if(opcion == 3){
               System.out.println("Agrega el codigo del auto");
               int cav = entrada.nextInt();
               int conta = 0;
               for(Auto at: almacena){
                   if(at.id == cav){
                       at.status = true;
                       almacena.set(conta,at);
                   System.out.println(at.toString());
                }
                conta++;
               }
           }
           if(opcion == 4){
               for(Auto at: almacena){
                 if(at.status == true){
                     System.out.println(at.toString());
                    }
                 
                }
            }
           
           
    }   
    }   
}

//trabajo a realizar
/**
 * regtormar la clase de auto
 * y agregarle un atributo, de nombre estatus o vendido o libre
 * Agregar un menu de opciones para agragar autos al vecto
 * 1 comprar auto
 * 2 mostrar los autos libres
 * 3 mostrar autos vendidos
 * 
 */