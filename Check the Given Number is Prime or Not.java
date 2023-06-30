import java.util.*;
public class Solution9{
static void Prime(int num,int x,int res){
if(res==0){
System.out.println("No");
return;
}
if(x==1){
System.out.println("Yes");
return;
}

res=num%x;
Prime(num,x-1,res);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=n/2;
Prime(n,x,1);
}
}