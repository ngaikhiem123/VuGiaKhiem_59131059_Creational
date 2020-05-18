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
public class Circle extends Shape{

    private static Circle circle;

    protected Circle() {
    }

    public static Circle getCircle() {
        if (circle == null) {
            circle = new Circle();
        }
        return circle;
    }

    @Override
    public String draw() {
        return "Ve mot hinh tron";
    }

}
