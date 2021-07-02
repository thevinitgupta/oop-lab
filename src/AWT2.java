import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWT2 extends Frame{

    //label -> only display, textfield -> take input and display
    Label l;
    TextField tf;
    Button btn;

    public AWT2(){
        //calling the Frame constructor with name of frame as argument
        super("My Second App");
        //setting the layout type as FlowLayout
        setLayout(new FlowLayout());

        //initializing frame components
        l = new Label("Name :");
        tf = new TextField(20);
        btn = new Button("Submit");

        //adding components to the frame
        add(l);
        add(tf);
        add(btn);
    }
    public static void main(String[] args) {
        AWT2 fr = new AWT2();
        fr.setLayout(new FlowLayout());
        fr.setSize(400,500);
        fr.setVisible(true);
    }
}
