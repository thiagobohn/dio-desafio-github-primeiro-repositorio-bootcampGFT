/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class cepAPI {
    private static cepAPI instancia = new cepAPI();
    
    private cepAPI(){
        super();
    }
    
    public static cepAPI getInstancia(){
        return instancia;
    }
    
    public String recuperarCidade(String ceo){
        return "Araraquara";
    }
    
     public String recuperarEstado(String ceo){
        return "São Paulo";
    }
}
