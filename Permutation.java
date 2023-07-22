/*
Permutation of a String
e.g void perm (String str, String result){
}
*/


import java.util.*;
public class Permutation{
static void perm (String str, String result){
int n=str.length();
if(n==0)
System.out.println(result);
for(int i=0;i<n;i++){
perm(str.substring(0,i)+str.substring(i+1),result+str.charAt(i));
}

}

public static void main(String ar[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter:");
String sc=s.next();
perm(sc,"");
}}