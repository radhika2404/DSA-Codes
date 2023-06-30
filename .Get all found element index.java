public class Solution14{
static void SearchLast(int a[],int l,int val,int x[],int count){
if(l==0){
for(int i=0;i<count;i++)
System.out.println(x[i]);
return;
}
if(a[l-1]==val)
{
x[count]=l;
count++;
}
SearchLast(a,l-1,val,x,count);
}
public static void main(String args[]){
int a[]=new int[]{10,20,30,10,40};
int temp[]=new int[5];
SearchLast(a,5,10,temp,0);
}
}