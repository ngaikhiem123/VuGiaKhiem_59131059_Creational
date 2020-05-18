/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class HoaDonHeader {

    String maHD, tenKhachHang;
    Date ngayBan;

    public HoaDonHeader(String maHD, Date ngayBan, String tenKhachHang) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader [maHD=" + maHD + ", tenKhachHang=" + tenKhachHang + ", ngayBan=" + ngayBan + "]\n";
    }

}
