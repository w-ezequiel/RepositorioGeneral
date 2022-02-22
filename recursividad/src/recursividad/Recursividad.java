/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author zas
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                long posision=7;
		long valordeconsulta = fibonacciRe(posision);
		System.out.println("El que va en la posición "+posision+" es " 
                + valordeconsulta);
                
                System.out.println("todos los valores de la susecion son: ");
                // toda la sucesion
                for(int i = 0; i<=posision; i++){
               System.out.print(fibonacciRe(i) + ", ");
          }
    }
    //metodo usado
    public static long fibonacciRe(long posicion) {
		
                if (posicion < 2)
			return posicion;
                else 
		return fibonacciRe(posicion - 1) + fibonacciRe(posicion - 2);
	}
}
