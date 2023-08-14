import java.util.*;
//https://leetcode.com/problems/power-of-four/
class poweroffour{
public static boolean isPowerOfFour(float n) {
//System.out.println(n);
if(n==1)
return true;
if(n<1){//System.out.println(n);
return false;
}
if(n%4==0)
return isPowerOfFour(n/4);
return false;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
float n=s.nextFloat();;
if(isPowerOfFour(n))
System.out.println("YES");
else
System.out.println("NO");
}

}