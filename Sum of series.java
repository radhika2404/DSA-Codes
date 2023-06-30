import java.util.*;
public class Solution8{
static void Series(double num,double result){
if(num==0){
System.out.println("Result is:"+result);
return;
}
result=result+num/((double)Math.pow(num,num));
Series(num-1,result);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double num=s.nextDouble();
Series(num,0);
}
}