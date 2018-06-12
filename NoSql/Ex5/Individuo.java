import org.json.JSONException;
import org.json.JSONObject;
 
public class Individuo {
 
    public static void main(String[] args) throws JSONException {
         
        /* -------------------------------------------------------
         * Integração 2018
         * cria um JSONObject para armazenar dados de um individuo
         * -------------------------------------------------------*/
         
        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();
 
        //preenche o objeto com o ID do indivíduo
        my_obj.put("ID", 1);

         
        //serializa para uma string e imprime
        String json_string = my_obj.toString();
        System.out.println("Identificador do indivíduo -> " + json_string);
        System.out.println();      
    }
}