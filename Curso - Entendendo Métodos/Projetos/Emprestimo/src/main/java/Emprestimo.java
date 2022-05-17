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
    public static int getDuasParcelas() { // método criado para exemplificar a possibilidade de chamara métodos como parâmetro ao chamar outro método
        return 2;
    }

    public static int getTresParcelas() { // método criado para exemplificar a possibilidade de chamara métodos como parâmetro ao chamar outro método
        return 3;
    }

    public static double getTaxaDuasParcelas() { //Método criado para exemplificar que é possível chamar um método dentro do código de outro método
        return 0.3;
    }

    public static double getTaxaTresParcelas(){ //Método criado para exemplificar que é possível chamar um método dentro do código de outro método
        return 0.45;
    }
    
    public static void calcular (double valor, int parcelas){ //método que calcula o valor final do empréstimo
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas()); //Operação que chama o método da taxa de juros utilizado dentro do método que calcula o valor final do empréstimo
            System.out.println("O valor final do emprestimo para duas parcelas é de " + valorFinal);
        }
        else if (parcelas ==3){
            double valorFinal = valor + (valor * getTaxaTresParcelas()); //Operação que chama o método da taxa de juros utilizado dentro do método que calcula o valor final do empréstimo
            System.out.println("O valor final do emprestimo para trêscd /c parcelas é de " + valorFinal);
        }
        else{
            System.out.println("Valor de parcelas não aceita");
        }
    }
    
    public static void main(String[] args) {
        calcular(1000,getDuasParcelas()); //Chamada do método calcular passando como parâmetro o retorno de um outro método
        calcular(1000,getTresParcelas()); //Chamada do método calcular passando como parâmetro o retorno de um outro método
        calcular(1000,5); //Chamada do método calcular para testa um valor de exceção
    }

}
