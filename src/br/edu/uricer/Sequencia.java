
package br.edu.uricer;

import java.util.ArrayList;
import static java.util.Collections.max;
import static java.util.Collections.min;
import java.util.Scanner;



public class Sequencia {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ArrayList numeros = new ArrayList();
        numeros.add(6);
        numeros.add(9);
        numeros.add(15);
        numeros.add(-2);
        numeros.add(92);
        numeros.add(11);
        
        
        System.out.println(max(numeros));
        System.out.println(min(numeros));
       
        System.out.println(numeros.size());
        
    
        
    }
}
