/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolamusic;

import java.util.ArrayList;

/**
 *
 * @author davil
 */
public class EscolaMusic {

     public static void main(String[] args) {
      ArrayList<Pessoa> pessoas = new ArrayList<>();
      
      pessoas.add(new Aluno("Carla", 20, "MUSICA GERAL - TURMA A"));
      pessoas.add(new Professor("Renata", 45, "PROFESSORA TURMA B - AULAS DE PARTITURAS"));
      pessoas.add(new Funcionario ("Henrique", 25, "ANALISTA DE DOCUMENTOS - SETOR DE ADMINISTRACAO"));
      
      for (Pessoa pessoa : pessoas) {
        pessoa.atividade();
        
        if (pessoa instanceof Identificavel) {
          System.out.println("ID: " + ((Identificavel) pessoa).getId());
        }
      }
   }
}
