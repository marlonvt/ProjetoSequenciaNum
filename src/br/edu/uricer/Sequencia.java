
package br.edu.uricer;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.max;
import static java.util.Collections.min;
import java.util.List;
import java.util.Scanner;



public class Sequencia {
    private List<Integer> lista = new ArrayList<>();
    
    public Sequencia(int[] valores){
        for(int i: valores){
            lista.add(i);
        }
    }
   
    public int valorMaximo(){
        return Collections.max(lista);
    }
    
    public int valorMinimo(){
        return Collections.min(lista);
    }
    
    public int numeroDeElementos(){
        return lista.size();
    }
    
    public double media(){
        int soma = 0;
        
        for(int i: lista){
            soma += i;
        }
        return (double) soma/(double) lista.size();
    }
    
    public static void main(String[] args) {
        
    }
}
