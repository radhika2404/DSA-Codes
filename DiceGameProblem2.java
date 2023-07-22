import java.util.*;
class DiceGameProblem2{

static void function(int currentValue,int endValue,String s){

if(currentValue==endValue){
System.out.print(s+" ");
s="";
return;
}
if(currentValue>endValue)
return;
for(int dice=1;dice<=6;dice++){
int newValue=currentValue+dice;
function(newValue,endValue,s+dice);
}
}

public static void main(String ar[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter End Value:");
int endV=s.nextInt();
function(0,endV,"");

}}