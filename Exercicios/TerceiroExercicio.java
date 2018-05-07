package com.github.joaopsalgado.integracao.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex3 {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
         while (br.ready()) {
            String linha = br.readLine();
              System.out.println(linha);
                                         }
                          }
                  }
           }    




