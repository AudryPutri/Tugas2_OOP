
package tugas02oop;


public class volumebalok {
      double volume;
    double panjang;
    double lebar;
    double tinggi;
    
    public volumebalok(double Pj, double Lb, double Tg){
        this.panjang = Pj;
        this.lebar = Lb;
        this.tinggi = Tg;
    }
    public void setPj (double Pj){
        this.panjang = Pj;
    }
    public void setLb (double Lb){
        this.lebar = Lb;
    }
    public void setTg (double Tg){
        this.tinggi = Tg;
    }
    double Hitungvolume (){
        this.volume = this.panjang * this.lebar * this.tinggi;
        return this.volume;
    }
    public void cetakvolume (){
        this.Hitungvolume();
        System.out.println("Menghitung Volume Balok");
        System.out.println("=======================");
        System.out.println("Panjang           :"+this.panjang+"cm");
        System.out.println("Lebar             :"+this.lebar+"cm");
        System.out.println("Tinggi            :"+this.tinggi+"cm");
        System.out.println("Volume Balok      :"+this.volume+"cm");
    }
    
}
