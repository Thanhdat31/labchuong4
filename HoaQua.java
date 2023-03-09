package bai1lab4;
import java.util.Scanner;

public class HoaQua 
{
public String ten;
public String nguongocxuatxu;
public String ngaynhap;
public double soluong;
    public HoaQua(){}
    public double getSolong() {
        return soluong;
    }

    public void setSolong(double solong) {
        this.soluong = solong;
    }


    public HoaQua(String ten, String nguongocxuatxu, String ngaynhap, double solong) {
        this.ten = ten;
        this.nguongocxuatxu = nguongocxuatxu;
        this.ngaynhap = ngaynhap;
        this.soluong = solong;
    }

    public String ten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public String getNguongocxuatxu() {
        return nguongocxuatxu;
    }

    public void setNguongocxuatxu(String nguongocxuatxu) {
        this.nguongocxuatxu = nguongocxuatxu;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    void nhap()
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("nhap gia ban");
    ten = sc.nextLine();
    System.out.println("nhap so luong");
    soluong = sc.nextDouble();
    System.out.println("nhap nguon goc xuat su");
    nguongocxuatxu=sc.nextLine();
    System.out.println(" nhap ngay nhap");
    ngaynhap = sc.nextLine();
    }
    
}
class Quacam extends HoaQua
{
    public Quacam(String ten, String nguongocxuatxu, String ngaynhap, double solong) 
    {
    super(ten, nguongocxuatxu, ngaynhap, solong);
    }
 public String mausac;
}
class Quatao extends HoaQua
{
    public Quatao(String ten, String nguongocxuatxu, String ngaynhap, double solong) {
        super(ten, nguongocxuatxu, ngaynhap, solong);
    }
    public String loaitao;
}
class Camsanh extends Quacam
{
    public Camsanh(String ten, String nguongocxuatxu, String ngaynhap, double solong) {
        super(ten, nguongocxuatxu, ngaynhap, solong);
    }
    public float giaban;
}
class CamCaoPhong extends Quacam{

    public CamCaoPhong(String ten, String nguongocxuatxu, String ngaynhap, double solong) {
        super(ten, nguongocxuatxu, ngaynhap, solong);
    }
    public String huong vi;
}
class main
{
 public static void main(String[] arg)
 {
 HoaQua hq = new HoaQua();
 hq.nhap();
 }

}
        


