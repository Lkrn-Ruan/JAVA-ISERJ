package jpasswordfieldjava;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class JFormattedTextFieldMask extends JFrame{
   JFormattedTextField data1, data2;
   MaskFormatter mask1, mask2;
    public JFormattedTextFieldMask()throws ParseException{
        mask1=new MaskFormatter("##=####-###");
        mask1.setPlaceholderCharacter('-');
        data1= new JFormattedTextField(mask1);
        add(data1);
        
        mask2= new MaskFormatter("(**)****-****");
        data2= new JFormattedTextField(mask2);
        data2.setColumns(8);
        mask2.setValidCharacters("01123456789ABCD");
        add(data2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String[]args) throws ParseException{
        
        JFormattedTextFieldMask frame= new JFormattedTextFieldMask();
    }
    }
    