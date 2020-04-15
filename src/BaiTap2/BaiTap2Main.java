/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author TNT
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        
        HangHoa h1 = new HangHoa("Áo thun",380000,"Vải cotton");
        HangHoa h2 = new HangHoa("Quần jean",700000,"Vải jean");
        HangHoa h3 = new HangHoa("Áo khoác",400000,"Vải dù");
        HangHoa h4 = new HangHoa("Áo ấm",500000,"Vải len");
        HangHoa h5 = new HangHoa("Quần kaki",400000,"Vải kaki");
        
        gh1.themHH(h1);
        gh1.themHH(h2);
        
        gh2.themHH(h1);
        gh2.themHH(h2);
        gh2.themHH(h3);
        gh2.themHH(h4);
        gh2.themHH(h5);
        
        gh1.hinhThucTT(new ThanhToanOnline());
        gh2.hinhThucTT(new ThanhToanCOD());
        
        System.out.println("\nGiỏ hàng 1(ONL):");
        gh1.hienThiGH();
        System.out.println("\nTổng tiền hàng: " + gh1.tongTienHang());
        System.out.println("Số tiền khách phải trả: " + gh1.tongTienKHTra());
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("\nGiỏ hàng 2(COD):");
        gh2.hienThiGH();
        System.out.println("\nTổng tiền hàng: " + gh2.tongTienHang());
        System.out.println("Số tiền khách phải trả: " + gh2.tongTienKHTra());
    }
    
}
