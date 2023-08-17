/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trocaordem;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class TrocaOrdem {
    static char vetor[] ={'O', 'R', 'D', 'E', 'N', 'A'};
    static char aux;
    static int posOrigem;
    static int posDestino;
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a posição de origem: ");
        posOrigem = entrada.nextInt();
        System.out.println("Digite a posição de destino: ");
        posDestino = entrada.nextInt();
        
        troca();
    }
    public static void troca(){
        if(posOrigem < 1 || posOrigem >= 7 || posDestino < 1 || posDestino >= 7){
            System.out.println("Não é possível realizar a troca, pois as posições digitadas não pertencem ao vetor.");
        }
        else if(posOrigem == posDestino){
            System.out.println("Não é possível realizar a troca, pois as posições digitadas são iguais.");
        }
        else{ 
           posOrigem = posOrigem - 1;
           posDestino = posDestino - 1;
           
           aux = vetor[posOrigem];
           vetor[posOrigem] = vetor[posDestino]; 
           vetor[posDestino] = aux;
           
           System.out.println(vetor);
        }
    }
}