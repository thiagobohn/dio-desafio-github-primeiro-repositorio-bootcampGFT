
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class Ex2_Consoantes {

    /**
     * @param args the command line arguments
     */
    
    /*
    Faça um Programa que leia um vetor de 6 caracteres,
    e diga quantas consoantes foram lidas.
    Imprima as consoantes.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner

        //definição das variáveis
        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        //laço que recebe a letra e armasena ela caso seja consoante
        for (int i = 0; i < 6; i++) {
            //bloco que recebe a letra
            System.out.println("Letra: ");
            String letra = sc.next();
            
            //Verifica se a letra é uma consoante e, caso seja, armasena-a
            if (!(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u"))){
                consoantes[quantConsoantes] = letra;
                quantConsoantes++;
            }
        }
        //Bloco que apresenta quais foram as consoantes digitadas
        System.out.println("Consoantes:");
        //o laço itera a quantidade de consoantes que foram digitadas
        for (int i = 0; i < quantConsoantes; i++){
            System.out.print(consoantes[i]);
        }
    }

}
