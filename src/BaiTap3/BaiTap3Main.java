/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author DELL
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape circle = new ShapeFactory().createShape(ShapeType.circle);
        System.out.println(circle.draw());
        
        circle.setBrush("sử dụng cọ xịn");
        circle.setFrame("lấy khung chữ nhật");
        circle.setPaper("giấy nhám");
        System.out.println(circle.draw());
        
        //chỉ một hình tròn được tạo
        Shape circle2 = new ShapeFactory().createShape(ShapeType.circle);
        circle2.setPaper("giấy A0");
        
        System.out.println(circle.draw());
    }
    
}
