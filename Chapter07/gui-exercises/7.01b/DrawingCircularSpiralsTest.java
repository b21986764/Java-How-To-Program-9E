/*
 *       Filename:  DrawingCircularSpiralsTest.java
 *
 *    Description:  Exercise 7.1b - Drawing Spirals - Circular
 *
 *        Created:  18/10/15 17:52:10
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class DrawingCircularSpiralsTest{
    public static void main(String[] args){
        DrawingCircularSpirals panel = new DrawingCircularSpirals();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
    }
}
