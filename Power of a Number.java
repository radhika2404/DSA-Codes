import java.util.*;
public class Solution5{
static void Power(int num,int pow,int res){
if(pow==0){
System.out.println("Result is:"+res);
return;
}
res=res*num;
Power(num,pow-1,res);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
Power(n,p,1);
}
}