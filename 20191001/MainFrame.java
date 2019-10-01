import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    private JButton jbtns[]=new JButton[16];
    private JLabel jlb = new JLabel("0");
    private JPanel jpn =new JPanel(new GridLayout(4,4,3,3));
    private Container cp ;
    String str[]={
        "7","8","9","/",
        "4","5","6","*",
        "1","2","3","+",
        "0","=",".","-",
    };

    public MainFrame(){
        init();
    }
    private void init(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        this.setBounds(400,100,300,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jlb.setHorizontalAlignment(JLabel.RIGHT);

        cp.add(jlb , BorderLayout.NORTH);
        cp.add(jpn , BorderLayout.CENTER);

        for(int i=0;i<16;i++){
            jbtns[i]=new JButton(str[i]);
            jpn.add(jbtns[i]);
            jbtns[i].setFont(new Font(null,Font.PLAIN,24));
        }
    }
}