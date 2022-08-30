import java.util.Scanner;

public class Soal1{

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input number : ");
		
		try
		{
			long in_num = keyboard.nextLong();
			System.out.println(in_num +" can be fitted in:");
			if(in_num>=-128 && in_num<=127)System.out.println("* byte");
	        if(in_num>=-32768 && in_num<=32767)System.out.println("* short");
	        if(in_num>=-2147483648 && in_num<= 2147483647)System.out.println("* int");
	        if(in_num>=-9223372036854775808L && in_num<= 9223372036854775807L)System.out.println("* long");
		} catch(Exception e){
			System.out.println("can't be fitted anywhere.");
		}
        

	}

}