import org.json.JSONException;
import org.json.JSONObject;
 
public class alterarDados {
 
    public static void main(String[] args) throws JSONException {
         
        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();
 
        //preenche o objeto com o campo endereco
        my_obj.put("endereco", "Rua 10");
         
        //serializa para uma string e imprime
        String json_string = my_obj.toString();
        System.out.println("objeto original -> " + json_string);
        System.out.println();
         
        //altera o endereco e imprime a nova configuração do objeto
        my_obj.put("endereco", "Rua 11");
        json_string = my_obj.toString();
        System.out.println("objeto com o endereco modificado -> " + json_string);
        System.out.println();
         
        //recupera campo por campo com o método get() e imprime cada um
        String endereco = my_obj.getString("endereco");

        System.out.println("endereco: " + endereco);
 
    }
}