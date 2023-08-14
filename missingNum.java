//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&curated[]=1&sortBy=submissions

import java.util.*;
class missingNum{
static int missingNumber(int array[], int n) {
int sum1=0,sum2=0;
for(int i=0;i<array.length;i++)
sum1+=array[i];
sum2=(n*(n+1))/2;
return sum2-sum1;
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the digits in array:");
int n=s.nextInt();
System.out.println("Enter the digits:");
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();
int b=missingNumber(arr,n+1);
System.out.println(b);
}}