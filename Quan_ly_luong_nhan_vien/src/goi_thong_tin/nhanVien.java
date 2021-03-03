package goi_thong_tin;
import java.util.*;
public abstract class nhanVien implements constantCompany{
    private String maSo;
    private String name;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String chucVu;
    private String trinhDo;
    private String maPhuCap;
    private double luongPhuCap;
    private String maPhong;
    private String maThuong;
    private double luongThuong;
    public nhanVien(){}
    public nhanVien(String maSo,String name,String gioiTinh,String ngaySinh,double luongThuong,double luongPhuCap,
    String diaChi,String chucVu,String trinhDo,String maPhuCap,String maPhong,String maThuong){
        this.maSo=maSo;
        this.name=name;
        this.gioiTinh=gioiTinh;
        this.ngaySinh=ngaySinh;
        this.luongThuong=luongThuong;
        this.luongPhuCap=luongPhuCap;
        this.diaChi=diaChi;
        this.chucVu=chucVu;
        this.trinhDo=trinhDo;
        this.maPhuCap=maPhuCap;
        this.maPhong=maPhong;
        this.maThuong=maThuong;
    }
    public void setChucVu(String chucVu){
        this.chucVu=chucVu;
    }
    public String getMaSo(){
        return maSo;
    }
     public String getName(){
        return name;
    }
     public String getgioiTinh(){
        return gioiTinh;
    }
     public String getNgaySinh(){
        return ngaySinh;
    } 
     public String getDiaChi(){
        return diaChi;
    }  
     public String getChucVu(){
        return chucVu;
    }  
     public String getTrinhDo(){
        return trinhDo;
    }  
     public String getMaPhuCap(){
        return maPhuCap;
    }  
     public String getMaPhong(){
        return maPhong;
    }  
     public String getMaThuong(){
        return maThuong;
    }  
     public void setLuongThuong(double luongThuong){
         this.luongThuong=luongThuong;
     }
     public void setLuongPhuCap(double luongPhuCap){
         this.luongPhuCap=luongPhuCap;
     }
     public double getLuongPhuCap(){
        return luongPhuCap;
    }  
     public double getLuongThuong(){
        return luongThuong;
    }  
    
    public abstract double tinhLuongCoBan();
    public abstract double tinhLuongTangCa();
    public abstract double tinhLuong();
}

