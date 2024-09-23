/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusic;

/**
 *
 * @author davil
 */
    public abstract class Pessoa {
    protected String nome;
    protected int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract void atividade();
}

