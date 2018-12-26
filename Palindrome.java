public class Palindrome {
    public static boolean isPalindrome(String word) {
        word = word.toUpperCase();
        String invertida = new StringBuffer(word).reverse().toString(); 
        if(word.equals(invertida)) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
