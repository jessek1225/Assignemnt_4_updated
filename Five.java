import java.util.LinkedList;
import java.util.Queue;
public class Five {
    static String input1 = "AGCTGGGAAACGTAGGCCTA";
    static String input2 = "TTTTTTTTTTGGCGCG";
    static String input3 = "CTTTGGGACTAGTAACCCATTTCGGCT";
    public static String dnaToRna(String s) {
        Queue<Character> q = new LinkedList<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'T') {
                q.offer('U');
            } else {
                q.offer(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char c : arr) {
            sb.append(q.remove());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna(input1));
        System.out.println(dnaToRna(input2));
        System.out.println(dnaToRna(input3));
    }
}
