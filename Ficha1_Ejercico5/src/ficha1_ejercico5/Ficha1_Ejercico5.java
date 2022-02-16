/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1_ejercico5;

/**
 *
 * @author Sergio
 */
public class Ficha1_Ejercico5 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        System.out.println("valor i = " + i + " abans de cridar a la funcio modificar");
        modificar(i);

        System.out.println("valor i = " + i + " despres de cridar a la funcio modificar");
        System.out.println("");
        
        
        System.out.println("HOLA GENTE, ESTO ES UNA PRUEBA PARA GitHub");
        System.out.println("Esto es una segunda linea ");

    }

    static void modificar(int variable) { // el void no devuelve nada , en el ejercicio 6 podemos ver la diferencia.
        System.out.println("variable " + variable + " dins de la funcio modificar");
        variable = 9;
        System.out.println("variable " + variable + " dins de la funcio modificar");
        return;      
    }

}

