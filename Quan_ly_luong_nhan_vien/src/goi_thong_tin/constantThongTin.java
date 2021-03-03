package goi_thong_tin;
import he_thong.*;
public class constantThongTin implements constantCompany{
    public static void inCongTy(){
        System.out.printf("\t\t\t**            BANG THONG TIN CUA CONG TY EST ROUGE          **");
        System.out.printf("\n\t|==================================================================================================|");
        System.out.printf("\n\t| %-20s  |  %-70s  |","TEN CONG TY",companyName);
        System.out.printf("\n\t|==================================================================================================|");
        System.out.printf("\n\t| %-20s  |  %-70s  | ","DIA CHI",diachiCompany);
        System.out.printf("\n\t|==================================================================================================|");
        System.out.printf("\n\t| %-20s  |  %-70s  | ","SO LUONG PHONG BAN","5");
        System.out.printf("\n\t|--------------------------------------------------------------------------------------------------|");
        System.out.printf("\n\t|==================================================================================================|");
        System.out.println();
    }
    public static void inPhongBan(){
        System.out.printf("\t\t\t**       BANG THONG TIN PHONG BAN CUA CONG TY EST ROUGE     **");
        System.out.printf("\n\t\t|==============================================================================|");
        System.out.printf("\n\t\t| %-20s  |  %-50s  |","MA SO PHONG BAN","TEN PHONG BAN");
        System.out.printf("\n\t\t|==============================================================================|");
        for(int i=0;i<5;i++){
        System.out.printf("\n\t\t| %-20s  |  %-50s  | ",phongBan[i][0],phongBan[i][1]);
        System.out.printf("\n\t\t|==============================================================================|");}
        System.out.printf("\n\t\t|------------------------------------------------------------------------------|");
        System.out.printf("\n\t\t|==============================================================================|");
        System.out.println();
    }
     public static void inPhuCap(){
        System.out.printf("\t\t\t**       BANG THONG TIN PHU CAP CUA CONG TY EST ROUGE       **");
        System.out.printf("\n\t\t|==============================================================================|");
        System.out.printf("\n\t\t| %-20s  |  %-50s  |","MA SO PHU CAP","PHI PHU CAP");
        System.out.printf("\n\t\t|==============================================================================|");
        for(int i=0;i<5;i++){
        System.out.printf("\n\t\t| %-20s  |  %-50s  | ",phuCap[i][0],phuCap[i][1]);
        System.out.printf("\n\t\t|==============================================================================|");}
        System.out.printf("\n\t\t|------------------------------------------------------------------------------|");
        System.out.printf("\n\t\t|==============================================================================|");
        System.out.println();
    }
      public static void inThuong(){
        System.out.printf("\t\t\t**       BANG THONG TIN THUONG CUA CONG TY EST ROUGE        **");
        System.out.printf("\n\t\t|==============================================================================|");
        System.out.printf("\n\t\t| %-20s  |  %-50s  |","MA SO THUONG","PHI THUONG");
        System.out.printf("\n\t\t|==============================================================================|");
        for(int i=0;i<5;i++){
        System.out.printf("\n\t\t| %-20s  |  %-50s  | ",thuong[i][0],thuong[i][1]);
        System.out.printf("\n\t\t|==============================================================================|");}
        System.out.printf("\n\t\t|------------------------------------------------------------------------------|");
        System.out.printf("\n\t\t|==============================================================================|");
        System.out.println();
    }
    public static void inBH(){
        System.out.printf("\t\t\t** BANG THONG TIN CAC KHOAN CHI TRA CUA CONG TY EST ROUGE   **");
        System.out.printf("\n\t\t\t|================================================|");
        System.out.printf("\n\t\t\t| %-20s  |  %-20s  |","LOAI CHI PHI","PHI");
        System.out.printf("\n\t\t\t|================================================|");
        System.out.printf("\n\t\t\t| %-20s  |  %-20s  | ","BHXH","7%");
        System.out.printf("\n\t\t\t| %-20s  |  %-20s  | ","BHYT","1,5%");
        System.out.printf("\n\t\t\t| %-20s  |  %-20s  | ","BHTN","1%");
        System.out.printf("\n\t\t\t| %-20s  |  %-20s  | ","QUY CONG TY","10%");
        System.out.printf("\n\t\t\t|------------------------------------------------|");
        System.out.printf("\n\t\t\t|================================================|");
        System.out.println();
    }
   public static void inNVCongXuong(){
        System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |","MA SO","TEN","GIOI TINH","NGAY SINH","LUONG THUONG","LUONG PHU CAP",
                "LUONG GIO","DIA CHI","CHUC VU","TRINH DO","MA PHU CAP","MA PHONG BAN","MA THUONG","SO GIO","SO GIO TANG CA","LUONG TANG CA");
    } 
  public static void inNVBanHang(){
        System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |","MA SO","TEN","GIOI TINH","NGAY SINH","LUONG THUONG","LUONG PHU CAP",
                "DIA CHI","CHUC VU","TRINH DO","MA PHU CAP","MA PHONG BAN","MA THUONG","SO HANG","SO GIO TANG CA","LUONG TANG CA","LUONG HANG");
    }  
   public static void inNVThuNgan(){
        System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |","MA SO","TEN","GIOI TINH","NGAY SINH","LUONG THUONG","LUONG PHU CAP",
                "DIA CHI","CHUC VU","TRINH DO","MA PHU CAP","MA PHONG BAN","MA THUONG","SO NGAY","SO GIO TANG CA","LUONG TANG CA","LUONG NGAY");
    }  
    public static void inNVVanChuyen(){
        System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |","MA SO","TEN","GIOI TINH","NGAY SINH","LUONG THUONG","LUONG PHU CAP",
                "LUONG GIO","DIA CHI","CHUC VU","TRINH DO","MA PHU CAP","MA PHONG BAN","MA THUONG","SO GIO","SO GIO TANG CA","LUONG TANG CA");
    }  
    public static void inNVQuanLy(){
        System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |","MA SO","TEN","GIOI TINH","NGAY SINH","LUONG THUONG","LUONG PHU CAP",
                "DIA CHI","CHUC VU","TRINH DO","MA PHU CAP","MA PHONG BAN","MA THUONG","SO NGAY","SO GIO TANG CA","LUONG TANG CA","LUONG NGAY");
    }  
    public static void inLuong(){
        System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |","MA SO NHAN VIEN","TEN NHAN VIEN","LUONG CO BAN","LUONG TANG CA","TONG LUONG");
    }
}