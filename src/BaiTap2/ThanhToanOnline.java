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
public class ThanhToanOnline implements IThanhToan
{

    @Override
    public double thanhToan(int tienHang) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(tienHang < 1000000)
            return tienHang * 0.95;
        return tienHang * 0.93;
    }
    
}
