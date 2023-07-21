import java.util.*;
class DiceGameProblem{

static ArrayList<String> func(int currentValue,int endValue){

if(currentValue==endValue){
ArrayList<String> res=new ArrayList<>();
res.add("");
return res;
}

if(currentValue>endValue){
ArrayList<String> res=new ArrayList<>();
return res;
}


ArrayList<String> finalResult=new ArrayList<String>();
for(int dice=1;dice<=6;dice++){
int newValue=currentValue+dice;
ArrayList<String> result=func(newValue,endValue);
for(String s:result){
finalResult.add(dice+s);
}
}

return finalResult;
}

public static void main(String ar[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter End Value:");
int endV=s.nextInt();
ArrayList<String> list=func(0,endV);
System.out.println(list);

}



}

































