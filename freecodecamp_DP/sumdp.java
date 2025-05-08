import java.util.*;
public class sumdp {
    public static boolean sumPossible(int tar , int[] number ){
        return sumPossible(tar, number , new HashMap<>());
    }
    public static boolean sumPossible( int tar  , int[] number , HashMap<Integer , Boolean> memo){

        // memorization use ;
        if( tar == 0 ) {
            return true;
        }
        if( tar < 0){
            return false;
        }
        if(memo.containsKey(tar)){
            return memo.get(tar);
        }
        for( int num : number){
            int sub = tar - num;
            if(sumPossible(sub, number , memo)){
                memo.put(tar , true);
                return true;
            }
        }
        memo.put(tar , false);
        return false;
    }
     public static void main(String[] args){
        int tar = 1;
        int [] number = {3,2,8,5,7,9};
        System.out.println(sumPossible(tar, number));
     }
}