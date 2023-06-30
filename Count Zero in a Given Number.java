import java.util.*;
public class Solution6{
static void Count(int num,int result){
if(num==0) 
{
System.out.println("Result is:"+result);
return;
}
if(num%10==0)
result++;
Count(num/10,result);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Count(n,0);
}
}