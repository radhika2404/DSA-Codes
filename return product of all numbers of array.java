import java.util.*;

public class Solution{
static int rec(int a[],int n){
if(n==0)
return 1;
int b=rec(a,n-1);
return b*a[n-1];
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int[size];

for(int i=0;i<size;i++)
a[i]=s.nextInt();

int product=rec(a,5);
System.out.println(product);
}
}




