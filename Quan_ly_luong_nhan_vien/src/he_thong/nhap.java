package he_thong;
import java.util.*;
import goi_thong_tin.*;
public class nhap implements constantCompany{
    public static account nhapAccount(){
        Scanner input=new Scanner(System.in);
        account a=new account();
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t===========================LOGIN==============================");
        System.out.print("\t\t\t**             Nhap userName: ");
        a.setUserName(input.nextLine());
        System.out.print("\t\t\t**             Nhap password: ");
        a.setPassWord(input.nextLine());
        return a;
    }
    public static account dkAccount(){
        Scanner input=new Scanner(System.in);
        account a=new account();
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t===========================LOGIN==============================");
        System.out.print("\t\t\t**             Dat userName: ");
        a.setUserName(input.nextLine());
        System.out.print("\t\t\t**             Dat password: ");
        a.setPassWord(input.nextLine());
        String pass;
        do{
        System.out.print("\t\t\t**             Nhap lai password: ");
        pass=input.nextLine();}
        while(pass.equals(a.getPassWord())==false);
        return a;
    }
    public static nvCongXuong nhapNhanVienCX(){
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t**            BAT DAU NHAP THONG TIN NHAN VIEN              **");
        System.out.println("\t\t\t**************************************************************");
        String gioiTinh;
        String maSoPhong;
        String maSoThuong;
        String maSoPhuCap;
        String nhap1;
        String nhap2;
        String nhap3;
        double luongThuong=0;
        double luongPhuCap=0;
            System.out.println("Nhap ma so nhan vien: ");
            String maSo=input.nextLine();
            System.out.println("Nhap ten: ");
            String ten=input.nextLine();
            do{
            System.out.println("Nhap gioi tinh('nam' hoac 'nu'): ");
            gioiTinh=input.nextLine();
            }
            while (gioiTinh.equals("nam")==false && gioiTinh.equals("nu")==false);
            System.out.println("Nhap ngay sinh: ");
            String ngaySinh=input.nextLine();
            System.out.println("Nhap dia chi: ");
            String diaChi=input.nextLine(); 
            System.out.println("Nhap chuc vu: ");
            String chucVu=input.nextLine();
            System.out.println("Nhap trinh do: ");
            String trinhDo=input.nextLine();
           // do
          //  {
          //  System.out.println("Nhap ma so phong ban('sx','vc','tn','ql','bh'): ");
            maSoPhong="cx";
          //  }
          //  while(maSoPhong.equals("sx")==false&&maSoPhong.equals("vc")==false&&maSoPhong.equals("tn")==false&&maSoPhong.equals("ql")==false&&maSoPhong.equals("bh")==false);
            do
            {    
            System.out.println("Nhap ma so luong thuong('cc1','cc2','cc3','tet','tt1','tt2'): ");
            maSoThuong=input.nextLine();
            }
            while(maSoThuong.equals("cc1")==false&&maSoThuong.equals("cc2")==false&&maSoThuong.equals("cc3")==false&&maSoThuong.equals("tet")==false&&maSoThuong.equals("tt1")==false&&maSoThuong.equals("tt2")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (thuong[i][0].equals(maSoThuong)==true) luongThuong=Double.parseDouble(thuong[i][1]);
            do
            {
            System.out.println("Nhap ma so phu cap('Xa nha','Bao','Xang','An trua','Hoc tap','Them'): ");
            maSoPhuCap=input.nextLine();
            }
            while(maSoPhuCap.equals("Xa nha")==false&&maSoPhuCap.equals("Bao")==false&&maSoPhuCap.equals("Xang")==false&&maSoPhuCap.equals("An trua")==false&&maSoPhuCap.equals("Hoc tap")==false&&maSoPhuCap.equals("Them")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (phuCap[i][0].equals(maSoPhuCap)==true) luongPhuCap=Double.parseDouble(phuCap[i][1]);
            System.out.println("Nhap so gio lam: ");
            int soGio=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio lam: ");
            double luongGio=Double.parseDouble(input.nextLine());
            System.out.println("Nhap so gio tang ca: ");
            int soGioTangCa=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio tang ca: ");
            double luongGioTangCa=Double.parseDouble(input.nextLine());
            nvCongXuong a=new nvCongXuong(maSo,ten,gioiTinh,ngaySinh,luongThuong,luongPhuCap,luongGio,diaChi,chucVu,
    trinhDo,maSoPhuCap,maSoPhong,maSoThuong,soGio,soGioTangCa,luongGioTangCa);
            return a;
    }
    
    public static nvBanHang nhapNhanVienBH(){
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t**            BAT DAU NHAP THONG TIN NHAN VIEN              **");
        System.out.println("\t\t\t**************************************************************");
        String gioiTinh;
        String maSoPhong;
        String maSoThuong;
        String maSoPhuCap;
        String nhap1;
        String nhap2;
        String nhap3;
        double luongThuong=0;
        double luongPhuCap=0;
            System.out.println("Nhap ma so nhan vien: ");
            String maSo=input.nextLine();
            System.out.println("Nhap ten: ");
            String ten=input.nextLine();
            do{
            System.out.println("Nhap gioi tinh('nam' hoac 'nu'): ");
            gioiTinh=input.nextLine();
            }
            while (gioiTinh.equals("nam")==false && gioiTinh.equals("nu")==false);
            System.out.println("Nhap ngay sinh: ");
            String ngaySinh=input.nextLine();
            System.out.println("Nhap dia chi: ");
            String diaChi=input.nextLine(); 
            System.out.println("Nhap chuc vu: ");
            String chucVu=input.nextLine();
            System.out.println("Nhap trinh do: ");
            String trinhDo=input.nextLine();
            //do
           // {
           // System.out.println("Nhap ma so phong ban('sx','vc','tn','ql','bh'): ");
            maSoPhong="bh";
          //  }
          //  while(maSoPhong.equals("sx")==false&&maSoPhong.equals("vc")==false&&maSoPhong.equals("tn")==false&&maSoPhong.equals("ql")==false&&maSoPhong.equals("bh")==false);
            do
            {    
            System.out.println("Nhap ma so luong thuong('cc1','cc2','cc3','tet','tt1','tt2'): ");
            maSoThuong=input.nextLine();
            }
            while(maSoThuong.equals("cc1")==false&&maSoThuong.equals("cc2")==false&&maSoThuong.equals("cc3")==false&&maSoThuong.equals("tet")==false&&maSoThuong.equals("tt1")==false&&maSoThuong.equals("tt2")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (thuong[i][0].equals(maSoThuong)==true) luongThuong=Double.parseDouble(thuong[i][1]);
            do
            {
            System.out.println("Nhap ma so phu cap('Xa nha','Bao','Xang','An trua','Hoc tap','Them'): ");
            maSoPhuCap=input.nextLine();
            }
            while(maSoPhuCap.equals("Xa nha")==false&&maSoPhuCap.equals("Bao")==false&&maSoPhuCap.equals("Xang")==false&&maSoPhuCap.equals("An trua")==false&&maSoPhuCap.equals("Hoc tap")==false&&maSoPhuCap.equals("Them")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (phuCap[i][0].equals(maSoPhuCap)==true) luongPhuCap=Double.parseDouble(phuCap[i][1]);
            System.out.println("Nhap so san pham lam: ");
            int soHang=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong san pham: ");
            double luongHang=Double.parseDouble(input.nextLine());
            System.out.println("Nhap so gio tang ca: ");
            int soGioTangCa=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio tang ca: ");
            double luongGioTangCa=Double.parseDouble(input.nextLine());
            nvBanHang a=new nvBanHang(maSo,ten,gioiTinh,ngaySinh,luongThuong,luongPhuCap,diaChi,chucVu,
    trinhDo,maSoPhuCap,maSoPhong,maSoThuong,soHang,soGioTangCa,luongGioTangCa,luongHang);
            return a;
    }
    
    public static nvThuNgan nhapNhanVienTN(){
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t**            BAT DAU NHAP THONG TIN NHAN VIEN              **");
        System.out.println("\t\t\t**************************************************************");
        String gioiTinh;
        String maSoPhong;
        String maSoThuong;
        String maSoPhuCap;
        String nhap1;
        String nhap2;
        String nhap3;
        double luongThuong=0;
        double luongPhuCap=0;
            System.out.println("Nhap ma so nhan vien: ");
            String maSo=input.nextLine();
            System.out.println("Nhap ten: ");
            String ten=input.nextLine();
            do{
            System.out.println("Nhap gioi tinh('nam' hoac 'nu'): ");
            gioiTinh=input.nextLine();
            }
            while (gioiTinh.equals("nam")==false && gioiTinh.equals("nu")==false);
            System.out.println("Nhap ngay sinh: ");
            String ngaySinh=input.nextLine();
            System.out.println("Nhap dia chi: ");
            String diaChi=input.nextLine(); 
            System.out.println("Nhap chuc vu: ");
            String chucVu=input.nextLine();
            System.out.println("Nhap trinh do: ");
            String trinhDo=input.nextLine();
           // do
           // {
          //  System.out.println("Nhap ma so phong ban('sx','vc','tn','ql','bh'): ");
            maSoPhong="tn";
         //   }
          //  while(maSoPhong.equals("sx")==false&&maSoPhong.equals("vc")==false&&maSoPhong.equals("tn")==false&&maSoPhong.equals("ql")==false&&maSoPhong.equals("bh")==false);
            do
            {    
            System.out.println("Nhap ma so luong thuong('cc1','cc2','cc3','tet','tt1','tt2'): ");
            maSoThuong=input.nextLine();
            }
            while(maSoThuong.equals("cc1")==false&&maSoThuong.equals("cc2")==false&&maSoThuong.equals("cc3")==false&&maSoThuong.equals("tet")==false&&maSoThuong.equals("tt1")==false&&maSoThuong.equals("tt2")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (thuong[i][0].equals(maSoThuong)==true) luongThuong=Double.parseDouble(thuong[i][1]);
            do
            {
            System.out.println("Nhap ma so phu cap('Xa nha','Bao','Xang','An trua','Hoc tap','Them'): ");
            maSoPhuCap=input.nextLine();
            }
            while(maSoPhuCap.equals("Xa nha")==false&&maSoPhuCap.equals("Bao")==false&&maSoPhuCap.equals("Xang")==false&&maSoPhuCap.equals("An trua")==false&&maSoPhuCap.equals("Hoc tap")==false&&maSoPhuCap.equals("Them")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (phuCap[i][0].equals(maSoPhuCap)==true) luongPhuCap=Double.parseDouble(phuCap[i][1]);
            System.out.println("Nhap so ngay lam: ");
            int soNgay=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong ngay lam: ");
            double luongNgay=Double.parseDouble(input.nextLine());
            System.out.println("Nhap so gio tang ca: ");
            int soGioTangCa=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio tang ca: ");
            double luongGioTangCa=Double.parseDouble(input.nextLine());
            nvThuNgan a=new nvThuNgan(maSo,ten,gioiTinh,ngaySinh,luongThuong,luongPhuCap,diaChi,chucVu,
    trinhDo,maSoPhuCap,maSoPhong,maSoThuong,soNgay,luongNgay,soGioTangCa,luongGioTangCa);
            return a;
    }
    
    public static nvVanChuyen nhapNhanVienVC(){
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t**            BAT DAU NHAP THONG TIN NHAN VIEN              **");
        System.out.println("\t\t\t**************************************************************");
        String gioiTinh;
        String maSoPhong;
        String maSoThuong;
        String maSoPhuCap;
        String nhap1;
        String nhap2;
        String nhap3;
        double luongThuong=0;
        double luongPhuCap=0;
            System.out.println("Nhap ma so nhan vien: ");
            String maSo=input.nextLine();
            System.out.println("Nhap ten: ");
            String ten=input.nextLine();
            do{
            System.out.println("Nhap gioi tinh('nam' hoac 'nu'): ");
            gioiTinh=input.nextLine();
            }
            while (gioiTinh.equals("nam")==false && gioiTinh.equals("nu")==false);
            System.out.println("Nhap ngay sinh: ");
            String ngaySinh=input.nextLine();
            System.out.println("Nhap dia chi: ");
            String diaChi=input.nextLine(); 
            System.out.println("Nhap chuc vu: ");
            String chucVu=input.nextLine();
            System.out.println("Nhap trinh do: ");
            String trinhDo=input.nextLine();
           // do
          //  {
          //  System.out.println("Nhap ma so phong ban('sx','vc','tn','ql','bh'): ");
            maSoPhong="vc";
          //  }
          //  while(maSoPhong.equals("sx")==false&&maSoPhong.equals("vc")==false&&maSoPhong.equals("tn")==false&&maSoPhong.equals("ql")==false&&maSoPhong.equals("bh")==false);
            do
            {    
            System.out.println("Nhap ma so luong thuong('cc1','cc2','cc3','tet','tt1','tt2'): ");
            maSoThuong=input.nextLine();
            }
            while(maSoThuong.equals("cc1")==false&&maSoThuong.equals("cc2")==false&&maSoThuong.equals("cc3")==false&&maSoThuong.equals("tet")==false&&maSoThuong.equals("tt1")==false&&maSoThuong.equals("tt2")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (thuong[i][0].equals(maSoThuong)==true) luongThuong=Double.parseDouble(thuong[i][1]);
            do
            {
            System.out.println("Nhap ma so phu cap('Xa nha','Bao','Xang','An trua','Hoc tap','Them'): ");
            maSoPhuCap=input.nextLine();
            }
            while(maSoPhuCap.equals("Xa nha")==false&&maSoPhuCap.equals("Bao")==false&&maSoPhuCap.equals("Xang")==false&&maSoPhuCap.equals("An trua")==false&&maSoPhuCap.equals("Hoc tap")==false&&maSoPhuCap.equals("Them")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (phuCap[i][0].equals(maSoPhuCap)==true) luongPhuCap=Double.parseDouble(phuCap[i][1]);
            System.out.println("Nhap so gio lam: ");
            int soGio=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio lam: ");
            double luongGio=Double.parseDouble(input.nextLine());
            System.out.println("Nhap so gio tang ca: ");
            int soGioTangCa=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio tang ca: ");
            double luongGioTangCa=Double.parseDouble(input.nextLine());
            nvVanChuyen a=new nvVanChuyen(maSo,ten,gioiTinh,ngaySinh,luongThuong,luongPhuCap,luongGio,diaChi,chucVu,
    trinhDo,maSoPhuCap,maSoPhong,maSoThuong,soGio,soGioTangCa,luongGioTangCa);
            return a;
    }
    
    public static quanLy nhapNhanVienQL(){
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t**************************************************************");
        System.out.println("\t\t\t**            BAT DAU NHAP THONG TIN NHAN VIEN              **");
        System.out.println("\t\t\t**************************************************************");
        String gioiTinh;
        String maSoPhong;
        String maSoThuong;
        String maSoPhuCap;
        String nhap1;
        String nhap2;
        String nhap3;
        double luongThuong=0;
        double luongPhuCap=0;
            System.out.println("Nhap ma so nhan vien: ");
            String maSo=input.nextLine();
            System.out.println("Nhap ten: ");
            String ten=input.nextLine();
            do{
            System.out.println("Nhap gioi tinh('nam' hoac 'nu'): ");
            gioiTinh=input.nextLine();
            }
            while (gioiTinh.equals("nam")==false && gioiTinh.equals("nu")==false);
            System.out.println("Nhap ngay sinh: ");
            String ngaySinh=input.nextLine();
            System.out.println("Nhap dia chi: ");
            String diaChi=input.nextLine(); 
            System.out.println("Nhap chuc vu: ");
            String chucVu=input.nextLine();
            System.out.println("Nhap trinh do: ");
            String trinhDo=input.nextLine();
           // do
           // {
          //  System.out.println("Nhap ma so phong ban('sx','vc','tn','ql','bh'): ");
            maSoPhong="ql";
         //   }
          //  while(maSoPhong.equals("sx")==false&&maSoPhong.equals("vc")==false&&maSoPhong.equals("tn")==false&&maSoPhong.equals("ql")==false&&maSoPhong.equals("bh")==false);
            do
            {    
            System.out.println("Nhap ma so luong thuong('cc1','cc2','cc3','tet','tt1','tt2'): ");
            maSoThuong=input.nextLine();
            }
            while(maSoThuong.equals("cc1")==false&&maSoThuong.equals("cc2")==false&&maSoThuong.equals("cc3")==false&&maSoThuong.equals("tet")==false&&maSoThuong.equals("tt1")==false&&maSoThuong.equals("tt2")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (thuong[i][0].equals(maSoThuong)==true) luongThuong=Double.parseDouble(thuong[i][1]);
            do
            {
            System.out.println("Nhap ma so phu cap('Xa nha','Bao','Xang','An trua','Hoc tap','Them'): ");
            maSoPhuCap=input.nextLine();
            }
            while(maSoPhuCap.equals("Xa nha")==false&&maSoPhuCap.equals("Bao")==false&&maSoPhuCap.equals("Xang")==false&&maSoPhuCap.equals("An trua")==false&&maSoPhuCap.equals("Hoc tap")==false&&maSoPhuCap.equals("Them")==false);
             for (int i=0;i<5;i++)
              //  for(int j=0;j<2;j++)
                       if (phuCap[i][0].equals(maSoPhuCap)==true) luongPhuCap=Double.parseDouble(phuCap[i][1]);
            System.out.println("Nhap so ngay lam: ");
            int soNgay=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong ngay lam: ");
            double luongNgay=Double.parseDouble(input.nextLine());
            System.out.println("Nhap so gio tang ca: ");
            int soGioTangCa=Integer.parseInt(input.nextLine());
            System.out.println("Nhap luong gio tang ca: ");
            double luongGioTangCa=Double.parseDouble(input.nextLine());
            quanLy a=new quanLy(maSo,ten,gioiTinh,ngaySinh,luongThuong,luongPhuCap,luongNgay,diaChi,chucVu,
    trinhDo,maSoPhuCap,maSoPhong,maSoThuong,soNgay,soGioTangCa,luongGioTangCa);
            return a;
    }
    
}