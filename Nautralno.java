# nautralno
import java.io.*;
import java.util.*;
public class Nautralno
{
public static void main(String args[])
{
int x,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer");
x=sc.nextInt();
for(int i=1;i<=x;++i)
{
sum=sum+i;
}
System.out.println(sum);
}
}
