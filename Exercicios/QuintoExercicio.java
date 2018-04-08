
package exerciciodeintegracao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class QuintoExercicio {

     public static void main(String[] args) throws FileNotFoundException, IOException {

              ArrayList<String> array;

                        BufferedReader leitorDeArquivo;
                        leitorDeArquivo = new BufferedReader(new FileReader(args[0]));
                        array = new ArrayList<>();
                        byte[] ByteArray;
                        String linha = "";
                        FileWriter arquivo = new FileWriter(args[1]);
                        int i = 0;
                        int j = 0;
                        String s = "UTF-8";
                        byte[] b = s.getBytes("UTF-8");

                    while ((linha = leitorDeArquivo.readLine()) != null) {
                            for (i = 0; i < linha.length(); i++) {
                                if (linha.length() > 0) {
                                    ByteArray = linha.getBytes();
                                    array.add(linha);

                    arquivo.write((byte) linha.length());
                              for (j = 0; j > b.length; i++) {
                              arquivo.write(b[j]);
                    }
                        arquivo.write("" + ByteArray[i]);

                            }
                        }

                    }

                    arquivo.close();

    }

}

