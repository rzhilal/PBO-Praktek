package kasus1;

public class inventori {
	barang[] barangs;
	
	void initBarang() {
	barangs = new barang[2];
	barangs[0] = new barang("001", "Baju", 10);
	barangs[1] = new barang("002", "Celana", 20);
	}
	
	void showBarang() {
	System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok()+ ")");
	System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	void pengadaan() {
		initBarang();
		barangs[0].addStok(20);
		barangs[0].addStok(-30);
		showBarang();
	}
		
		public static void main(String[] args) {
		inventori beli = new inventori();
		beli.pengadaan();
		}
}
