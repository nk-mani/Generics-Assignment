import java.util.Scanner;
import java.util.Random;

public class Bottu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     Random rd=new Random();
     System.out.println("guess the number b/w 0 to 9");
     
     int n=sc.nextInt();
     int r=sc.nextInt(10);
     
     if(r==n)
    	 System.out.println("you won the game ");
     else
    	 System.out.println("sorry it was "+r); 
	}

}
