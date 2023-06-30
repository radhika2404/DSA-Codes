public class Solution12{
static void SearchLast(int a[],int l,int val){
if(l==0){
System.out.println("No");
return;
}
if(a[l-1]==val)
{
System.out.println(l+" "+a[l-1]);
return;
}
SearchLast(a,l-1,val);
}
public static void main(String args[]){
int a[]=new int[]{10,20,30,10,40};
SearchLast(a,5,10);
}
}