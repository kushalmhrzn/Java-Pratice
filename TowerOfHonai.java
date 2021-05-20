
import java.util.*;
public class TowerOfHonai {
    static int count=0;
    public static void main(String args[]){//LNR
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of discs");
        n = in.nextInt();
        Honai(n,'A','C','B');
        //n is no of discs a is source c is destination b is space
          System.out.println("Count="+count);
    }
     
    public static void Honai(int n, char src, char dest, char spare){
        if(n==1){
            //System.out.println("if begining is executed");
            System.out.println("Transferring DISC 1 from PEG "+src+" to PEG "+dest);
            count++;
        
        }else{
            Honai(n-1,src,spare,dest);
            //System.out.println("Calling from 1st recursion");
            System.out.println("Transferring DISC "+n+" from PEG "+src+" to PEG "+dest);
            count++;
            //System.out.printlnl("Calling from 2nd recursion");
            Honai(n-1,spare,dest,src);   
        }
    }
 
}
