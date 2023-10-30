import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args){
        Scanner beans = new Scanner(System.in);
        System.out.println("What is the name of your phone number?");
        String num = beans.nextLine();
        System.out.println(countX (num));
        beans.close();
    }

    public static String countX(String str) {
        char[] numArray = str.toCharArray();
        int count = str.length();
        // if (a,b,c){}
        // else if (d,e,f){}
        // else if (g,h,i){}
        // else if (j,k,l){}
        // else if (m,n,o){}
        // else if (p,q,r,s){}
        // else if (t,u,v){}
        // else if (w,x,y,z){}
        // else{}
        return "beans";
    }
}