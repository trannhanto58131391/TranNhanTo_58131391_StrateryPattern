/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author TNT
 */
public class QLSV 
{
    ArrayList<SinhVien> dssv;
    ISoSanh<SinhVien> sosanh;

    public QLSV(ArrayList<SinhVien> sinhvien) {
        this.dssv = sinhvien;
    }
    
    public ArrayList<SinhVien> getSinhVien() {
        return dssv;
    }
    
    public void setSoSanh(ISoSanh<SinhVien> sosanh) {
        this.sosanh = sosanh;
    }
    
    public void sapXep() {
        for (int i = 0; i < this.getSinhVien().size() - 1; i++) {
            for(int j = i + 1; j < this.getSinhVien().size(); j++) {
                if (this.sosanh.soSanh(this.getSinhVien().get(i), this.getSinhVien().get(j)) == 1) {
                    SinhVien svmax = this.getSinhVien().get(i);
                    SinhVien svmin = this.getSinhVien().get(j);
                    this.getSinhVien().set(i, svmin);
                    this.getSinhVien().set(j, svmax);
                }
            }
        }
    }
    
    public void inDS() {
        for (int i=0; i<dssv.size(); i++){
            System.out.println("Ho ten: " + dssv.get(i).getHoTen());
            System.out.println("Ngay sinh: " + dssv.get(i).getNgaySinh());
            System.out.println("Diem trung binh: " + dssv.get(i).getDiemTB());
        }
    }
}
