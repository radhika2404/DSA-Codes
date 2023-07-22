/*

Maze Path Problem
e.g void mazePathProblem(int row , int col, int endRow, int endCol, String result)

Step - 1 Move to the Right
Step-2 Move to the Down



*/

import java.util.*;
public class MazePathProblem2{

static void mazePathProblem(int row , int col, int endRow, int endCol, String result)
{
if(row==endRow-1 && col==endCol-1)
{
System.out.println(result);
return;
}
if(row==endRow || col==endCol)
return;

mazePathProblem(row,col+1,endRow,endCol,result+'R');
mazePathProblem(row+1,col,endRow,endCol,result+'D');


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
mazePathProblem(0,0,row,col,"");
}}