import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class MediaTemperatura {

    /**
     * @param args the command line arguments
     */
    /*Faça um programa que receba a temperatura média dos 6 primeiros meses
    do ano e armazene-as em uma lista.
    Mostre todas as temperaturas a cima dessa média e em que mês elas ocorreram.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();//criando o objeto da classe Random

        //cria a lista da classe de médias de temperatura por mês
        List<mediaTempMes> tempMedia  = new ArrayList<>();
        
        float media = 0;//variável que vai armazenar a média das temperaturas
        
        /*bloco que cria de forma randomica a temperatura média dos meses do
        primeiro semestre e calcula a média desse valor.
        Temperatura gerada em inr e média em short
        */
        tempMedia.add(new mediaTempMes("Janeiro", random.nextInt(30)));
        media += tempMedia.get(0).getMedia();
        tempMedia.add(new mediaTempMes("Fevereiro", random.nextInt(30)));
        media += tempMedia.get(1).getMedia();
        tempMedia.add(new mediaTempMes("Março", random.nextInt(30)));
        media += tempMedia.get(2).getMedia();
        tempMedia.add(new mediaTempMes("Abril", random.nextInt(30)));
        media += tempMedia.get(3).getMedia();
        tempMedia.add(new mediaTempMes("Maio", random.nextInt(30)));
        media += tempMedia.get(4).getMedia();
        tempMedia.add(new mediaTempMes("Junho", random.nextInt(30)));
        media += tempMedia.get(5).getMedia();
        media /= 6;//calcula a temperatura média dos meses do primeiro semestre
        
        /*bloco apresenta o Array craido para armazenar os dados criados e
        apresenta a média calculada
        */
        System.out.println(tempMedia.toString());
        System.out.println("A médias das temperaturas desse semestre foi: " + media);
        
        /*bloco criado para apresentar os meses que tiveram temperaturas a cima
        da média semestral
        */
        System.out.println("Os meses desse primeiro semestre que ficarm acima da média de temperatura são:");
        for (int i = 0; i < 6; i ++){
            if(tempMedia.get(i).getMedia()>media)
                System.out.println(tempMedia.get(i).getMes());
        }
    }

    /*classe criada para armazenar a média das temperaturas por mês
    */
    public static class mediaTempMes {
        
        private String mes;
        private int media;

        public mediaTempMes(String mes, int media) {
            this.mes = mes;
            this.media = media;
        }

        public String getMes() {
            return mes;
        }

        public int getMedia() {
            return media;
        }

        public void setMes(String mes) {
            this.mes = mes;
        }

        public void setMedia(int media) {
            this.media = media;
        }

        @Override
        public String toString() {
            return "{" + "mes=" + mes + ", media=" + media + '}';
        }

        
    }
}
