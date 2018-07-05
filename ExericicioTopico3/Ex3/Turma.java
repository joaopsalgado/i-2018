package br.ufg.inf.es.integracao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;

/**
 * Classe que chama a classe Estudantes e Disciplina
 */
@JacksonXmlRootElement(localName = "Turma")
public class Turma {

    private String disciplina;
    @JacksonXmlElementWrapper(localName = "Estudantes")
    @JacksonXmlProperty(localName = "Estudante")
    private ArrayList<Estudante> estudante;

//Getters And Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Estudante> getEstudante() {
        return estudante;
    }

    public void setEstudante(ArrayList<Estudante> estudante) {
        this.estudante = estudante;
    }

}
