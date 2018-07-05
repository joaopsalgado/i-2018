package br.ufg.inf.es.integracao;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//Classe Calcados
@JacksonXmlRootElement(localName = "calcado")
public class Calcados {

//Getter and Setters
    
    private String marca;
    private float preco;
 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
