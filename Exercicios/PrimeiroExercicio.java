
package com.github.joaopsalgado.integracao.ex1;

import java.io.*;


public class Ex1 {

    
    
    public static void main(String[] args) throws IOException {
           String arquivo = PrimeiroExercicio((args[0]));
            System.out.println(arquivo);
    }

    
    public static String PrimeiroExercicio(String args) throws FileNotFoundException, IOException {

                  StringBuilder stringBuilder;
        
               try (FileInputStream fS = new FileInputStream(args)) {
                BufferedInputStream bS = new BufferedInputStream(fS);
                DataInputStream sD = new DataInputStream(bS);
                stringBuilder = new StringBuilder();
            

                 for (int i = 0; i < 4; i++) {
                 byte classByte = sD.readByte();
                 stringBuilder.append(String.format("%X ", classByte));

            }

                        fS.close();
        }
                      return stringBuilder.toString();

    }

}
