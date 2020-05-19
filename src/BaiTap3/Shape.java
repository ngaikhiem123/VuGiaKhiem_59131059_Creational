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
public abstract class Shape {

    private String brush, paper, frame;

    public Shape() {
        this.brush = "Chưa rõ";
        this.paper = "Chưa rõ";
        this.frame = "Chưa rõ";
    }
   
    public String draw(){
        return "brush: " + brush 
                + "\npaper: " + paper
                + "\nframe: " + frame;
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

}
