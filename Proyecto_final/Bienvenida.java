import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

    private JTextField field1;
    private JLabel label1,label2,label3,label4;
    private JButton button1;
    public static String usuario;

    public Bienvenida(){

        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        field1 = new JTextField();
        field1.setBounds(45,240,255,25);
        field1.setBackground(new Color(224,224,224));
        field1.setFont(new Font("Andale Mono",1,14));
        field1.setForeground(new Color(255,0,0));
        add(field1);

        ImageIcon image = new ImageIcon("images/logo-coca.png");

        label1 = new JLabel(image);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de control vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono",3,18));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono",1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        
        label4 = new JLabel("©2021 Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1,10));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        
        button1 = new JButton("Ingresar");
        button1.setBounds(125,280,100,30);
        button1.setBackground(new Color(255,255,255));
        button1.setFont(new Font("Andale Mono",1,12));
        button1.setForeground(new Color(255,0,0));
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){

        if(event.getSource() == button1){
            
            usuario=field1.getText().trim();

	    if(usuario.equals("")){

		JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
		}
	    else{
		
		Tyc form1 =new Tyc();
                form1.setBounds(0,0,600,360);
                form1.setLocationRelativeTo(null);
                form1.setVisible(true);
       		form1.setResizable(false);
		this.setVisible(false);
		}
        }
    }

    public static void main(String args[]){

        Bienvenida form1 =new Bienvenida();
        form1.setBounds(0,0,350,450);
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
        form1.setResizable(false);

    }
}