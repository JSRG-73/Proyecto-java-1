import javax.swing.*; 
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Tyc extends JFrame implements ChangeListener, ActionListener{

    private JCheckBox check1;
    private JLabel label1,label2;
    private JButton boton1,boton2;
    private JScrollPane scroll1;
    private JTextArea area1;
    String nombre = "";

    public Tyc(){

        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Terminos y condiciones");
        getContentPane().setBackground(new Color(204,209,209));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
	Bienvenida ventanaBienvenida = new Bienvenida(); 
	nombre = ventanaBienvenida.usuario;
        
        label1 = new JLabel("TÉRMINOS Y CONDICIONES.");
        label1.setBounds(220,10,250,30);
        label1.setFont(new Font("Andale Mono",Font.BOLD,14));
        add(label1);

        area1 = new JTextArea();
        area1.setForeground(new Color(0,0,0));
        area1.setFont(new Font("Andale Mono",1,14));
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(10,50,650,200);
        add(scroll1);
        area1.setText("Terminos y condiciones");
        area1.setEditable(false);

        boton1 = new JButton("Acepto");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon image = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(image);
        label2.setBounds(315,140,300,300);
        add(label2);

        check1 =new JCheckBox("Yo " + nombre + " acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);
    }

    public void actionPerformed(ActionEvent event){

	if(event.getSource()==boton1){
	   Principal form1 =new Principal();
           form1.setBounds(0,0,700,650);
           form1.setLocationRelativeTo(null);
           form1.setVisible(true);
           form1.setResizable(false);
	   this.setVisible(false);
	}
	else if(event.getSource()==boton2){

	   JOptionPane.showMessageDialog(null,"No puede proceder si no acepta los términos y condiciones.");	
	}

    }

    public void stateChanged(ChangeEvent event){
	
	if(check1.isSelected()){
	   boton1.setEnabled(true);
	   boton2.setEnabled(false);
	}
	else{
	   boton1.setEnabled(false);
	   boton2.setEnabled(true);
	}
    }
    public static void main(String args[]){

        Tyc form1 =new Tyc();
        form1.setBounds(0,0,700,470);
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
        form1.setResizable(false);
    }
}
