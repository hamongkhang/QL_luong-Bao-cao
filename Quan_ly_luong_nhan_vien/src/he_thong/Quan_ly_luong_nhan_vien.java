package he_thong;
import java.util.*;
import he_thong.*;
import goi_thong_tin.*;
public class Quan_ly_luong_nhan_vien {
    public static void main(String[] args) {
        ArrayList<account> list= new ArrayList<account>();
        ArrayList<nvCongXuong> congxuong=new ArrayList<nvCongXuong>();
        ArrayList<nvThuNgan> thungan=new ArrayList<nvThuNgan>();
        ArrayList<nvVanChuyen> vanchuyen=new ArrayList<nvVanChuyen>();
        ArrayList<nvBanHang> banhang=new ArrayList<nvBanHang>();
        ArrayList<quanLy> quanly=new ArrayList<quanLy>();
        account a1= new account("administrator","admin");
        String ktNhap,ktNhap1;
        String nhap2;
        list.add(a1);
        Scanner input=new Scanner(System.in);
        int key,key2,key3,key4,key5,key6;
        do{
        chuc_nang.menuAccount();
        
        do{
        key=Integer.parseInt(input.nextLine());
        if ((key!=1)&&(key!=2)&&(key!=3)) System.out.println("Khong hop le. Vui long nhap lai: ");
        }while ((key!=1)&&(key!=2)&&(key!=3));
        
        switch(key){
            case 1:
                String nhap1;
                account tam=nhap.nhapAccount();
                boolean kt=false;
                for (int i=0;i<list.size();i++){
                    if ((list.get(i).getUserName().equals(tam.getUserName())==true)&&(list.get(i).getPassWord().equals(tam.getPassWord())==true))
                        kt=true;
                }
                if (kt==false) System.out.println("Sai tai khoan hoac mat khau. Vui long chon lai");
                else {
                System.out.println("Ban da dang nhap thanh cong!");
                                  
                do{
                    chuc_nang.Menu();
                    do{
                        key2=Integer.parseInt(input.nextLine());
                        if ((key2!=0)&&(key2!=1)&&(key2!=2)&&(key2!=3)&&(key2!=4)&&(key2!=5)&&(key2!=6)) System.out.println("Khong hop le. Vui long nhap lai");
                      }while((key2!=1)&&(key2!=2)&&(key2!=0)&&(key2!=3)&&(key2!=4)&&(key2!=5)&&(key2!=6));
                    switch(key2){
                        case 1:
                          do{    
                              do{
                            System.out.println("Ban muon them nhan vien cho phong ban nao('Cong xuong','Van chuyen','Thu Ngan','Quan ly','Ban hang'):");  
                              ktNhap=input.nextLine();
                              }
                              while (ktNhap.equals("Cong xuong")==false&&ktNhap.equals("Van chuyen")==false&&ktNhap.equals("Thu ngan")==false&&ktNhap.equals("Quan ly")==false&&ktNhap.equals("Ban hang")==false);
                           if (ktNhap.equals("Cong xuong")==true){
                              do{ 
                              congxuong.add(nhap.nhapNhanVienCX());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);
                              
                            }
                          while(nhap1.equals("yes")==true);}
                           
                           else if(ktNhap.equals("Van chuyen")==true){
                               do{
                            vanchuyen.add(nhap.nhapNhanVienVC());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);}
                                while(nhap1.equals("yes")==true);
                           }
                            else if(ktNhap.equals("Thu ngan")==true){
                                do{
                            thungan.add(nhap.nhapNhanVienTN());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);}
                                 while(nhap1.equals("yes")==true);
                           }
                            else if(ktNhap.equals("Quan ly")==true){
                                do{
                            quanly.add(nhap.nhapNhanVienQL());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);}
                                 while(nhap1.equals("yes")==true);
                           }
                            else if(ktNhap.equals("Ban hang")==true){
                                do{
                            banhang.add(nhap.nhapNhanVienBH());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);}
                                while(nhap1.equals("yes")==true);
                           }
                             do{
                                     System.out.println("Ban co muon nhap cho phong ban khac khong('yes' hoac 'no'): ");
                                     nhap2=input.nextLine();
                                 }
                                 while(nhap2.equals("yes")==false&&nhap2.equals("no")==false);
                          } 
                          while (nhap2.equals("yes")==true);
                          break;
                        case 2:
                            do{
                            chuc_nang.xemThongTin();
                            do{
                            key3=Integer.parseInt(input.nextLine());
                            if ((key3!=0)&&(key3!=1)&&(key3!=2)&&(key3!=3)&&(key3!=4)&&(key3!=5)&&(key3!=6)) System.out.println("Khong hop le. Vui long nhap lai");
                            }while((key3!=0)&&(key3!=1)&&(key3!=2)&&(key3!=3)&&(key3!=4)&&(key3!=5)&&(key3!=6));
                            switch(key3){
                                case 1: constantThongTin.inCongTy();
                                        break;
                                case 2: if (congxuong.size()>0){ 
                                        System.out.printf("\t**    BANG THONG TIN NHAN VIEN CONG XUONG CUA CONG TY EST ROUGE   **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVCongXuong();
                                    for(int i=0;i<congxuong.size();i++){
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).getgioiTinh(),congxuong.get(i).getNgaySinh(),congxuong.get(i).getLuongThuong(),congxuong.get(i).getLuongPhuCap(),
                congxuong.get(i).getLuongGio(),congxuong.get(i).getDiaChi(),congxuong.get(i).getChucVu(),congxuong.get(i).getTrinhDo(),
                congxuong.get(i).getMaPhuCap(),congxuong.get(i).getMaPhong(),congxuong.get(i).getMaThuong(),congxuong.get(i).getSoGio(),congxuong.get(i).getSoGioTangCa(),congxuong.get(i).getLuongTangCa());
                                    }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();}
                                if (banhang.size()>0){
                                     System.out.printf("\t**     BANG THONG TIN NHAN VIEN BAN HANG CUA CONG TY EST ROUGE      **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVBanHang();
                                    for(int i=0;i<banhang.size();i++){
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).getgioiTinh(),banhang.get(i).getNgaySinh(),banhang.get(i).getLuongThuong(),banhang.get(i).getLuongPhuCap()
                ,banhang.get(i).getDiaChi(),banhang.get(i).getChucVu(),banhang.get(i).getTrinhDo(),
                banhang.get(i).getMaPhuCap(),banhang.get(i).getMaPhong(),banhang.get(i).getMaThuong(),banhang.get(i).getSoHang(),banhang.get(i).getSoGioTangCa(),banhang.get(i).getLuongTangCa(),banhang.get(i).getLuongHang());
                                    }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();  }
                                if (thungan.size()>0){
                                     System.out.printf("\t**     BANG THONG TIN NHAN VIEN THU NGAN CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVThuNgan();
                                    for(int i=0;i<thungan.size();i++){
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).getgioiTinh(),thungan.get(i).getNgaySinh(),thungan.get(i).getLuongThuong(),thungan.get(i).getLuongPhuCap()
                ,thungan.get(i).getDiaChi(),thungan.get(i).getChucVu(),thungan.get(i).getTrinhDo(),
                thungan.get(i).getMaPhuCap(),thungan.get(i).getMaPhong(),thungan.get(i).getMaThuong(),thungan.get(i).getSoNgay(),thungan.get(i).getSoGioTangCa(),thungan.get(i).getLuongTangCa(),thungan.get(i).getLuongNgay());
                                    }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();   }
                                if (vanchuyen.size()>0){
                                        System.out.printf("\t**   BANG THONG TIN NHAN VIEN VAN CHUYEN CUA CONG TY EST ROUGE  **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVVanChuyen();
                                    for(int i=0;i<vanchuyen.size();i++){
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).getgioiTinh(),vanchuyen.get(i).getNgaySinh(),vanchuyen.get(i).getLuongThuong(),vanchuyen.get(i).getLuongPhuCap(),
                vanchuyen.get(i).getLuongGio(),vanchuyen.get(i).getDiaChi(),vanchuyen.get(i).getChucVu(),vanchuyen.get(i).getTrinhDo(),
                vanchuyen.get(i).getMaPhuCap(),vanchuyen.get(i).getMaPhong(),vanchuyen.get(i).getMaThuong(),vanchuyen.get(i).getSoGio(),vanchuyen.get(i).getSoGioTangCa(),vanchuyen.get(i).getLuongTangCa());
                                    }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); }
                                if (quanly.size()>0){
                                  System.out.printf("\t**     BANG THONG TIN NHAN VIEN QUAN LY CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVQuanLy();
                                    for(int i=0;i<quanly.size();i++){
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).getgioiTinh(),quanly.get(i).getNgaySinh(),quanly.get(i).getLuongThuong(),quanly.get(i).getLuongPhuCap()
                ,quanly.get(i).getDiaChi(),quanly.get(i).getChucVu(),quanly.get(i).getTrinhDo(),
                quanly.get(i).getMaPhuCap(),quanly.get(i).getMaPhong(),quanly.get(i).getMaThuong(),quanly.get(i).getSoNgay(),quanly.get(i).getSoGioTangCa(),quanly.get(i).getLuongTangCa(),quanly.get(i).getLuongNgay());
                                    }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();  }           
                                       break;   
                                case 3: constantThongTin.inPhongBan();
                                        break; 
                                case 4: constantThongTin.inBH();
                                        break;   
                                case 5: constantThongTin.inPhuCap();
                                        break; 
                                case 6: constantThongTin.inThuong();
                                        break;      
                            }
                    }while(key3!=0);
                    break;
                case 3:
                  do{    
                              do{
                            System.out.println("Ban muon them nhan vien cho phong ban nao('Cong xuong','Van chuyen','Thu Ngan','Quan ly','Ban hang'):");  
                              ktNhap=input.nextLine();
                              }
                              while (ktNhap.equals("Cong xuong")==false&&ktNhap.equals("Van chuyen")==false&&ktNhap.equals("Thu ngan")==false&&ktNhap.equals("Quan ly")==false&&ktNhap.equals("Ban hang")==false);
                          
                        if (ktNhap.equals("Cong xuong")==true){
                              do{ 
                              congxuong.add(nhap.nhapNhanVienCX());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);
                              
                            }
                          while(nhap1.equals("yes")==true);}
                           
                           else if(ktNhap.equals("Van chuyen")==true){
                               do{
                            vanchuyen.add(nhap.nhapNhanVienVC());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);
                           }
                               while(nhap1.equals("yes")==true);}
                            else if(ktNhap.equals("Thu ngan")==true){
                                do{
                            thungan.add(nhap.nhapNhanVienTN());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);
                           }
                                while(nhap1.equals("yes")==true);}
                            else if(ktNhap.equals("Quan ly")==true){
                                do{
                            quanly.add(nhap.nhapNhanVienQL());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);
                           }
                                while(nhap1.equals("yes")==true);}
                            else if(ktNhap.equals("Ban hang")==true){
                                do{
                            banhang.add(nhap.nhapNhanVienBH());
                              do{
                                     System.out.println("Ban co muon nhap tiep khong('yes' hoac 'no'): ");
                                     nhap1=input.nextLine();
                                 }
                                 while(nhap1.equals("yes")==false&&nhap1.equals("no")==false);
                           }
                                while(nhap1.equals("yes")==true);}
                 
                           
                           
                           
                           
                           
                           
                           
                             do{
                                     System.out.println("Ban co muon nhap cho phong ban khac khong('yes' hoac 'no'): ");
                                     nhap2=input.nextLine();
                                 }
                                 while(nhap2.equals("yes")==false&&nhap2.equals("no")==false);
                          } 
                          while (nhap2.equals("yes")==true);
                          break;  
                case 4:
                    do{
                      chuc_nang.quanLyLuong();
                      do{
                        key4=Integer.parseInt(input.nextLine());
                        if ((key4!=0)&&(key4!=1)&&(key4!=2)&&(key4!=3)) System.out.println("Khong hop le. Vui long nhap lai");
                      }while((key4!=0)&&(key4!=1)&&(key4!=2)&&(key4!=3));
                    switch(key4){
                        case 1:
                            do{System.out.println("Nhap phong ban muon xem luong('Cong xuong','Van chuyen','Thu Ngan','Quan ly','Ban hang'): ");
                            ktNhap1=input.nextLine();
                              }
                              while (ktNhap1.equals("Cong xuong")==false&&ktNhap1.equals("Van chuyen")==false&&ktNhap1.equals("Thu ngan")==false&&ktNhap1.equals("Quan ly")==false&&ktNhap1.equals("Ban hang")==false);
                            if (ktNhap1.equals("Cong xuong")==true){
                              System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN CONG XUONG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                        for(int i=0;i<congxuong.size();i++){
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).tinhLuongCoBan(),congxuong.get(i).tinhLuongTangCa(),congxuong.get(i).tinhLuong());
                              }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();             
                          
                            }
                           else if(ktNhap1.equals("Van chuyen")==true){
                                 System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN VAN CHUYEN CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                        for(int i=0;i<vanchuyen.size();i++){
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).tinhLuongCoBan(),vanchuyen.get(i).tinhLuongTangCa(),vanchuyen.get(i).tinhLuong());
                              }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();      
                           }
                            else if(ktNhap1.equals("Thu ngan")==true){
                                    System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN THU NGAN CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                        for(int i=0;i<thungan.size();i++){
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).tinhLuongCoBan(),thungan.get(i).tinhLuongTangCa(),thungan.get(i).tinhLuong());
                              }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();      
                                   }
                            
                            else if(ktNhap1.equals("Quan ly")==true){
                               System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN QUAN LY CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                        for(int i=0;i<quanly.size();i++){
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).tinhLuongCoBan(),quanly.get(i).tinhLuongTangCa(),quanly.get(i).tinhLuong());
                              }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();      
                            }
                            else {
                             System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                        for(int i=0;i<banhang.size();i++){
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).tinhLuongCoBan(),banhang.get(i).tinhLuongTangCa(),banhang.get(i).tinhLuong());
                              }
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();      
                                                                                                                                                                         
                            }
                        break;
                        case 2: double max=0;
                                for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()>max) max=congxuong.get(i).tinhLuong();
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()>max) max=banhang.get(i).tinhLuong();
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).tinhLuong()>max) max=vanchuyen.get(i).tinhLuong();
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()>max) max=thungan.get(i).tinhLuong();
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()>max) max=quanly.get(i).tinhLuong();
                                }
                        
                        for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()==max){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).tinhLuongCoBan(),congxuong.get(i).tinhLuongTangCa(),congxuong.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                       for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()==max){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).tinhLuongCoBan(),banhang.get(i).tinhLuongTangCa(),banhang.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).tinhLuong()==max){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).tinhLuongCoBan(),vanchuyen.get(i).tinhLuongTangCa(),vanchuyen.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()==max){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).tinhLuongCoBan(),thungan.get(i).tinhLuongTangCa(),thungan.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()==max){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).tinhLuongCoBan(),quanly.get(i).tinhLuongTangCa(),quanly.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                       break; 
                        case 3:
                             double m=0;
                                for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()>m) m=congxuong.get(i).tinhLuong();
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()>m) m=banhang.get(i).tinhLuong();
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).tinhLuong()>m) m=vanchuyen.get(i).tinhLuong();
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()>m) m=thungan.get(i).tinhLuong();
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()>m) m=quanly.get(i).tinhLuong();
                                }
                           double min=m;
                                for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()<min) min=congxuong.get(i).tinhLuong();
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()<min) min=banhang.get(i).tinhLuong();
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).tinhLuong()<min) min=vanchuyen.get(i).tinhLuong();
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()<min) min=thungan.get(i).tinhLuong();
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()<min) min=quanly.get(i).tinhLuong();
                                }
                        
                        for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()==min){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).tinhLuongCoBan(),congxuong.get(i).tinhLuongTangCa(),congxuong.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                       for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()==min){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).tinhLuongCoBan(),banhang.get(i).tinhLuongTangCa(),banhang.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).tinhLuong()==min){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).tinhLuongCoBan(),vanchuyen.get(i).tinhLuongTangCa(),vanchuyen.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()==min){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).tinhLuongCoBan(),thungan.get(i).tinhLuongTangCa(),thungan.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()==min){
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).tinhLuongCoBan(),quanly.get(i).tinhLuongTangCa(),quanly.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                       break;
                    }}
                    while(key4!=0);
                    break;
                case 5: 
                    do{
                      chuc_nang.timNhanVien();
                      do{
                        key5=Integer.parseInt(input.nextLine());
                        if ((key5!=0)&&(key5!=1)&&(key5!=2)&&(key5!=3)&&(key5!=4)&&(key5!=5)) System.out.println("Khong hop le. Vui long nhap lai");
                      }while((key5!=0)&&(key5!=1)&&(key5!=2)&&(key5!=3)&&(key5!=4)&&(key5!=5));
                    switch(key5){
                        case 1:
                            boolean ktms=false;
                            System.out.println("Nhap ma so nhan vien can tim: ");
                            String maSo=input.nextLine();
                            for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).getMaSo().equals(maSo)==true){
                                        ktms=true;
                                        System.out.printf("\t**    BANG THONG TIN NHAN VIEN CONG XUONG CUA CONG TY EST ROUGE   **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVCongXuong();
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).getgioiTinh(),congxuong.get(i).getNgaySinh(),congxuong.get(i).getLuongThuong(),congxuong.get(i).getLuongPhuCap(),
                congxuong.get(i).getLuongGio(),congxuong.get(i).getDiaChi(),congxuong.get(i).getChucVu(),congxuong.get(i).getTrinhDo(),
                congxuong.get(i).getMaPhuCap(),congxuong.get(i).getMaPhong(),congxuong.get(i).getMaThuong(),congxuong.get(i).getSoGio(),congxuong.get(i).getSoGioTangCa(),congxuong.get(i).getLuongTangCa());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();
                                    }
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).getMaSo().equals(maSo)==true){
                                        ktms=true;
                                         System.out.printf("\t**     BANG THONG TIN NHAN VIEN BAN HANG CUA CONG TY EST ROUGE      **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVBanHang();
                                    
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).getgioiTinh(),banhang.get(i).getNgaySinh(),banhang.get(i).getLuongThuong(),banhang.get(i).getLuongPhuCap()
                ,banhang.get(i).getDiaChi(),banhang.get(i).getChucVu(),banhang.get(i).getTrinhDo(),
                banhang.get(i).getMaPhuCap(),banhang.get(i).getMaPhong(),banhang.get(i).getMaThuong(),banhang.get(i).getSoHang(),banhang.get(i).getSoGioTangCa(),banhang.get(i).getLuongTangCa(),banhang.get(i).getLuongHang());
                                
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); 
                                    }
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).getMaSo().equals(maSo)==true){
                                        ktms=true;
                                        System.out.printf("\t**   BANG THONG TIN NHAN VIEN VAN CHUYEN CUA CONG TY EST ROUGE  **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVVanChuyen();
                                  
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).getgioiTinh(),vanchuyen.get(i).getNgaySinh(),vanchuyen.get(i).getLuongThuong(),vanchuyen.get(i).getLuongPhuCap(),
                vanchuyen.get(i).getLuongGio(),vanchuyen.get(i).getDiaChi(),vanchuyen.get(i).getChucVu(),vanchuyen.get(i).getTrinhDo(),
                vanchuyen.get(i).getMaPhuCap(),vanchuyen.get(i).getMaPhong(),vanchuyen.get(i).getMaThuong(),vanchuyen.get(i).getSoGio(),vanchuyen.get(i).getSoGioTangCa(),vanchuyen.get(i).getLuongTangCa());
                                  
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); 
                                    }
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).getMaSo().equals(maSo)==true){
                                        ktms=true;
                                         System.out.printf("\t**     BANG THONG TIN NHAN VIEN THU NGAN CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVThuNgan();
                                  
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).getgioiTinh(),thungan.get(i).getNgaySinh(),thungan.get(i).getLuongThuong(),thungan.get(i).getLuongPhuCap()
                ,thungan.get(i).getDiaChi(),thungan.get(i).getChucVu(),thungan.get(i).getTrinhDo(),
                thungan.get(i).getMaPhuCap(),thungan.get(i).getMaPhong(),thungan.get(i).getMaThuong(),thungan.get(i).getSoNgay(),thungan.get(i).getSoGioTangCa(),thungan.get(i).getLuongTangCa(),thungan.get(i).getLuongNgay());
                                 
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).getMaSo().equals(maSo)==true){
                                        ktms=true;
                                        System.out.printf("\t**     BANG THONG TIN NHAN VIEN QUAN LY CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVQuanLy();
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).getgioiTinh(),quanly.get(i).getNgaySinh(),quanly.get(i).getLuongThuong(),quanly.get(i).getLuongPhuCap()
                ,quanly.get(i).getDiaChi(),quanly.get(i).getChucVu(),quanly.get(i).getTrinhDo(),
                quanly.get(i).getMaPhuCap(),quanly.get(i).getMaPhong(),quanly.get(i).getMaThuong(),quanly.get(i).getSoNgay(),quanly.get(i).getSoGioTangCa(),quanly.get(i).getLuongTangCa(),quanly.get(i).getLuongNgay());
                                    
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();
                                    }
                                }
                       if(ktms==false) System.out.println("Khong ton tai nhan vien co ma so "+maSo);
                            break;
                        case 2:
                            boolean ktname=false;
                            System.out.println("Nhap ten nhan vien can tim: ");
                            String ten=input.nextLine();
                            for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).getName().equals(ten)==true){
                                        ktname=true;
                                        System.out.printf("\t**    BANG THONG TIN NHAN VIEN CONG XUONG CUA CONG TY EST ROUGE   **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVCongXuong();
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).getgioiTinh(),congxuong.get(i).getNgaySinh(),congxuong.get(i).getLuongThuong(),congxuong.get(i).getLuongPhuCap(),
                congxuong.get(i).getLuongGio(),congxuong.get(i).getDiaChi(),congxuong.get(i).getChucVu(),congxuong.get(i).getTrinhDo(),
                congxuong.get(i).getMaPhuCap(),congxuong.get(i).getMaPhong(),congxuong.get(i).getMaThuong(),congxuong.get(i).getSoGio(),congxuong.get(i).getSoGioTangCa(),congxuong.get(i).getLuongTangCa());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();
                                    }
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).getName().equals(ten)==true){
                                        ktname=true;
                                         System.out.printf("\t**     BANG THONG TIN NHAN VIEN BAN HANG CUA CONG TY EST ROUGE      **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVBanHang();
                                    
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).getgioiTinh(),banhang.get(i).getNgaySinh(),banhang.get(i).getLuongThuong(),banhang.get(i).getLuongPhuCap()
                ,banhang.get(i).getDiaChi(),banhang.get(i).getChucVu(),banhang.get(i).getTrinhDo(),
                banhang.get(i).getMaPhuCap(),banhang.get(i).getMaPhong(),banhang.get(i).getMaThuong(),banhang.get(i).getSoHang(),banhang.get(i).getSoGioTangCa(),banhang.get(i).getLuongTangCa(),banhang.get(i).getLuongHang());
                                
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); 
                                    }
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).getName().equals(ten)==true){
                                        ktname=true;
                                        System.out.printf("\t**   BANG THONG TIN NHAN VIEN VAN CHUYEN CUA CONG TY EST ROUGE  **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVVanChuyen();
                                  
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).getgioiTinh(),vanchuyen.get(i).getNgaySinh(),vanchuyen.get(i).getLuongThuong(),vanchuyen.get(i).getLuongPhuCap(),
                vanchuyen.get(i).getLuongGio(),vanchuyen.get(i).getDiaChi(),vanchuyen.get(i).getChucVu(),vanchuyen.get(i).getTrinhDo(),
                vanchuyen.get(i).getMaPhuCap(),vanchuyen.get(i).getMaPhong(),vanchuyen.get(i).getMaThuong(),vanchuyen.get(i).getSoGio(),vanchuyen.get(i).getSoGioTangCa(),vanchuyen.get(i).getLuongTangCa());
                                  
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); 
                                    }
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).getName().equals(ten)==true){
                                        ktname=true;
                                         System.out.printf("\t**     BANG THONG TIN NHAN VIEN THU NGAN CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVThuNgan();
                                  
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).getgioiTinh(),thungan.get(i).getNgaySinh(),thungan.get(i).getLuongThuong(),thungan.get(i).getLuongPhuCap()
                ,thungan.get(i).getDiaChi(),thungan.get(i).getChucVu(),thungan.get(i).getTrinhDo(),
                thungan.get(i).getMaPhuCap(),thungan.get(i).getMaPhong(),thungan.get(i).getMaThuong(),thungan.get(i).getSoNgay(),thungan.get(i).getSoGioTangCa(),thungan.get(i).getLuongTangCa(),thungan.get(i).getLuongNgay());
                                 
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).getName().equals(ten)==true){
                                        ktname=true;
                                        System.out.printf("\t**     BANG THONG TIN NHAN VIEN QUAN LY CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVQuanLy();
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).getgioiTinh(),quanly.get(i).getNgaySinh(),quanly.get(i).getLuongThuong(),quanly.get(i).getLuongPhuCap()
                ,quanly.get(i).getDiaChi(),quanly.get(i).getChucVu(),quanly.get(i).getTrinhDo(),
                quanly.get(i).getMaPhuCap(),quanly.get(i).getMaPhong(),quanly.get(i).getMaThuong(),quanly.get(i).getSoNgay(),quanly.get(i).getSoGioTangCa(),quanly.get(i).getLuongTangCa(),quanly.get(i).getLuongNgay());
                                    
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();
                                    }
                                }
                       if(ktname==false) System.out.println("Khong ton tai nhan vien co ten "+ten);
                            break;
                        case 3:
                            boolean ktdc=false;
                            System.out.println("Nhap dia chi nhan vien can tim: ");
                            String diachi=input.nextLine();
                            for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).getDiaChi().equals(diachi)==true){
                                        ktdc=true;
                                        System.out.printf("\t**    BANG THONG TIN NHAN VIEN CONG XUONG CUA CONG TY EST ROUGE   **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVCongXuong();
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).getgioiTinh(),congxuong.get(i).getNgaySinh(),congxuong.get(i).getLuongThuong(),congxuong.get(i).getLuongPhuCap(),
                congxuong.get(i).getLuongGio(),congxuong.get(i).getDiaChi(),congxuong.get(i).getChucVu(),congxuong.get(i).getTrinhDo(),
                congxuong.get(i).getMaPhuCap(),congxuong.get(i).getMaPhong(),congxuong.get(i).getMaThuong(),congxuong.get(i).getSoGio(),congxuong.get(i).getSoGioTangCa(),congxuong.get(i).getLuongTangCa());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();
                                    }
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).getDiaChi().equals(diachi)==true){
                                        ktdc=true;
                                         System.out.printf("\t**     BANG THONG TIN NHAN VIEN BAN HANG CUA CONG TY EST ROUGE      **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVBanHang();
                                    
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).getgioiTinh(),banhang.get(i).getNgaySinh(),banhang.get(i).getLuongThuong(),banhang.get(i).getLuongPhuCap()
                ,banhang.get(i).getDiaChi(),banhang.get(i).getChucVu(),banhang.get(i).getTrinhDo(),
                banhang.get(i).getMaPhuCap(),banhang.get(i).getMaPhong(),banhang.get(i).getMaThuong(),banhang.get(i).getSoHang(),banhang.get(i).getSoGioTangCa(),banhang.get(i).getLuongTangCa(),banhang.get(i).getLuongHang());
                                
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); 
                                    }
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).getDiaChi().equals(diachi)==true){
                                        ktdc=true;
                                        System.out.printf("\t**   BANG THONG TIN NHAN VIEN VAN CHUYEN CUA CONG TY EST ROUGE  **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVVanChuyen();
                                  
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).getgioiTinh(),vanchuyen.get(i).getNgaySinh(),vanchuyen.get(i).getLuongThuong(),vanchuyen.get(i).getLuongPhuCap(),
                vanchuyen.get(i).getLuongGio(),vanchuyen.get(i).getDiaChi(),vanchuyen.get(i).getChucVu(),vanchuyen.get(i).getTrinhDo(),
                vanchuyen.get(i).getMaPhuCap(),vanchuyen.get(i).getMaPhong(),vanchuyen.get(i).getMaThuong(),vanchuyen.get(i).getSoGio(),vanchuyen.get(i).getSoGioTangCa(),vanchuyen.get(i).getLuongTangCa());
                                  
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println(); 
                                    }
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).getDiaChi().equals(diachi)==true){
                                        ktdc=true;
                                         System.out.printf("\t**     BANG THONG TIN NHAN VIEN THU NGAN CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVThuNgan();
                                  
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).getgioiTinh(),thungan.get(i).getNgaySinh(),thungan.get(i).getLuongThuong(),thungan.get(i).getLuongPhuCap()
                ,thungan.get(i).getDiaChi(),thungan.get(i).getChucVu(),thungan.get(i).getTrinhDo(),
                thungan.get(i).getMaPhuCap(),thungan.get(i).getMaPhong(),thungan.get(i).getMaThuong(),thungan.get(i).getSoNgay(),thungan.get(i).getSoGioTangCa(),thungan.get(i).getLuongTangCa(),thungan.get(i).getLuongNgay());
                                 
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).getDiaChi().equals(diachi)==true){
                                        ktdc=true;
                                        System.out.printf("\t**     BANG THONG TIN NHAN VIEN QUAN LY CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|");
                                    constantThongTin.inNVQuanLy();
                                    System.out.printf("\n\t| %-10s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-30s  |  %-30s  |  %-30s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |  %-15s  |",
                quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).getgioiTinh(),quanly.get(i).getNgaySinh(),quanly.get(i).getLuongThuong(),quanly.get(i).getLuongPhuCap()
                ,quanly.get(i).getDiaChi(),quanly.get(i).getChucVu(),quanly.get(i).getTrinhDo(),
                quanly.get(i).getMaPhuCap(),quanly.get(i).getMaPhong(),quanly.get(i).getMaThuong(),quanly.get(i).getSoNgay(),quanly.get(i).getSoGioTangCa(),quanly.get(i).getLuongTangCa(),quanly.get(i).getLuongNgay());
                                    
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|=====================================================================================================================================================================================================================================================================================================================================================================================|"); 
                                        System.out.println();
                                    }
                                }
                       if(ktdc==false) System.out.println("Khong ton tai nhan vien co dia chi "+diachi);
                            break;
                        case 4:
                            System.out.println("Nhap muc luong nhan vien can tim: ");
                            double luong=Double.parseDouble(input.nextLine());
                            boolean ktluong=false;
                            for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()>luong){
                                        ktluong=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).tinhLuongCoBan(),congxuong.get(i).tinhLuongTangCa(),congxuong.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                       for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()>luong){
                                        ktluong=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).tinhLuongCoBan(),banhang.get(i).tinhLuongTangCa(),banhang.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                            
                                    if (vanchuyen.get(i).tinhLuong()>luong){
                                        ktluong=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).tinhLuongCoBan(),vanchuyen.get(i).tinhLuongTangCa(),vanchuyen.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()>luong){
                                        ktluong=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).tinhLuongCoBan(),thungan.get(i).tinhLuongTangCa(),thungan.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()>luong){
                                        ktluong=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).tinhLuongCoBan(),quanly.get(i).tinhLuongTangCa(),quanly.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                        if (ktluong==false) System.out.println("Khong ai co muc luong lon hon "+luong);
                            break; 
                        case 5:
                            System.out.println("Nhap muc luong nhan vien can tim: ");
                            double luong1=Double.parseDouble(input.nextLine());
                            boolean ktluong1=false;
                            for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).tinhLuong()<luong1){
                                        ktluong1=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",congxuong.get(i).getMaSo(),congxuong.get(i).getName(),congxuong.get(i).tinhLuongCoBan(),congxuong.get(i).tinhLuongTangCa(),congxuong.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                       for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).tinhLuong()<luong1){
                                        ktluong1=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",banhang.get(i).getMaSo(),banhang.get(i).getName(),banhang.get(i).tinhLuongCoBan(),banhang.get(i).tinhLuongTangCa(),banhang.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                            
                                    if (vanchuyen.get(i).tinhLuong()<luong1){
                                        ktluong1=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",vanchuyen.get(i).getMaSo(),vanchuyen.get(i).getName(),vanchuyen.get(i).tinhLuongCoBan(),vanchuyen.get(i).tinhLuongTangCa(),vanchuyen.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).tinhLuong()<luong1){
                                        ktluong1=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",thungan.get(i).getMaSo(),thungan.get(i).getName(),thungan.get(i).tinhLuongCoBan(),thungan.get(i).tinhLuongTangCa(),thungan.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    };
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).tinhLuong()<luong1){
                                        ktluong1=true;
                                      System.out.printf("\t**     BANG THONG TIN LUONG NHAN VIEN BAN HANG CUA CONG TY EST ROUGE     **");
                                        System.out.printf("\n\t|===============================================================================================================================|");
                                      constantThongTin.inLuong();
                                  System.out.printf("\n\t| %-15s |  %-30s  |  %-15s  |  %-15s  |  %-30s  |",quanly.get(i).getMaSo(),quanly.get(i).getName(),quanly.get(i).tinhLuongCoBan(),quanly.get(i).tinhLuongTangCa(),quanly.get(i).tinhLuong());
                                        System.out.printf("\n\t|-------------------------------------------------------------------------------------------------------------------------------|");
                                        System.out.printf("\n\t|===============================================================================================================================|"); 
                                        System.out.println();   
                                    }
                                }
                        if (ktluong1==false) System.out.println("Khong ai co muc luong nho hon "+luong1);
                            break;    
                    }}
                    while(key5!=0);
                    break;
                    
                 case 6:
                     System.out.println("Nhap ma so nhan vien can xoa: ");
                            String maSo=input.nextLine();
                      boolean ktxoa=false;
                      for(int i=0;i<congxuong.size();i++){
                                    if (congxuong.get(i).getMaSo().equals(maSo)==true){
                                        ktxoa=true;
                                        congxuong.remove(i);
                                    }
                                }
                        for(int i=0;i<banhang.size();i++){
                                    if (banhang.get(i).getMaSo().equals(maSo)==true){
                                        ktxoa=true;
                                        banhang.remove(i);
                                    }
                                }
                        for(int i=0;i<vanchuyen.size();i++){
                                    if (vanchuyen.get(i).getMaSo().equals(maSo)==true){
                                        ktxoa=true;
                                        vanchuyen.remove(i);
                                    }
                                }
                        for(int i=0;i<thungan.size();i++){
                                    if (thungan.get(i).getMaSo().equals(maSo)==true){
                                        ktxoa=true;
                                        thungan.remove(i);   
                                    }
                                }
                        for(int i=0;i<quanly.size();i++){
                                    if (quanly.get(i).getMaSo().equals(maSo)==true){
                                        ktxoa=true;
                                        quanly.remove(i);
                                    }
                                }
                       if(ktxoa==false) System.out.println("Khong ton tai nhan vien co ma so "+maSo);      
                    break;   
                    
                   }
                
                }
                while(key2!=0);}
                break;                     
            case 2:
                System.out.println("\t\t\t**************************************************************");
                System.out.println("\t\t\t===========================LOGIN==============================");
                System.out.println("\t\t\t**  Ban phai nhap tai khoan Admin de dang ki tai khoan moi  **");
                System.out.print("\t\t\t**             Nhap userName Admin: ");
                String b=input.nextLine();
                System.out.print("\t\t\t**             Nhap password Admin: ");
                String c=input.nextLine();
                if(b.equals("administrator")==true && c.equals("admin")==true){
                account tam2=nhap.dkAccount();
                boolean kt2=true;
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getUserName().equals(tam2.getUserName())==true)
                        kt2=false;
                }
                if (kt2==true) {
                    System.out.println("Chuc mung ban da dang ky thanh cong!");
                    list.add(tam2);
                }
                else System.out.println("Tai khoan da co. Vui long chon lai");}
                else System.out.println("Ban nhap sai tai khoan Admin. Vui long chon lai.");
                break;
            case 3: break;  
        }
    } while(key!=3);
}}
