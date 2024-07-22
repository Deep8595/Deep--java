public class armStrong {
    public static void main(String[] args) {
        int number = 8208 , origNumb , remain , result = 0 ;
        origNumb = number;
        while(origNumb != 0 ){
            remain = origNumb % 10;
            result += Math.pow(remain, 4);
            origNumb /= 10;
        }
        if(result == number){
            System.out.println(number+" is an ArmStrong number");
        }
        else{
            System.out.println(number+" is not an ArmStrong number");
        }
    }
}
