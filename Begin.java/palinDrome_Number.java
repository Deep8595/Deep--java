public class palinDrome_Number {
    public static void main(String[] args) {
    int num = 3553 , reversedNum = 0 , remainder ;
    int orig_Num = num ;
    while(num != 0){
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }
    if(orig_Num == reversedNum){
        System.out.println(orig_Num +" is Palindrome.");
    }
    else {
        System.out.println(orig_Num + " is not Palindrome.");
    }
  }
}
