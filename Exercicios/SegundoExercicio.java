
package exerciciodeintegracao;

import java.io.*;

public class SegundoExercicio {

    public static void main(String[] args) throws IOException {

        boolean imagemqualquer = imagemqualquer(args[0]);

        System.out.println(imagemqualquer);
    }
    
    public static boolean imagemqualquer(String arquivo) throws FileNotFoundException, IOException {
        
        //Criação do Arquivo e faz a leitura do arquivo
        File file = new File(arquivo);
        long tamanho = file.length();
        
        FileInputStream fis = new FileInputStream(arquivo);
        DataInputStream dis = new DataInputStream(fis);
        
        //Realiza a leitura do 1 e 2 byte;
        byte primeirobyte = dis.readByte();
        byte segundobyte = dis.readByte();
        
        //Skipped joga para os ultimos bytes do arquivo JPEG
        long skipped = dis.skip(tamanho - 4);

        byte penultimobyte = dis.readByte();
        byte ultimobyte = dis.readByte();
        
        dis.close();
        
        //Compara os bytes com o esperado de uma imagem JPEG;
        final boolean primeiroIgual = primeirobyte == (byte) 0xFF;
        final boolean segundoIgual = segundobyte == (byte) 0xD8;
        final boolean terceiroIgual = penultimobyte == (byte) 0xFF;
        final boolean quartoIgual = ultimobyte == (byte) 0xD9;
        
        return primeiroIgual && segundoIgual
                && terceiroIgual && quartoIgual;
    }

    }

