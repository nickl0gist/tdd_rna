import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    private Map <Character, Character> dnaToRna = new HashMap<>();

    public RnaTranscription() {
        this.dnaToRna.put('G', 'C');
        this.dnaToRna.put('C', 'G');
        this.dnaToRna.put('T', 'A');
        this.dnaToRna.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        dnaStrand = dnaStrand.toUpperCase();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            str.append(dnaToRna.get(dnaStrand.charAt(i)));
        }
        return str.toString();
    }
}
