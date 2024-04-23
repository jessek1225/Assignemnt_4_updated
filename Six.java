import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
public class Six {
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(rnaToProtein("AGCUGGGAAACGUAGGCCUA"));
        System.out.println(rnaToProtein("UAAAGAGAAGCCAGC"));
    }
    public static String rnaToProtein(String s) {
        Queue<String> q = new LinkedList<>();
        mapRNAValues();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            q.offer(String.valueOf(c));
        }

        StringBuilder sb = new StringBuilder();
        if(q.size() % 3 == 0) {
            while (!q.isEmpty()) {
                String code = q.remove() + q.remove() + q.remove();
                sb.append(map.get(code));
            }
        }
        else if(q.size() % 3 == 1) {
            for(int i = 0; i < s.length()/2; i++) {
                String code = q.remove() + q.remove() + q.remove();
                sb.append(map.get(code));
            }
            sb.append(".");
        }
        else {
            for(int i = 0; i < s.length()/3; i++) {
                String code = q.remove() + q.remove() + q.remove();
                sb.append(map.get(code));
            }
            sb.append(".");
        }

        return sb.toString();
    }

    public static void mapRNAValues() {
        map.put("UAA", ".");
        map.put("UAG", ".");
        map.put("UGA", ".");
        map.put("UUU", "F");
        map.put("UUC", "F");
        map.put("UUA", "L");
        map.put("UUG", "L");
        map.put("UCU", "S");
        map.put("UCC", "S");
        map.put("UCA", "S");
        map.put("UCG", "S");
        map.put("UAU", "Y");
        map.put("UAC", "Y");
        map.put("UGU", "C");
        map.put("UGC", "C");
        map.put("UGG", "W");
        map.put("CUU", "L");
        map.put("CUC", "L");
        map.put("CUA", "L");
        map.put("CUG", "L");
        map.put("CCU", "P");
        map.put("CCC", "P");
        map.put("CCA", "P");
        map.put("CCG", "P");
        map.put("CAU", "H");
        map.put("CAC", "H");
        map.put("CAA", "Q");
        map.put("CAG", "Q");
        map.put("CGU", "R");
        map.put("CGC", "R");
        map.put("CGA", "R");
        map.put("CGG", "R");
        map.put("AUU", "I");
        map.put("AUC", "I");
        map.put("AUA", "I");
        map.put("AUG", "M");
        map.put("ACU", "T");
        map.put("ACC", "T");
        map.put("ACA", "T");
        map.put("ACG", "T");
        map.put("AAU", "N");
        map.put("AAC", "N");
        map.put("AAA", "K");
        map.put("AAG", "K");
        map.put("AGU", "S");
        map.put("AGC", "S");
        map.put("AGA", "R");
        map.put("AGG", "R");
        map.put("GUU", "V");
        map.put("GUC", "V");
        map.put("GUA", "V");
        map.put("GUG", "V");
        map.put("GCU", "A");
        map.put("GCC", "A");
        map.put("GCA", "A");
        map.put("GCG", "A");
        map.put("GAU", "D");
        map.put("GAC", "D");
        map.put("GAA", "E");
        map.put("GAG", "E");
        map.put("GGU", "G");
        map.put("GGC", "G");
        map.put("GGA", "G");
        map.put("GGG", "G");

    }
}


