/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TNT
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SinhVien> sv = new ArrayList<>();
        
        sv.add(new SinhVien("Trần Nhân Tố", new Date(), (float) 8.5));
        sv.add(new SinhVien("Lê Quốc Dũng", new Date(), (float) 9.5));
        sv.add(new SinhVien("Trần Hoàng", new Date(), (float) 5.5));
        sv.add(new SinhVien("Kim Khuê", new Date(), (float) 4.5));
        sv.add(new SinhVien("Tuấn Đạt", new Date(), (float) 7.5));
        sv.add(new SinhVien("Xuân Huệ", new Date(), (float) 6.5));
        sv.add(new SinhVien("Hữu Dũng", new Date(), (float) 7.0));
        
        QLSV qlsv = new QLSV(sv);
        
        System.out.println("Sắp xếp theo điểm:");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
        System.out.println("----------------------------------------------------");
        System.out.println("Sắp xếp theo tên:");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
    }
    
}
