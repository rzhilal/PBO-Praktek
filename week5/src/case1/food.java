package case1;

public class food {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    //Constructor
    public food(){
        this.nama_makanan = "food is not set";
        this.harga_makanan = 0;
        this.stok = 0;
    }
    
    //Asesor & Mutator
    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
