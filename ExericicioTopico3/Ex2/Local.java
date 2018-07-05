package br.ufg.inf.es.integracao;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.ArrayList;

/**
 * Criacao  da classe Local.
 */
@JacksonXmlRootElement(localName = "calcados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Local {

//Geracao dos Getters and Setters
    
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Sapatos> sapatos;
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Tenis> tenis;

    public ArrayList<Sapatos> getSapatos() {
        return sapatos;
    }
    
    public void setSapatos(ArrayList<Sapatos> sapatos) {
        this.sapatos = sapatos;
    }

    public ArrayList<Tenis> getTenis() {
        return tenis;
    }
    
    public void setTenis(ArrayList<Tenis> tenis) {
        this.tenis = tenis;
    }
}
