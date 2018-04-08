package exerciciodeintegracao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class QuartoExercicio {
       
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
       PrintWriter pw = new PrintWriter(args[0],"UTF-8");
            pw.write(args[1]);
            pw.close();
                             }
                 }
    
  
