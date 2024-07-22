public class palinDrome_String {
    public static void main(String[] args) {
        String str = "Deed", reveseStr = " ";
        int strLength = str.length();
        for(int i = (strLength-1); i>=0 ;--i){
            reveseStr = reveseStr +str.charAt(i);
        }
        if(str.toLowerCase().equals(reveseStr.toLowerCase())){
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
