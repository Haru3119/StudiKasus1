package sk1;

public class Barang {
    public String Barang = new String();
    public String Harga = new String();
    Barang(String Barang, String Harga ){
        this.Barang = Barang;
        this.Harga = Harga;
        
    }
    public void print(){
        System.out.println("Barang: "+ this.Barang);
        System.out.println("Harga: "+ this.Harga);
    }
    
            
}
