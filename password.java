
import java.util.*;
class password{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter password: ");
        String s1=s.nextLine();
        int n=s1.length();
        int nn=0,sc=0,pc=0,lc=0;
        if(n>7){
            for(int i=0;i<n;i++){
                char ch=s1.charAt(i);
                if (ch>='a' && ch<='z'){
                    lc++;
                }
                else if(ch>='A' && ch<='Z'){
                    pc++;
                 }
                else if(ch>='0' && ch<='9'){
                    nn++;
                 }
                else{
                    sc++;
                }
            }
            if(nn!=0 && sc!=0 && pc!=0 && lc!=0){
            System.out.println("Strong Password");
            }
            else{
            System.out.println("weak");
            }
        }
        else{
            System.out.println("Enter atleast 8 characters");
        }
    }
}
