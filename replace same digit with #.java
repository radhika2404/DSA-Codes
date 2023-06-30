class Solution17{
static void AddStar(String oldS,String newS){
if(oldS.length()==0)
{
System.out.println(newS);
return;
}
if(newS.length()==0){
newS+=oldS.charAt(0);
AddStar(oldS.substring(1),newS);
}
else{
int x=newS.length();
if(oldS.charAt(0)==newS.charAt(x-1))
newS+='#';
else
newS+=oldS.charAt(0);
AddStar(oldS.substring(1),newS);
}
}
public static void main(String args[]){
AddStar("aabbcc","");
}
}