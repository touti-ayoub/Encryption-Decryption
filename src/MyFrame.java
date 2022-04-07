import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JTextField textArea1;
    JTextField textArea2;
    JLabel label1;
    JLabel label2;
    JButton encrypt;
    JButton decrypt;
    JLabel copyright;
    //constructor
    public MyFrame(){
        super("Encryption and Decryption");
        setLayout(new FlowLayout());        //add first text field
        label1 = new JLabel("enter a text:  ");
        add(label1);
        textArea1= new JTextField(10);
        add(textArea1);

        //add second text field
        label2 = new JLabel("result:  ");
        add(label2);
        textArea2= new JTextField(10);
        add(textArea2);
        encrypt = new JButton("encrypt!");
        add(encrypt);
        decrypt = new JButton("decrypt!");
        add(decrypt);
        copyright = new JLabel(" © Project realized by Ayoub Touti ");
        add(copyright);


        //organizing elements in a panel
        JPanel panel = new JPanel(new GridLayout(4,2,12,6));
        panel.add(label1);
        panel.add(textArea1);
        panel.add(label2);
        panel.add(textArea2);
        panel.add(encrypt);
        panel.add(decrypt);
        panel.add(copyright);
        add(panel);

        //start
        encrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text2=("");
                String text=textArea1.getText();
                //System.out.println("welcome"+textArea1.getText());
                char[] chars = text.toCharArray();
                for (char c : chars){
                    c +=5;
                    System.out.print(c);
                    text2 = (text2+c);
                    textArea2.setText(text2);
                }


            }
        });

        decrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text2=("");
                String text=textArea1.getText();
                //System.out.println("welcome"+textArea1.getText());
                char[] chars = text.toCharArray();
                for (char c : chars){
                    c -=5;
                    System.out.print(c);
                    text2 = (text2+c);
                    textArea2.setText(text2);
                }
            }
        });
    }
}