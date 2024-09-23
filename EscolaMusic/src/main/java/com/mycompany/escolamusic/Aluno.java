/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusic;

/**
 *
 * @author davil
 */
public class Aluno extends Pessoa implements Identificavel{
    
    private String matricula;
    public Aluno(String nome, int idade, String matricula){
      super(nome, idade);
      this.matricula = matricula;
      
    }
    @Override
    public void atividade() {
       System.out.println(nome + " esta e aprendendo a tocar varios instrumentos como violino");
    }

    @Override
    public String getId() {
      return matricula;
    }
    
}
