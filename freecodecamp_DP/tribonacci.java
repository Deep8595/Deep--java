import java.util.*;
public class tribonacci {
    public static int trifib( int n , HashMap<Integer , Integer> memo){
        if( n == 0 || n == 1 ){
            return 0;
        }
        if( n == 2 ){
            return 1;
        }
        if( memo.containsKey(n)){
            return memo.get(n);
        }
        int res = trifib(n-1 , memo) + trifib(n-2 , memo) + trifib(n-3 , memo);
        memo.put(n ,res);
        return res;
    }
    public static int trifib(int n ){
        return trifib(n , new HashMap<>());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n  = sc.nextInt();
        System.out.println(trifib(n));
        sc.close();
    }
}
