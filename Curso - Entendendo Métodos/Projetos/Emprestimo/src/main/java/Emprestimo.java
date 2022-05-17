/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Emprestimo {

    /**
     * @param args the command line arguments
     */
    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }
    
    public static void calcular (double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final do emprestimo para duas parcelas é de " + valorFinal);
        }
        else if (parcelas ==3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final do emprestimo para três parcelas é de " + valorFinal);
        }
        else{
            System.out.println("Valor de parcelas não aceita");
        }
    }
    
    public static void main(String[] args) {
        calcular(1000,getDuasParcelas());
        calcular(1000,getTresParcelas());
        calcular(1000,5);
    }

}
