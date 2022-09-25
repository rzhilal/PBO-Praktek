package case1;

public class Restaurant {
	public static byte id = 0;
    private food[] Menu;
    
    //Constructor
    public Restaurant() {
        this.Menu = new food[10];
        for(int i=0;i<10;i++){
            this.Menu[i] = new food();
        }
    }
    
    //getter setter karena sudah dienkapsulasi
    public food[] getMenu() {
        return Menu;
    }

    public void setMenu(food[] Menu) {
        this.Menu = Menu;
    }    
    
    //Method
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        //ganti dengan method set yang ada di class food
    	this.Menu[id].setNama_makanan(nama);
        this.Menu[id].setHarga_makanan(harga);
        this.Menu[id].setStok(stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(this.Menu[i].getNama_makanan() + "[" + this.Menu[i].getStok() + "]" + "\t\tRp. " + this.Menu[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(this.Menu[id].getStok()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }    
    
    //pemesanan makanan(pengembangan)
    public void pesanMakanan(String nama, int jumlah){
        int valid = 0;
        for( int i=0; i<10; i++) {
            if( nama.equals(this.Menu[i].getNama_makanan()) ) {
                if(jumlah > this.Menu[i].getStok()){
                    System.out.println("Sorry, the food is out of stock!");
                    valid = 1;
                }
                else{
                    System.out.println("~Your Order~");
                    System.out.println(jumlah + "x " + nama + "\t\tRp. " + this.Menu[i].getHarga_makanan() + "/pcs");
                    System.out.println("Total pembayaran : \tRp. " + jumlah*this.Menu[i].getHarga_makanan());
                    updateStok(i,jumlah);
                    valid = 1;
                    }
            }
        }
        if(valid == 0){
            System.out.println("Please input the correct Food!");
        }
    }
    
    //pengurangan stok ketika sudah dipesan(pengembangan)
    public void updateStok (int i, int jumlah) {
         this.Menu[i].setStok(this.Menu[i].getStok() - jumlah);
    }
}
