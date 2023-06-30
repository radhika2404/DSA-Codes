public class Solution11{
static void Palin(String s,int l,String r){
if(l==0){
if(s.equals(new String(r)))
System.out.println("Yes");
else
System.out.println("No");
return;
}
char ch=s.charAt(l-1);
r=r+ch;
Palin(s,l-1,r);
}
public static void main(String args[]){
Palin("laal",4,"");
}
}