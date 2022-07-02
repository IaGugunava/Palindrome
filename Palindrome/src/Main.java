public class Main {

        static boolean isPalindrome(String s){
            int i = 0, j=s.length()-1;
            while(i<j){
                if(s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }


    public static void main(String[] args) {
        String s1 = "something";
        String s2 = "level";
        if(isPalindrome(s1)){
            System.out.println(s1+" is a palindrome");
        } else {
            System.out.println(s1+" is a not palindrome");
        }
        if(isPalindrome(s2)){
            System.out.println(s2+" is a palindrome");
        } else {
            System.out.println(s2+" is a not palindrome");
        }
    }
}
