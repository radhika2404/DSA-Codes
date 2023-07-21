import java.util.*;
public class MazePathProblem{

static ArrayList<String> func(int matrix[][],int row,int col){
if(row==matrix.length-1 && col==matrix[0].length-1){
ArrayList<String> result=new ArrayList<>();
result.add("");
return result;
}
if(row>matrix.length-1 || col>matrix[0].length-1){
ArrayList<String> result=new ArrayList<>();
return result;
}
ArrayList<String> finalResult=new ArrayList<>();

ArrayList<String> res1=func(matrix,row,col+1);
for(String s:res1){
finalResult.add("R"+s);
}

ArrayList<String> res2=func(matrix,row+1,col);
for(String s:res2){
finalResult.add("D"+s);
}
return finalResult;
}
public static void main(String ar[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter no of row and column:");
int row=s.nextInt();
int col=s.nextInt();
int matrix[][]=new int[row][col];
for(int i=0;i<row;i++)
for(int j=0;j<col;j++)
matrix[i][j]=0;

ArrayList<String> result=func(matrix,0,0);
System.out.println(result);
}
}

