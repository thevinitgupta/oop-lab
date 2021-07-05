
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

//Action listener works on clicking a button, text listener works on changing text value

//hw : 2 text field and and a label -> after pressing enter, you have print "label1 label2" where label1 and label2 are contents of the two text fields

//hw2 : 2 text fields and 2 labels -> label 1 is name and then there is a text field 1, then we have label2 is email address and there is a textfield, then there is button called submit, When submit is pressed, we have a label below the button that has output : 
// name : 
// email :
class MyFrame extends Frame implements  ActionListener,TextListener{
    Label l1,l2;
    TextField tf;
    MyFrame(){
        super("Text Field Demo");
        l1 = new Label("No Text Entered Yet");
        l2 = new Label("Enter key is not yet pressed");
        tf = new TextField(20);
        //*changing the value of text field visible as star to hide from others - like a password
        tf.setEchoChar('*');

        tf.addTextListener(this);
        tf.addActionListener(this);

        add(l1);
        add(l2);
        add(tf);
    }

    //over ride add action listener and add text listener

    //method that belongs to the text listener that handles the change in text values
    public void textValueChanged(TextEvent te){
        //tf.getText() will take character by character from the text field and set the value of l1 to this value -> remember this listens and updates continuously as the value of tf changes
        l1.setText(tf.getText());
    }

    //by default this method listens to the enter button, to change this we have to handle the action event object
    public void actionPerformed(ActionEvent ae) {

        //when I am pressing the enter button this function is called and it will update the l2 value
        l2.setText(tf.getText());
    }
    
}

public class Awt4 {
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400,400);

        fr.setLayout(new FlowLayout());
        //fr.setLayout(new BoxLayout(fr,BoxLayout.Y_AXIS ));
        fr.setVisible(true);
    }
}
