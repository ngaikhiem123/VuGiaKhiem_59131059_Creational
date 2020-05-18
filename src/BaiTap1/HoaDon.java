/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class HoaDon {

    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> cthd;

    protected HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthd = builder.cthd;
    }

    @Override
    public String toString() {
        return "HoaDon [hoaDonHeader=" + hoaDonHeader + ", cthd=" + cthd + "]\n";
    }

    public static class Builder {

        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> cthd;

        public Builder() {
            cthd = new ArrayList<>();
        }

        ;
		
		public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder addCTHD(CTHD cthd) {
            this.cthd.add(cthd);
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
