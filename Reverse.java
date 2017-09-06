# String
import java.io.*;
import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer s=new StringBuffer(a);
        s.reverse();
        StringBuffer b=new StringBuffer();
        b=s;
        System.out.println(b);
    }
}
