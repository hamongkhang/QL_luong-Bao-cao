package goi_thong_tin;
import java.util.*;
import goi_thong_tin.nhanVien;
public class nvVanChuyen extends nhanVien{
    private int soGio;
    private int soGioTangCa;
    private double luongTangCa;
    private double luongGio;
    public nvVanChuyen(){}
    public nvVanChuyen(String maSo,String name,String gioiTinh,String ngaySinh,double luongThuong,double luongPhuCap,double luongGio,
            String diaChi,String chucVu,String trinhDo,String maPhuCap,String maPhong,String maThuong,int soGio,int soGioTangCa,double luongTangCa){
        super(maSo,name,gioiTinh,ngaySinh,luongThuong,luongPhuCap,diaChi,chucVu,trinhDo,maPhuCap,maPhong,maThuong);
        this.soGio=soGio;
        this.soGioTangCa=soGioTangCa;
        this.luongTangCa=luongTangCa;
        this.luongGio=luongGio;
    }
    public void setSoGio(int soGio){
        this.soGio=soGio;
    }
    public int getSoGio(){
        return soGio;
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
     public void setLuongGio(double luongGio){
         this.luongGio=luongGio;
     } 
     public double getLuongGio(){
        return luongGio;
    }  
    public double tinhLuongCoBan(){
        return soGio*getLuongGio()+getLuongPhuCap()+getLuongThuong();
    }
    public double tinhLuong(){
        return tinhLuongTangCa()+tinhLuongCoBan()-(tinhLuongCoBan()*BHYT+tinhLuongCoBan()*BHXH+tinhLuongCoBan()*BHTN+tinhLuongCoBan()*quy);
    }
    public double tinhLuongTangCa(){
        return getSoGioTangCa()*getLuongTangCa();
    } 
}
