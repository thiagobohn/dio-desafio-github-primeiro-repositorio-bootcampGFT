/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Ex1_OrdemInversa {

    /**
     * @param args the command line arguments
     */
    /*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] vetor = {-8, 6, 5, -18, 10, -35};//inicia o vetor
        
        //bloco para mostrar o vetor original
        System.out.println("Vetor:");
        for (int i = 0; i < 6; i++) {//laço crescente para apresentar o vetor na ordem original
            System.out.print(vetor[i] + " ");
        }

        //bloco para mostrar o vetor invertido
        System.out.println("Vetor invertido:");
        for (int i = 5; i >= 0; i--) {//laço decrescente para apresentar o vetor na ordem inversa
            System.out.print(vetor[i] + " ");
        }
    }

}
