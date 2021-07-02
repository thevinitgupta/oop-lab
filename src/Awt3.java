import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Awt3 extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    //checkboxes cannot be used without a group
    CheckboxGroup cbg;
    public Awt3(){
        super("CheckBox Demo");
        l = new Label("No Checkboxes Selected ");
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Java",false,cbg);
        c2 = new Checkbox("C",false,cbg);
        c3 = new Checkbox("JavaScript",false,cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    public void itemStateChanged(ItemEvent e){
        String str = "";

        //getstate returns true or false based on the condition whether the checkbox is selected
        if(c1.getState()) str += " "+c1.getLabel();
        if(c2.getState()) str += " "+c2.getLabel();
        if(c3.getState()) str += " "+c3.getLabel();
        if(str.isEmpty()) str += "Nothing Selected!";

        l.setText(str);
    }
    public static void main(String[] args) {
        Awt3 fr = new Awt3();
        fr.setLayout(new FlowLayout());

        //pixels -> width x height
        fr.setSize(400,500);
        fr.setVisible(true);
    }
}
