/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author DELL
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new MyStringBuilder()
                .addString("ABC")
                .addFloat((float) 123.4)
                .addBool(true)
                .toString();

        System.out.println(s);
    }

}
