import org.json.JSONException;
import org.json.JSONObject;
 
public class localizarIdentificacao {
 
    public static void main(String[] args) throws JSONException {
         
        /* -------------------------------------------------------
         * Integração 2018
         * cria um JSONObject para armazenar a localização
         * -------------------------------------------------------*/
         
        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();
 
        //preenche o objeto com os dados do indivíduo
        my_obj.put("Nome", "Joao");
		my_obj.put("Mae", "Maria");
		my_obj.put("Pai", "Pedro");
		my_obj.put("DataNascimento", 10/05/2000);
		my_obj.put("Endereco", "Rua 11");
		my_obj.put("Cidade", "Goiania");
     
        //serializa para uma string e imprime
        String json_string = my_obj.toString();
        System.out.println("Identificador do indivíduo -> " + json_string);
        System.out.println();      
    }
}