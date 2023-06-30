class S{
static ArrayList<String> rep(String a[],int n,char ch){
if(n==0)
return new ArrayList<String> s;

rep(a,n-1,ch);
s.add(a.charAt(n));
if(a.charAt(n)==a.charAt(n+1))
s.add(ch);
return s;
}
public static void main(String ar[]){
String a[]="aabbcc";
ArrayList<String> x=rep(a,a.length,'*');
System.out.println(x);
}