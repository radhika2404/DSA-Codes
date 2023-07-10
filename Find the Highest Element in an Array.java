import java.util.*;
class Solution{

static int High(int a[],int l){
if(l-1==0)
return a[l-1];
//Integer.MIN_VAL;
int b=High(a,l-1);
if(b<a[l-1])
return a[l-1];
else
return b;
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int[size];

for(int i=0;i<size;i++)
a[i]=s.nextInt();

int result=High(a,size);
System.out.println("Max:"+result);
}
}