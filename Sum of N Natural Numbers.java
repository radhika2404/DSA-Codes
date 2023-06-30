import java.util.*;
public class Solution7{
static void Sum(int num,int result){
if(num==0){
System.out.println("Result is:"+result);
return;
}
result=result+num;
Sum(num-1,result);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Sum(n,0);
}
}