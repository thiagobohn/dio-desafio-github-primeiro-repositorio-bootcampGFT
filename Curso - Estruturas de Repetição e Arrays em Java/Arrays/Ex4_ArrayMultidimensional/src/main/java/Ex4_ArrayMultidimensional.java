
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class Ex4_ArrayMultidimensional {

    /**
     * @param args the command line arguments
     */
    /*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();//criando o objeto da classe Random

        int[][] matriz = new int[4][4];//inicializa a matriz 4x4;

        //bloco que vai gerar e imprimir a matriz 4x4 com valores randomicos de 0 a 9
        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {//laço que percorre as linhas
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {//laço que percorre as colunas
                matriz[i][j] = random.nextInt(9);//gera o número inteiro de 0 a 9 de forma randomica
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

}
