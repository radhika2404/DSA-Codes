public class Solution10{
static void Arm(int num,int a,int result){
if(num==0){
if(a==result)
System.out.println("Yes");
else
System.out.println("No");

return;
}
int b=num%10;
result+=b*b*b;
Arm(num/10,a,result);
}
public static void main(String args[]){
Arm(133,133,0);
}
}