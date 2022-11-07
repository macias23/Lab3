public class Palindrome {
    public static boolean isPalindrome(String word){
    int i1=0;
    int i2=word.length()-1;
    while(i2>i1){
        if (word.charAt(i1)!=word.charAt(i2)){
            return false;
        }
        i1++;
        i2--;
    }
    return true;
    }
    public static String analyzeSubstring (String word){
        if(isPalindrome(word)){
            return word;
        }
        else return "";
}
    public static String findLongestPalindrome(String word){
        String longestPalindrome="";
        String current="";
        for (int i=0;i<word.length();i++){
            String subword=word.substring(i,word.length());
            int index=subword.length();
            while (index>0){
                String substring=subword.substring(0,index);
                    current=analyzeSubstring(substring);
                if(longestPalindrome.length()<current.length())
                    longestPalindrome=current;
                index--;
            }
        }
        return longestPalindrome;
    }
    public static void main(String[] args) {
        String longest=findLongestPalindrome("mama");
        System.out.println(longest);
    }
}

