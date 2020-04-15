/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author TNT
 */
public class GioHang 
{
    private IThanhToan thanhToan;
    ArrayList<HangHoa> dsHH = new ArrayList();
    
    public void hinhThucTT(IThanhToan thanhToan)
    {
        this.thanhToan = thanhToan;
    }
    
    public double thanhToan(int tienHang)
    {
        return thanhToan.thanhToan(tienHang);
    }
    
    public void themHH(HangHoa hh)
    {
        dsHH.add(hh);
    }
    
    public int tongTienHang()
    {
        int tong = 0;
        for (int i=0; i<dsHH.size(); i++){
            tong += dsHH.get(i).getGia();
        }
        return tong;
    }
    
    public double tongTienKHTra()
    {
        return thanhToan.thanhToan(tongTienHang());
    }
    
    public void hienThiGH()
    {
        for (int i=0; i<dsHH.size(); i++){
            dsHH.get(i).hienThiHH();
        }
        
    }
}
