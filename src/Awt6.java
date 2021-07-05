import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//*hw2 : 2 text fields and 2 labels -> label 1 is name and then there is a text field 1, then we have label2 is email address and there is a textfield, then there is button called submit, When submit is pressed, we have a label below the button that has output : 
//? name : 
//? email :

class HwFrame2 extends Frame implements ActionListener{
    Label nameLabel,emailLabel,outputEmail,outputName,empty;
    TextField name,email;
    Button submit;
    public HwFrame2(){
        super("Name and Email");
        nameLabel = new Label("Name:");
        nameLabel.setFont(new Font("Comic Sans",Font.PLAIN,16));
        nameLabel.setPreferredSize(new Dimension(350,20));
        emailLabel = new Label("Email:");
        emailLabel.setFont(new Font("Comic Sans",Font.PLAIN,16));
        emailLabel.setPreferredSize(new Dimension(350,20));

        name = new TextField(25);
        email = new TextField(25);
        name.setFont(new Font("Sans Serif",Font.PLAIN,20));
        email.setFont(new Font("Sans Serif",Font.PLAIN,20));

        submit = new Button("Submit");
        submit.setPreferredSize(new Dimension(350,40));
        submit.setFont(new Font("Sans Serif",Font.PLAIN,20));
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);

        empty = new Label("");
        empty.setPreferredSize(new Dimension(350,80));

        outputEmail = new Label("");
        outputName = new Label("");
        outputEmail.setPreferredSize(new Dimension(350,30));
        outputName.setPreferredSize(new Dimension(350,30));

        add(nameLabel);
        add(name);
        add(emailLabel);
        add(email);
        add(submit);
        add(empty);
        add(outputName);
        add(outputEmail);
        
    }
    public void actionPerformed(ActionEvent ae){
        outputEmail.setBackground(Color.cyan);
        outputName.setBackground(Color.cyan);
        
        outputEmail.setFont(new Font("Sans Serif",Font.PLAIN,20));
        outputName.setFont(new Font("Sans Serif",Font.PLAIN,20));
        outputName.setText("Name : "+name.getText());
        outputEmail.setText("Email : "+email.getText());
    }
}

public class Awt6 {
    public static void main(String[] args) {
        HwFrame2 f = new HwFrame2();
        f.setLayout(new FlowLayout());

        f.setSize(600,700);
        f.setVisible(true);
    }
}
