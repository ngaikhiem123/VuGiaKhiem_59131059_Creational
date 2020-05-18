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
public class Triangle extends Shape{
    private static Triangle triangle;
	
	protected Triangle() {}

	public static Triangle getTriangle() {
		if (triangle == null) {
			triangle = new Triangle();
		}
		return triangle;
	}
	@Override
	public String draw() {
		return "Ve mot hinh tam giac";
	}
	
}
