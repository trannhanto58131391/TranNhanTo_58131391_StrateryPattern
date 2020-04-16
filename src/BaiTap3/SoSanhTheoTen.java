/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author TNT
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>
{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if ((int) o1.getHoTen().charAt(0) == (int) o2.getHoTen().charAt(0)) {
            return 0;
        } else if ((int) o1.getHoTen().charAt(0) > (int) o2.getHoTen().charAt(0)) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
