public class Solution13{
static void SearchLast(int a[],int l,int val,int count){
if(l==0){
System.out.println(count);
return;
}
if(a[l-1]==val)
count++;
SearchLast(a,l-1,val,count);
}
public static void main(String args[]){
int a[]=new int[]{10,20,30,10,40};
SearchLast(a,5,10,0);
}
}