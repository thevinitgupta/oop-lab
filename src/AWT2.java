import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class AWT2 extends Frame implements ActionListener{

    //label -> only display, textfield -> take input and display
    Label l;
    TextField tf;
    Button btn;
    int count = 0;

    public AWT2(){
        //calling the Frame constructor with name of frame as argument
        super("My Second App");
        //setting the layout type as FlowLayout
        setLayout(new FlowLayout());

        //initializing frame components
        l = new Label("Count : "+count);

        //unit -> 20 columns
        tf = new TextField(20);
        btn = new Button("Submit");

        //works like the add event listener and the object passed is "this" which refers to the current calling class
        btn.addActionListener(this);

        //adding components to the frame
        add(l);
        add(tf);
        add(btn);
    }

    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("Count : "+count);
    }
    public static void main(String[] args) {
        AWT2 fr = new AWT2();
        fr.setLayout(new FlowLayout());

        //pixels -> width x height
        fr.setSize(400,500);
        fr.setVisible(true);
    }
}
