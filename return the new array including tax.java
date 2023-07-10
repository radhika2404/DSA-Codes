import java.util.*;
class Solution{

static double[] High(int a[],int l){
if(l<0)
return new double[a.length];
double res[]=High(a,l-1);
res[l]=a[l]+(0.1*a[l]);
return res;
}


public static void main(String args[]){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int[size];

for(int i=0;i<size;i++)
a[i]=s.nextInt();

System.out.println("OLD:"+Arrays.toString(a));
System.out.println("NEW:"+Arrays.toString(High(a,size-1)));
}
}