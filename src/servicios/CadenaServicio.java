/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * Crear una clase CadenaServicio en el paquete servicios que implemente los
 * siguientes métodos: Método mostrarVocales(), deberá contabilizar la cantidad
 * de vocales que tiene la frase ingresada. Método invertirFrase(), deberá
 * invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada:
 * "casa blanca", Salida: "acnalb asac". Método vecesRepetido(String letra),
 * recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se
 * repite el carácter en la frase, por ejemplo: Entrada: frase = "casa blanca".
 * Salida: El carácter 'a' se repite 4 veces.
 * Método compararLongitud(String
 * frase), deberá comparar la longitud de la frase que compone la clase con otra
 * nueva frase ingresada por el usuario. 
 * Método unirFrases(String frase), deberá
 * unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 * el usuario y mostrar la frase resultante. 
 * Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. 
 * Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase() {
        
        System.out.println("Ingrese una frase  ");
        Cadena cd=new Cadena(leer.nextLine());
        return cd;
    }
 public void Menu(Cadena cd){
        int opcion;
        String aux="",frase2="";
        do{
            System.out.println("--------MENU--------");
            System.out.println("1. Mostrar Vocales");
            System.out.println("2. Invertir Frase");
            System.out.println("3. Contador de repeticiones");
            System.out.println("4. Comprar Logitudes");
            System.out.println("5. Unir Frases");
            System.out.println("6. Reemplazar Caracter");
            System.out.println("7. Buscar Letra");
            System.out.println("8. Salir.");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    mostrarVocales(cd);
                    
                    break;
                case 2:
                    invertirFrase(cd);
                    break;
                case 3:
                    System.out.println("Que caracter desea contar?");
                    aux=leer.next();
                    vecesRepetido(cd,aux);
                    break;
                case 4:
                    System.out.println("Ingrese una frase para comparar");
                    frase2=leer.next();
                    compararLongitud(cd,frase2);
                    break;
                case 5:
                    System.out.println("Ingrese una frase para unir");
                    frase2=leer.next();
                    unirFrases(cd,frase2);
                    break;
                case 6:
                    System.out.println("Ingrese un caracter para reemplazar");
                    aux=leer.next();
                    reemplazar(cd,aux);
                    break;
                case 7:
                    System.out.println("Que letra quiere buscar?");
                    aux=leer.next();
                    Contiene(cd,aux);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }while (opcion!=8);
 }
    public void mostrarVocales(Cadena cd) {
        int cont = 0;
        int longitud = cd.getLongitud();
        String str = cd.getFrase().toLowerCase();
        for (int i = 0; i < longitud; i++) {
            switch (str.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cont++;
            }

        }
         System.out.println("El numero de vocales que tiene su frase es: " + cont);
    }
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
// Entrada: "casa blanca", Salida: "acnalb asac".   

    public void invertirFrase(Cadena cd) {
           String fraseInv="", aux;
        for (int i = cd.getLongitud()-1; i >= 0; i--) {
            aux=cd.getFrase().substring(i, i+1);
            fraseInv+=aux;
        }
        System.out.println("La frase invertida es: ");
        System.out.println(fraseInv);
    }
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
//cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido (Cadena cd, String letra){
       int cont=0;
       String aux;
       
       
        for (int i = 0; i < cd.getLongitud(); i++) {
            aux=cd.getFrase().substring(i, i+1);
            if (aux.equalsIgnoreCase(letra) ){
                cont++;
                System.out.println("El carácter "+letra+" se repite: "+cont);
            }
            
        }
        
        
    }
//Método compararLongitud(String
 // frase), deberá comparar la longitud de la frase que compone la clase con otra
 // nueva frase ingresada por el usuario. 
    
    public void compararLongitud(Cadena cd,String frase2 ){
        
       int aux=frase2.length();
        if (cd.getLongitud()==aux){
             System.out.println("La longitud de ambas frases son iguales.");
        }else{
            System.out.println("La longitud de ambas frases es distinta.");
        }
      
    }
   //Método unirFrases(String frase), deberá
 // unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 // el usuario y mostrar la frase resultante. 
    
    public void unirFrases(Cadena cd,String frase2){
        
          String resultante="";
        resultante=cd.getFrase().concat(frase2);
         System.out.println("La frase resultante unida es: "+resultante);
    }
   //Método reemplazar(String letra),
 // deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 // algún otro carácter seleccionado por el usuario y mostrar la frase
 // resultante. 
    public void reemplazar (Cadena cd,String letra){
        String aux,frase3="";
        
        for (int i = 0; i < cd.getLongitud(); i++) {
            aux=cd.getFrase().substring(i, i+1);
            if (aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("A") ){
                frase3=frase3.concat(letra);
            }else{
                frase3=frase3.concat(aux);
            } 
        }
        System.out.println("La frase modificada quedaria:");
        System.out.println(frase3);
        
    }
    public void Contiene(Cadena cd,String letra){
       String aux;
       boolean rta=false;
       for (int i = 0; i < cd.getLongitud(); i++) {
            aux=cd.getFrase().substring(i, i+1);
            if (aux.equalsIgnoreCase(letra) ){
                rta=true;
            }  
        }
        System.out.println(rta);
    } 
    }

