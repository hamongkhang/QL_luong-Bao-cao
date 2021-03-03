package goi_thong_tin;
import java.util.*;
import goi_thong_tin.nhanVien;
public class nvBanHang extends nhanVien{
    private int soHang;
    private int soGioTangCa;
    private double luongTangCa;
    private double luongHang;
     
   public nvBanHang(){}
   public nvBanHang(String maSo,String name,String gioiTinh,String ngaySinh,double luongThuong,double luongPhuCap,
            String diaChi,String chucVu,String trinhDo,String maPhuCap,String maPhong,String maThuong,int soHang,int soGioTangCa,double luongTangCa,double luongHang){
        super(maSo,name,gioiTinh,ngaySinh,luongThuong,luongPhuCap,diaChi,chucVu,trinhDo,maPhuCap,maPhong,maThuong);
        this.soHang=soHang;
        this.soGioTangCa=soGioTangCa;
        this.luongTangCa=luongTangCa;
        this.luongHang=luongHang;
    }
    public void setSoHang(int soHang){
        this.soHang=soHang;
    }
    public int getSoHang(){
        return soHang;
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
     public void setLuongHang(int luongHang){
         this.luongHang=luongHang;
     } 
     public double getLuongHang(){
        return luongHang;
    }  
     public double tinhLuongCoBan(){
        return soHang*luongHang+getLuongPhuCap()+getLuongThuong();
    }
    public double tinhLuong(){
        return tinhLuongTangCa()+tinhLuongCoBan()-(tinhLuongCoBan()*BHYT+tinhLuongCoBan()*BHXH+tinhLuongCoBan()*BHTN+tinhLuongCoBan()*quy);
    }
    public double tinhLuongTangCa(){
        return getSoGioTangCa()*getLuongTangCa();
    } 
}
