
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//?hw : 2 text field and and a label -> after pressing enter, you have print "label1 label2" where label1 and label2 are contents of the two text fields

class HwFrame extends Frame implements ActionListener{
    Label l;
    TextField tf1,tf2;
    public HwFrame(){
        super("Hw Frame");
        l = new Label("No Data");
        l.setFont(new java.awt.Font("Sans Serif", 1, 20));
        l.setBackground(Color.DARK_GRAY);
        l.setForeground(Color.WHITE);
        l.setPreferredSize(new Dimension(350, 20));
        tf1 = new TextField(25);
        tf1.setFont(new java.awt.Font("Sans Serif", 1, 18));
        tf2 = new TextField(25);
        tf2.setFont(new java.awt.Font("Sans Serif", 1, 18));

        tf1.addActionListener(this);
        tf2.addActionListener(this);

        add(l);
        add(tf1);
        add(tf2);
    }
    public void actionPerformed(ActionEvent ae){
        l.setText(tf1.getText()+" "+tf2.getText());
    }
}

public class Awt5 {
    public static void main(String[] args) {
      HwFrame f = new HwFrame();
      f.setSize(400,700); 
      f.setLayout(new FlowLayout(FlowLayout.LEFT));
      f.setVisible(true);
    }
}
