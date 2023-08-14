import java.util.*;
//https://leetcode.com/problems/power-of-three/

class powerofthree{
public static boolean isPowerOfThree(float n) {
//System.out.println(n);
if(n==1)
return true;
if(n<1){
//System.out.println(n);
return false;
}
if(n%3==0)
return isPowerOfThree(n/3);
return false;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
float n=s.nextFloat();;
if(isPowerOfThree(n))
System.out.println("YES");
else
System.out.println("NO");
}
}