import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

class RnaTranscription {

    private static final Map<Character,Character> RNA_MAP;
    static{
        Hashtable<Character,Character> tmp = new Hashtable<>();
        tmp.put('G', 'C');
        tmp.put('C', 'G');
        tmp.put('T', 'A');
        tmp.put('A', 'U');
        RNA_MAP = Collections.unmodifiableMap(tmp);
    }

    String transcribe(String dnaStrand) {
        int l = dnaStrand.length();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < l; i++){
            ret.append(RNA_MAP.get(dnaStrand.charAt(i)));
        }
        return ret.toString();
    }

}
