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
public class MyStringBuilder {

    String str;

    public MyStringBuilder() {
        str = new String();
    }

    public MyStringBuilder addString(String s) {
        str += s;
        return this;
    }

    public MyStringBuilder addFloat(Float d) {
        str += d;
        return this;
    }

    public MyStringBuilder addBool(Boolean b) {
        str += b;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
