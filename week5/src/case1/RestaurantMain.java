package case1;
import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		boolean quit = true;
		Restaurant menu = new Restaurant();
		Scanner scan = new Scanner(System.in);
		String nama;
		Integer jumlah;
		char stopper;
		
		//Penambahan menu
        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 2000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1500, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 2000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Pisang", 2000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Roti", 5000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Susu", 7000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Cilok", 6000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Pop mie", 10000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Martabak", 2500, 20);
        
		while(quit == true)
		{   
	        //Pemesanan makanan
	        System.out.println("~Menu~");
	        menu.tampilMenuMakanan();
	        System.out.println("");
	        System.out.println("~User Input");
	        scan.nextLine();
	        System.out.print("Input Food Name : ");
	        nama = scan.nextLine();
	        System.out.print("Input Qty : ");
	        jumlah = scan.nextInt();
	        System.out.println("");
	        menu.pesanMakanan(nama,jumlah);
	        
	        System.out.print("Apakah masih ingin memesan (y/n) : ");
	        stopper = scan.next().charAt(0);
	        System.out.println(" ");
	        if(stopper == 'n')
	        	quit = false;
		}
		scan.close();
	}
}
