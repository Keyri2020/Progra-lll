/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_02;

import java.util.Scanner;

/**
 *
 * @author Keyri
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //usamos la libreria de Scanner para poder capturar los numeros
        
        int number[] = new int[10]; //se define el Array de tipo entero, contendrá los números leídos por teclado, y tendra 10 posiciones comenzando desde la posicion 0
        int neg = 0, cero = 0, pos = 0; //Para contabilizar cuántas veces tendremos esos datos, se coloca 0 de forma inicial ya que no sabemos cuantos positivos, negativos y ceros habrán
        int i; //variable de iteracion que servirá para el ciclo for
        
        System.out.println("Ingrese 10 números enteros de su preferencia: "); //Se solicita al usuario los números para llenar el Array
        for (i = 0; i < number.length; i++){ //Sirve para recorrer el Array usando el ciclo for, iniciamos la variable de iteracion en la posicion 0,
                                             //Con number.length se recorre de forma exacta todas las posiciones de los valores que tendremos en nuesto array
                                             //usamos i++ para poder acceder a cada una de las posiciones el Array 
            number[i] = scan.nextInt(); //Se almacen los datos en el arreglo
        }
       
        
        for (i= 0; i < number.length; i++){ // 
            if(number[i] < 0){ //si los numeros ingresados son menores que 0, serán contados como números negativos
                neg++; // se le agrega el ++ para ingrementar 1 en la variable y poder realizar el conteo 
            } else if (number[i] > 0){ //si los numeros ingresados son mayores que 0, serán contados como numeros positivos
                pos++; 
            } else { // si los numeros son iguales a 0, serán contados como cero
                cero++;
            }
        }
        
        // Se muestran los resultados al usuario, concatenando la variable correspondiente para cada caso (negativo, positivos y/o ceros)
        System.out.println("Cantidad de negativos: "+neg); 
        System.out.println("Cantidad de positivos: "+pos);
        System.out.println("Cantidad de ceros: "+cero);
    }
}
