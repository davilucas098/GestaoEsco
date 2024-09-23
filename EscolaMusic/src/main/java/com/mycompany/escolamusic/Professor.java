/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusic;

/**
 *
 * @author davil
 */
public class Professor extends Pessoa implements Identificavel {
    
    protected String registro;
    public Professor (String nome, int idade, String registro){
      super(nome, idade);
      this.registro = registro;
    }

    @Override
    public void atividade() {
        System.out.println(nome + " Esta ensinando os alunos a tocar varios instrumentos, como violino");
    }

    @Override
    public String getId() {
       return registro;
    }
}
