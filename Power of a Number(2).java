import java.util.*;
public class Solution5ii{
static int Power(int num,int pow){
if(pow==0) return 1;
int a=Power(num,pow-1);
return a*num;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
int B=Power(n,p);
System.out.println("Result is:"+B);
}
}



