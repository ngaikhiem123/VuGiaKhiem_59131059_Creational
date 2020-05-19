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
                shape = Circle.getCircle();
                break;
            case rectangle:
                shape = Rectangle.getRectangle();
                break;
            case triangle:
                shape = Triangle.getTriangle();
                break;
        }
        return shape;
    }
}
