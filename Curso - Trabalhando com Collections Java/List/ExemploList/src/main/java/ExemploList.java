
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class ExemploList {

    /**
     * @param args the command line arguments
     */
    
    //Exercício proposto no curso "Trabalhando com Coollection Java"
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Crie uma lista e adicione as sete notas: ");

        //Criando um objeto Lista implementando ArrayList
        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        //Adicionando as notas na lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        
        //A classe List não possui métodos de comparação, nesse caso podemos utilizar esse método da classe Collections, uma vez q List implementa Collections
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        //para conseguir verificar todo o list utilizamos o iteraror
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;//criada variável para somar so elementos da lista
        while(iterator.hasNext()){//verifica se existe mais um elemento
            Double next = iterator.next();//atribui esse elemento na variável de referência next
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        iterator = notas.iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();
            if(next < 7) iterator.remove();
        }
        System.out.println(notas);
        
        System.out.println("Apague toda a lista");
        notas.clear();//método que apaga todos os elementos da lista
        System.out.println(notas);
        
        //método que verifica se a lista está ou não vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
    
}
