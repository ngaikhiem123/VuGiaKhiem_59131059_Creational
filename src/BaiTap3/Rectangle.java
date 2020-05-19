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
public class Rectangle extends Shape {

    private static Rectangle rectangle;

    protected Rectangle() {
        super();
    }

    public static Rectangle getRectangle() {
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return rectangle;
    }

    @Override
    public String draw() {
        return "Vẽ một hình chữ nhật với:\n" + super.draw();
    }

}
