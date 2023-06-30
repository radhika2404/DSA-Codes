import java.util.*;
public class Solution7ii{
static int Sum(int num){
if(num==0){
return 0;
}
int s=Sum(num-1);
 s=s+num;
return s;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=Sum(n);
System.out.println(x);
}
}