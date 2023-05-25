import java.util.HashSet;
import java.util.Set;

public class pgm9 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); ++i)
            s.add(sentence.charAt(i));
            // System.out.println(s.size());
            // System.out.println(s);
        return s.size() == 26;
    }
}
