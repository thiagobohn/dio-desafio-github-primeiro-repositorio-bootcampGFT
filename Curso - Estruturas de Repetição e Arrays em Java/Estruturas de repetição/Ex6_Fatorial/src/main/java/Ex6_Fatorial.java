
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class Ex6_Fatorial {

    /**
     * @param args the command line arguments
     */
    /*
    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner

        //Declara as variáveis
        int num, cont = 1, fat = 1;

        //Bloco onde é informado o número que será calculado o fatorial
        System.out.println("Número: ");
        num = sc.nextInt();

        //loop criado para calcular o fatorial do número fornecido
        do {
            fat *= cont;
            cont++;
        } while (cont <= num);
        
        System.out.println("O fatorial de " + num + " é: " + fat);
    }

}
