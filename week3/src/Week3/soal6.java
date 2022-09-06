package Week3;

import java.util.Scanner;
import java.math.BigInteger;

public class soal6 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Scan input from user
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        input.close();
        
        //Print the result
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }

}
