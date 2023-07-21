import java.util.*;

public class Main{
    public static void TowerOfHanoi(int n , String src, String help, String des){
        if(n==1){
            System.out.println("Transfer disk no " + n + " From " + src + " To " + des);
            return ;
        }
        TowerOfHanoi(n-1,src , des, help);
        System.out.println("Transfer disk no " + n + " From " + src + " To " + des);
        TowerOfHanoi(n-1,help,src,des);
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        TowerOfHanoi(n,"src","help","des");
    }
}