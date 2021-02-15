import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu opc,color,calcular,acerca;
    private JMenuItem nuevo,salir,rojo,morado,negro, vacaciones,creador;
    private JLabel logo,bienvenido,datos,labelNombre,labelAPaterno,labelAMaterno,
    labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox comboDepartamento,comboAntiguedad;
    private JScrollPane scrollpane1; 
    private JTextArea textarea1;
    String nombreAdministrador = "";

    public Principal(){

        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255,0,0));
        setTitle("Pantalla principal");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
	Bienvenida ventanaBienvenida = new Bienvenida();
	nombreAdministrador = ventanaBienvenida.usuario;

        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);
        
        opc = new JMenu("Opciones");
        opc.setFont(new Font("Andale Mono",1,14));
        opc.setForeground(new Color(255,255,255));
        mb.add(opc);

        calcular = new JMenu("Calcular");
        calcular.setFont(new Font("Andale Mono",1,14));
        calcular.setForeground(new Color(255,255,255));
        mb.add(calcular);

        acerca= new JMenu("Acerca de");
        acerca.setFont(new Font("Andale Mono",1,14));
        acerca.setForeground(new Color(255,255,255));
        mb.add(acerca);

        color= new JMenu("Color");
        color.setFont(new Font("Andale Mono",1,14));
        color.setForeground(new Color(255,0,0));
        opc.add(color);

        nuevo= new JMenuItem("Nuevo");
        nuevo.setFont(new Font("Andale Mono",1,14));
        nuevo.setForeground(new Color(255,0,0));
        nuevo.addActionListener(this);
        opc.add(nuevo);
        
        salir= new JMenuItem("Salir");
        salir.setFont(new Font("Andale Mono",1,14));
        salir.setForeground(new Color(255,0,0));
        salir.addActionListener(this);
        opc.add(salir);

        rojo= new JMenuItem("Rojo");
        rojo.setFont(new Font("Andale Mono",1,14));
        rojo.setForeground(new Color(255,0,0));
        rojo.addActionListener(this);
        color.add(rojo);

        morado= new JMenuItem("Morado");
        morado.setFont(new Font("Andale Mono",1,14));
        morado.setForeground(new Color(255,0,0));
        morado.addActionListener(this);
        color.add(morado);

        negro= new JMenuItem("Negro");
        negro.setFont(new Font("Andale Mono",1,14));
        negro.setForeground(new Color(255,0,0));
        negro.addActionListener(this);
        color.add(negro);

        vacaciones= new JMenuItem("Vacaciones");
        vacaciones.setFont(new Font("Andale Mono",1,14));
        vacaciones.setForeground(new Color(255,0,0));
        vacaciones.addActionListener(this);
        calcular.add(vacaciones);

        creador= new JMenuItem("Creador");
        creador.setFont(new Font("Andale Mono",1,14));
        creador.setForeground(new Color(255,0,0));
        creador.addActionListener(this);
        acerca.add(creador);

        ImageIcon image = new ImageIcon("images/logo-coca.png");
        logo = new JLabel(image);
        logo.setBounds(0,0,250,100);
        add(logo);

        bienvenido = new JLabel("Bienvenido \n" + nombreAdministrador);
        bienvenido.setBounds(280,30,300,50);
        bienvenido.setForeground(new Color(255,255,255));
        bienvenido.setFont(new Font("Andale Mono",1,33));
        add(bienvenido);

        datos = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        datos.setBounds(45,140,900,25);
        datos.setForeground(new Color(255,255,255));
        datos.setFont(new Font("Andale Mono",0,24));
        add(datos);

        labelNombre = new JLabel("Nombre de pila:");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido Paterno:");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);

         txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25,273,150,25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAPaternoTrabajador);

        labelAMaterno = new JLabel("Apellido Materno:");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25,334,150,25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);
 
        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al Cliente");
        comboDepartamento.addItem("Departamento de Logística");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o más de servicio");

        labelResultado = new JLabel("Resultado del Cálculo:");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setFont(new Font("Andale Mono", 1, 11));
        textarea1.setForeground(new Color(0, 0, 0));
        textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220,333,385,90);
        add(scrollpane1); 

        labelfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelfooter.setForeground(new java.awt.Color(255, 255, 255));
        add(labelfooter);
    }
    
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == vacaciones){

	    String nombreTrabajador = txtNombreTrabajador.getText();
	    String AP = txtAPaternoTrabajador.getText();
	    String AM = txtAMaternoTrabajador.getText();
	    String Depa = comboDepartamento.getSelectedItem().toString();
	    String Antiguedad = comboAntiguedad.getSelectedItem().toString();
	    String res = "pruebita1";

	if(nombreTrabajador.equals("")||AP.equals("")||AM.equals("")||Depa.equals("")||Antiguedad.equals("")){
		
		JOptionPane.showMessageDialog(null,"Necesita rellenar todos los espacios para continuar");
	    }
	else{ 
		
	    if(Depa.equals("Atención al Cliente")){

	    	if(Antiguedad.equals("1 año de servicio")){
			res = "6";
		}
		if(Antiguedad.equals("2 a 6 años de servicio")){
			res = "14";
		}
		if(Antiguedad.equals("7 años o más de servicio")){
			res = "20";
		}
 	    }
	    if(Depa.equals("Departamento de Logística")){

	    	if(Antiguedad.equals("1 año de servicio")){
			res = "7";
		}
		if(Antiguedad.equals("2 a 6 años de servicio")){
			res = "15";
		}
		if(Antiguedad.equals("7 años o más de servicio")){
			res = "22";
		}
	    }
	    if(Depa.equals("Departamento de Gerencia")){

	    	if(Antiguedad.equals("1 año de servicio")){
			res = "10";
		}
		if(Antiguedad.equals("2 a 6 años de servicio")){
			res = "20";
		}
		if(Antiguedad.equals("7 años o más de servicio")){
			res = "30";
		}
	    }

	    textarea1.setText(nombreTrabajador+" "+AP+" "+AM+" "+" \ntrabaja en el "+Depa+" \ncon "+Antiguedad+" \nrecibe "+res+" dias de vacaciones.");
	}
	}
        if(event.getSource() == nuevo){
	    txtNombreTrabajador.setText("");
	    txtAPaternoTrabajador.setText("");
	    txtAMaternoTrabajador.setText("");
	    comboDepartamento.setSelectedIndex(0);
	    comboAntiguedad.setSelectedIndex(0);
	    textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        }
        if(event.getSource() == salir){
            
        Bienvenida form1 =new Bienvenida();
        form1.setBounds(0,0,350,450);
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
        form1.setResizable(false);
	this.setVisible(false);
        }
        if(event.getSource() == rojo){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if(event.getSource() == morado){
            getContentPane().setBackground(new Color(106,13,173));
        }
        if(event.getSource() == negro){
            getContentPane().setBackground(new Color(0,0,0));
        }
        if(event.getSource() == creador){
            JOptionPane.showMessageDialog(null,"Jorge Rosas.");
        }
    }

    public static void main(String args[]){

        Principal form1 =new Principal();
        form1.setBounds(0,0,700,650);
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
        form1.setResizable(false);
    }
}