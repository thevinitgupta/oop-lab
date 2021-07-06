import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button btn;
    public MyFrame2(){
        super("Text Area Demo");

        l = new Label("No Text Entered!");
        l.setPreferredSize(new Dimension(400,30));
        ta = new TextArea(10,30);
        tf = new TextField(20);
        btn = new Button("CLICK");

        add(ta);
        add(l);
        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        //!this method always adds at the back
        // ta.append(tf.getText());
        // 

        //*add where the cursor is placed
        ta.insert(tf.getText(), ta.getCaretPosition());
        tf.setText("");

        //?both append and set label does not work simultaneously
        // String tString = ta.getSelectedText();
        // if(tString.length()!=0)
        // l.setText(ta.getSelectedText());
        // else 
        // l.setText("Please select text");
    }
}

public class Awt7 {
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
        f.setLayout(new FlowLayout());
        f.setSize(500,500);
        f.setVisible(true);
    }
}
