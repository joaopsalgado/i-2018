
package br.ufg.inf.es.integracao;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Objects;

/**
 * Criacao da classe estudante
 */
@JacksonXmlRootElement(localName = "Endereco")
public class Endereco {

    private String cep;
    private String logradouro;
    private int numero;

    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        logradouro = logradouro;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
 
    public String getComplemento() {
         return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
