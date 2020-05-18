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
public class ShapeFactory {

    private Shape shape;

    public Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case circle:
                return Circle.getCircle();
            case rectangle:
                return Rectangle.getRectangle();
            case triangle:
                return Triangle.getTriangle();
            default:
                return null;
        }
    }
}
