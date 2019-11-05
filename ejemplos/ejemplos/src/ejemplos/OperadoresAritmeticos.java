/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 2;
        int suma= valorA+valorB ;

        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB,
                valorA + valorB);
        System.out.printf("Resta: %d - %d = %d\n", valorA, valorB,
                valorA - valorB);
        System.out.printf("Multiplicación: %d * %d = %d\n", valorA, valorB,
                valorA * valorB);
        System.out.printf("División: %d / %d = %.2f\n", valorA, valorB,
                valorA / valorB);
        System.out.printf("Módulo o Resto: %d % %d = %d\n", valorA, valorB,
                valorA % valorB); //el comentario para esta linea  de codigo es
                                   //el residuo,modulo o resto se calcula con %
                                  //que el resto de la divicion en este caso
    }                              //ES EXACTA
                                   //el % es especial para print
                                   //las asignacines valor %s %d %f
}
