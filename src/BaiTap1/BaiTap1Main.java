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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoaDon = new HoaDon.Builder()
                .addHoaDonHeader(new HoaDonHeader("A1", new Date(), "Khiem"))
                .addCTHD(new CTHD("Duong", 10, 10, 1))
                .addCTHD(new CTHD("Muoi", 100, 100, 1))
                .build();
        System.out.println(hoaDon.toString());
    }

}
