/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

/**
 *
 * @author Edgardo
 */
public class CadenaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        CadenaServicio cs=new CadenaServicio();
        Cadena c1=cs.crearFrase();
        System.out.println(c1);
        cs.Menu(c1);
    }
        
        
        
        
    }
    

