/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Cliente {
    private String nome;
    private int CPF;

    public Cliente(String nome, int CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
}
