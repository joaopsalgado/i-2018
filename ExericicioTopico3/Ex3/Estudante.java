package br.ufg.inf.es.integracao;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Criacao da classe Estudante;
 */
public class Estudante {

   private String nome;
  
   private int matricula;
   
   @JsonProperty("Endereço")
  
   private Endereco endereco;
   
//Geração dos Getters and Setters   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getMatricula() {
        return matricula;
    }

   public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
