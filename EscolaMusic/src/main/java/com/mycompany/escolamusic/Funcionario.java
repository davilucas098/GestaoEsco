/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusic;

/**
 *
 * @author davil
 */
public class Funcionario extends Pessoa implements Identificavel {
    
    private String cracha;
    public Funcionario(String nome, int idade, String cracha){
      super(nome, idade);
      this.cracha = cracha;
      
    }

    @Override
    public void atividade() {
        System.out.println(" Esta realizando funçoes administrativas da Escola");
    }

    @Override
    public String getId() {
        return cracha;
    }
}