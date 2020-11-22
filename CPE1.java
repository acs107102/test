import java.util.Scanner;

public class CPE1
{
  public static void main(String[] args)
  {
    Scanner keyin = new Scanner(System.in);
	
	int a = keyin.nextInt();
	
	for(int i = 0; i < a; i++){
	  String ignore1 = keyin.next();
	  String ignore2 = keyin.next();
 	  int b = keyin.nextInt();
	  int[][] x = new int[b][b];

      for(int j = 0; j < b; j++){
        for(int k = 0; k < b; k++)
		  x[j][k] = keyin.nextInt();
      }
	  
	  int sum = 0;
	  for(int j = 0; j < b; j++){
        for(int k = 0; k < b; k++){
		  if(x[j][k] == x[k][j])
		    sum++;
        }		   
      }
	  
	  if(2*b == sum)
<<<<<<< HEAD
	    System.out.println("Test #1: Symmetric.!!!");
=======
	    System.out.println("Test #1: Symmetric.!!!");
>>>>>>> apple
	  else
	    System.out.println("Test #1: Non-symmetric.");
    }
  }
}