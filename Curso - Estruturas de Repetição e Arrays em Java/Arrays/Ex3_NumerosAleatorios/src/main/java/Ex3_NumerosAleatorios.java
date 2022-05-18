
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class Ex3_NumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    /*
    Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final mostre os números e seus sucessores.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();//criando o objeto da classe Random

        int[] numsAleatorios = new int[20];//inicializa o vetor que vai receber os 20 números aleatórios

        //laço para gerar e mostrar os 20 números aleatórios
        System.out.println("Numeros Aleatorios:");
        for (int i = 0; i < numsAleatorios.length; i++) {
            numsAleatorios[i] = random.nextInt(100);
            System.out.print(numsAleatorios[i] + " ");
        }

        //bloco para mostrar os números sucessores aos números gerados
        System.out.println("\nSucessores dos Numeros Aleatorios:");
        for (int numero : numsAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }

}
