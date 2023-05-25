public class pgm10_1 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        
        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }
        
        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) 
            return false;
        }
        
        return true;
    }
}

