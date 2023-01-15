package SwitchBulbs;

public class SwitchBulbs {
    public static int solve(int[] A){
        int switch_count = 0;
        for(int i=0; i< A.length; i++){
            if(switch_count % 2 == 1){
                A[i] = 1 - A[i];
            }
            if(A[i] == 1)
                continue;
            else if(A[i] == 0){
                switch_count ++;
            }    
        }
        return switch_count;        
    }

    public static void main(String args[]) {
        int ans = 0;
        int[] arr = { 0,1,0,1 };
        ans = solve(arr);
        System.out.println("Answer ::::  " +ans);
    }
}    