import java.util.*;
//https://leetcode.com/problems/super-pow/
class superPow{

static int calc(int a,int b[]){
int x=0,m=1;
for(int i=b.length-1;i>=0;i--){
//System.out.println(x);
x+=b[i]*m;
m*=10;
}
int cal=1;
for(int i=0;i<x;i++){
cal*=a;
}
return cal%1337;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
System.out.println("Enter the digits in power");
int b=s.nextInt();
System.out.println("Enter the digits:");
int c[]=new int[b];
for(int i=0;i<b;i++)
c[i]=s.nextInt();
int d=calc(a,c);
System.out.println("Result:"+d);
}

}