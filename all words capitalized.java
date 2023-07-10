import java.util.*;

public class Solution{
static ArrayList<String> Rec(String a[],int n){
if(n==0){
return new ArrayList<String>();
}
//System.out.println(x);
ArrayList<String> b=Rec(a,n-1);
b.add(a[n-1].toUpperCase());
return b;
}
public static void main(String args[]){

Scanner s=new Scanner(System.in);
int size=s.nextInt();
String a[]=new String[size];

for(int i=0;i<size;i++)
a[i]=s.next();

System.out.print("I/P:");
for(int i=0;i<size;i++)
System.out.print(a[i]+", ");

System.out.println();
ArrayList<String> res=Rec(a,size);

System.out.print("O/P:");
System.out.println(res);
//for(int i=0;i<size;i++)
//System.out.print(res[i]+", ");

}
}





