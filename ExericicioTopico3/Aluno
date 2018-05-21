/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe que recebe como argumento o nome de um arquivo 
 * no formato CSV (colunas separadas por “;”) e produz 
 * um documento XML equivalente.
 */
public class Questao1 {

    /**
     * Método de interação entre os parametros
     * de  entrada e outros métodos.
     */
    public void main(String[] args) throws IOException, JAXBException {
        String arquivo = "arquivo.csv";
        ListaAlunos turma = new ListaAlunos();
        turma = recuperar(arquivo);
        arquivo = "arquivo.xml";
        gerarXml(turma, arquivo);
    }

    /**
     * Método transforma os dados de um arquivo xml
     * e os transforma em objetos java.
     */
    public static ListaAlunos recuperar(String arquivo) throws IOException {
        Aluno aluno = new Aluno();
        ListaAlunos listaAlunos = new ListaAlunos();
        char separaAtributo = ';';
        arquivoGerado = Paths.get(arquivo);
        Charset utf8 = Charset.forName("UTF-8");
        for (String line : Files.readAllLines(arquivoGerado, utf8)) {
            String[] aln = line.split(String.valueOf(separaAtributo));
            aluno.setNome(aln[line.length()-2]);
            aluno.setEmail(aln[line.length()-1]);
            listaAlunos.setListaAlunos(aluno);
        }
        return listaAlunos;
    }

    /**
     * Método que gerar um arquivo xml à partir dos objetos de entrada.
     * @param turma objeto a se gravado.
     * @param arquivo nome do arquivo.
     * @throws JAXBException lançamento da exeção.
     */
    public static void gerarXml(ListaAlunos turma, String arquivo) throws JAXBException {

        JAXBContext contxt = JAXBContext.newInstance(ListaAlunos.class);
        Marshaller Mll = contxt.createMarshaller();
        Mll.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        Mll.marshal(turma, new File(arquivo));
    }
}
