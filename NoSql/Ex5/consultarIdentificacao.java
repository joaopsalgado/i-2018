import org.json.JSONException;
import org.json.JSONObject;
 
public class consultarIdentificacao {
 
    public static void main(String[] args) throws JSONException {
         
        /* -------------------------------------------------------
         * Integração 2018
         * cria um JSONObject para procurar dados de um individuo
         * -------------------------------------------------------*/
         
        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();
 
        //preenche o objeto com o campo do usuario
        my_obj.put("usuario", "Joao");
        my_obj.put("usuario", "Joao");
		my_obj.put("Mae", "Maria");
		my_obj.put("Pai", "Pedro");
		my_obj.put("Endereco", "Rua 11");
		my_obj.put("Cidade", "Goiania");
	  
        //serializa para uma string e imprime
        String json_string = my_obj.toString();
        System.out.println("objeto pesquisado -> " + json_string);
        System.out.println();
         
        //altera o titulo e imprime a nova configuração do objeto
        my_obj.put("usuario", "Joao");
        json_string = my_obj.toString();
        System.out.println();
         
        //recupera campo por campo com o método get() e imprime cada um
        String nome = my_obj.getString("usuario");
		String mae = my_obj.getString("Mae");
		String pai = my_obj.getString("Pai");
        String endereco = my_obj.getString("Endereco");
        String cidade = my_obj.getString("Cidade");
       
	    System.out.println("usuario: " + nome);
		System.out.println("pai: " + pai);
        System.out.println("mae: " + mae);
        System.out.println("endereco: " + endereco); 
		System.out.println("cidade: " + cidade); 
		
    }
}