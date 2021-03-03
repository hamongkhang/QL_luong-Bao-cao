package goi_thong_tin;
import java.util.*;
import goi_thong_tin.nhanVien;

public class nvThuNgan extends nhanVien{
    private int soNgay;
    private double luongNgay;
    private int soGioTangCa;
    private double luongTangCa;
    public nvThuNgan(){}
    public nvThuNgan(String maSo,String name,String gioiTinh,String ngaySinh,double luongThuong,double luongPhuCap,
            String diaChi,String chucVu,String trinhDo,String maPhuCap,String maPhong,String maThuong,int soNgay,double luongNgay,int soGioTangCa,double luongTangCa){
        super(maSo,name,gioiTinh,ngaySinh,luongThuong,luongPhuCap,diaChi,chucVu,trinhDo,maPhuCap,maPhong,maThuong);
        this.soNgay=soNgay;
        this.luongNgay=luongNgay;
        this.soGioTangCa=soGioTangCa;
        this.luongTangCa=luongTangCa;
    }
    public void setSoNgay(int soNgay){
        this.soNgay=soNgay;
    }
    public int getSoNgay(){
        return soNgay;
    }
     public void setLuongTangCa(double luongTangCa){
         this.luongTangCa=luongTangCa;
     } 
     public double getLuongTangCa(){
        return luongTangCa;
    }   
      public void setSoGioTangCa(int soGioTangCa){
         this.soGioTangCa=soGioTangCa;
     } 
     public double getSoGioTangCa(){
        return soGioTangCa;
    }  
      public double getLuongNgay(){
        return luongNgay;
    }  
    public double tinhLuongCoBan(){
        return soNgay*getLuongNgay()+getLuongPhuCap()+getLuongThuong();
    }
    public double tinhLuong(){
        return tinhLuongTangCa()+tinhLuongCoBan()-(tinhLuongCoBan()*BHYT+tinhLuongCoBan()*BHXH+tinhLuongCoBan()*BHTN+tinhLuongCoBan()*quy);
    }
    public double tinhLuongTangCa(){
        return getSoGioTangCa()*getLuongTangCa();
    } 
}


