import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    private static final Map <Character, Character> DNA_MAP = new HashMap<>();

    public RnaTranscription() {
        this.DNA_MAP.put('G', 'C');
        this.DNA_MAP.put('C', 'G');
        this.DNA_MAP.put('T', 'A');
        this.DNA_MAP.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        dnaStrand = dnaStrand.toUpperCase();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            str.append(DNA_MAP.get(dnaStrand.charAt(i)));
        }
        return str.toString();
    }
}
