/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concecionaria;

/**
 *
 * @author Gabriel García
 */
public class Auto {
    int id;
    String marca;
    String modelo;
    int año;
    float precio;
    float descuento;
    boolean status;

    public String toString(){
        return this.id+" "+this.marca+" "+
                this.modelo+" "+this.precio+" "
                +this.descuento+" "+this.status;
    }
         
}
