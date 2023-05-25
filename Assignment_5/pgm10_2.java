public class pgm10_2 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
    public static boolean checkIfPangram(String sentence) {
        int seen = 0;
        for(char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }
}
