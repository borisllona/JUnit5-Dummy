import java.util.HashMap;
import java.util.List;

interface Dictionary {
 void defineWord(String word, String definition);
 String getDefinitions(String word)
 throws NotDefinedException;
}

public class DictionaryImpl implements Dictionary{

    HashMap<String,String> hash;
    public DictionaryImpl(){
        hash = new HashMap<>();
    }

    @Override
    public void defineWord(String word, String definition) {
        hash.put(word,definition);
    }

    @Override
    public String getDefinitions(String word) throws NotDefinedException {
        if(hash.containsKey(word)){
            return (String) hash.get(word);
        }else {
            throw new NotDefinedException("La paraula no es troba en el diccionari");
        }
    }
}
