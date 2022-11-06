public class Palindrome {
    public static boolean isPalindrome(String word){
    int i1=0;
    int i2=word.length()-1;
    boolean isPalindrome=true;
    while(i2>i1){
        if (word.charAt(i1)!=word.charAt(i2)){
            isPalindrome=false;
            break;
        }
        i1++;
        i2--;
    }
    return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kot"));
    }
}

