public class Solution6ii{
static int Count(int num){
if(num==0) 
return 0;
int a=Count(num/10);
if(num%10==0)
return a=a+1;
else
return a;
}
public static void main(String args[]){
int num=1087609700;
int x=Count(num);
System.out.println(x);
}
}