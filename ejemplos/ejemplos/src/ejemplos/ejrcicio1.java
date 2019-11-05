/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author UTPL
 * un padre de familia a pagado 3 cuatas de navidad de sus hijos la cuata 1 fue 
 * de 15 dolres la cuota 2 fue de 10 dolares
 * y la cuota 3 fue de 16 dolares generar un programa en lenguaje java 
 * que permita ingresar por teclado los valores de las cuotas 
 * luego presentar el promedio de dolares pagados entre las cuotas 
 * ademas presentar un mensaje en pantalla(true or false)dependiendo del 
 * promedio si el promedio es mayor o igual a 11 deveria salir true
 * si el promedio es  menor a 11 deberia ser false
 */
public class ejrcicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int  uno;
        int  dos;
        int  tres;
        int promedio;
        
        System.out.println("Ingresar el valor de la cuota 1");
        uno = entrada.nextInt();
        System.out.println("ingrese el valor de la cuota 2");
        dos = entrada.nextInt();
        System.out.println("Ingresar el valor de la cuota 3");
        tres = entrada.nextInt();
        
        promedio = (uno + dos + tres)/3;
        
        System.out.printf("el promedio de las cuotas: %d\n" + "promedio es: %s\n",
                promedio,promedio >=11);
        
       
    }
}
