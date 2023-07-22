import java.util.*;
// Recursion
public class Main{
    public static void RevChar(String str , int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return ;
        }
        System.out.println(str.charAt(index));
        RevChar(str,index-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        RevChar(str,str.length()-1);
    }
}