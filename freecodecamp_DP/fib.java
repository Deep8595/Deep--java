import java.util.*;
class fib{
    public static int fibo( int n ,HashMap<Integer,Integer> memo ){
        if( n == 0 || n == 1 ) {
            return n;
        }

        if( memo.containsKey(n)){
            return memo.get(n);
        }

        int res =  fibo(n-1 , memo) + fibo(n-2 , memo);
        memo.put(n , res);

        return res;
    }
    public static int fibo(int n ){
        return fibo( n , new HashMap<>());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Value of n :");
        n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }
}
