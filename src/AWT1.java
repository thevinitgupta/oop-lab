import java.awt.*;
import java.awt.Frame;
import java.awt.Button;


//AWT -> Abstract Window Toolkit
//Its abstract because the view of a window changes in Different OS.  

//! note : AWT is not responsible for creating the differences in different OS
//If it didn't change, it would have been Concrete Window Toolkit

public class AWT1 {
    static int count = 0;
    public static void main(String[] args) {
       Frame f = new Frame();
       Button btn = new Button("Count");
       f.setTitle("My First Window");
       TextField tf = new TextField(20);
       f.add(tf);
       f.add(btn);
       //lambda expression -> We are adding the function as an event listener callback.
       btn.addActionListener((e)-> tf.setText("Clicked : "+(++count)));
       f.setLayout(new FlowLayout());
       f.setSize(500, 500);
       f.setVisible(true); 
    }
}
