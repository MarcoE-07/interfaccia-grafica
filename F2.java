import javax.swing.*;
import java.awt.*;

public class F2 extends JFrame{
        JPanel p1;
        JPanel p2;
        JPanel p3;
        JPanel p4;
        JTextField tf1;
        JTextField tf2;
        JLabel l1;
        JLabel l2;
        JButton b1;
    public F2 (String titolo){
        super(titolo);
        //Istanzio i widgets
        p1 = new JPanel(new GridLayout(2,0));
        p2 = new JPanel(new GridLayout(2,0));
        p3 = new JPanel(new BorderLayout());
        p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        tf1 = new JTextField();
        tf2 = new JTextField();
        l1 = new JLabel("Lire");
        l2 = new JLabel("Euro");
        b1 = new JButton("Converti");
        //Posizionamento
        add(p3,BorderLayout.NORTH);
        p1.add(l1);
        p1.add(l2);
        p3.add(p1, BorderLayout.WEST);
        p2.add(tf1);
        p2.add(tf2);
        p3.add(p2, BorderLayout.CENTER);
        add(p3,BorderLayout.NORTH);
        p4.add(b1);
        add(p4, BorderLayout.SOUTH);
        //Registrazione Listener
        //Operazioni finali
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}







