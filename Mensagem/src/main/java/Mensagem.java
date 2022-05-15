/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Mensagem {

    public static void mensagemBomDia() { //método com a msg de bom dia
        System.out.println("Bom dia!!");
    }

    public static void mensagemBoaTarde() { //método com a msg de boa tarde
        System.out.println("Boa tarde!!");
    }

    public static void mensagemBoaNoite() { //método com a msg de boa noite
        System.out.println("Boa noite!!");
    }

    public static void obterMensagem(int hora) { //método que define qual msg deve ser informafa

        switch (hora) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12 -> mensagemBomDia(); //exemplo de utilização de método dentro de mátodo. Prática comum
            case 13, 14, 15, 16, 17, 18 -> mensagemBoaTarde(); //exemplo de utilização de método dentro de mátodo. Prática comum
            case 19, 20, 21, 22, 23, 24 -> mensagemBoaNoite(); //exemplo de utilização de método dentro de mátodo. Prática comum
            default -> System.out.println("Hora inválida");
        }

    }

    public static void main(String[] args) {
        int hora = 6;
        //testes de mensagem em todas as bordas dos casos planejados
        obterMensagem(hora);//esperado msg Bom dia
        hora = 12;
        obterMensagem(hora);//esperado msg Bom dia
        hora = 13;
        obterMensagem(hora);//esperado msg Boa tarde
        hora = 18;
        obterMensagem(hora);//esperado msg Boa tarde
        hora = 19;
        obterMensagem(hora);//esperado msg Boa noite
        hora = 24;
        obterMensagem(hora);//esperado msg Boa noite
        hora = 0;
        obterMensagem(hora);//esperado msg Bom dia
        hora = -1;
        obterMensagem(hora);//esperado msg hora invpalida
        hora = 25;
        obterMensagem(hora);//esperado msg hora invpalida
    }

}
