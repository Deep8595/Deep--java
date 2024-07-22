public class primeNUmber {
    public static void main(String[] args){
        int i, m = 0 ; int flag = 0 ;
        int n = 5; // this no. is  to be checked
        m = n/2;
        if(n == 0|| n == 1){
           System.out.println(n+ "not a prime number");
        }else{
            for(i = 2 ; i <= m ; i++){
                if (n%i == 0) {
                    System.out.println(n+ "NOt a prime no.");
                    flag = 1 ;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n+ "Prime number");
            }
        }

    }
    
}
