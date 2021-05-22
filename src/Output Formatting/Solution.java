import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String sx="";
                if(x<100){
                    if(x<10){
                        sx="00"+x;
                    }else{
                        sx="0"+ x;
                    }
                }else{
                    sx=String.valueOf(x);
                } 
                String s2="";
                if(s1.length()<10){
                    for(int j=0; j<10-s1.length();j++){
                        s2+=" ";
                    }
                }
                System.out.println(s1+s2+"     "+sx); 
            }
            sc.close();
            System.out.println("================================");

    }
}
