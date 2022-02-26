/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author zas
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 5;
        int resultado=factorial(numero);
     //numero especifico
        System.out.println("El factorial de "+numero+" es " + resultado); 
        
        //intervalo
        System.out.println("todos los valores del factorial son: ");
                // toda la sucesion
                for(int i = 1; i<=numero; i++){
               System.out.print(factorial(i) + ", ");
    }
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
}
