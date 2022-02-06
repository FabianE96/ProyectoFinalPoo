package interfaces;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener{

	private JTextField jtusuario;
	private JPasswordField jpcontrasena;
	private JLabel lblusuario,lblcontrasena,lblbienvenido;
	private JButton botoningresar;
	String textoU="",textoC="";
	
	public Login() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Intituci�n Educativa");
		getContentPane().setBackground(new Color(224,224,224));
		
		lblbienvenido = new JLabel("Bienvenido");
		lblbienvenido.setBounds(125,10,150,30);
		lblbienvenido.setFont(new Font("Andale Mono", 3, 18));
		lblbienvenido.setForeground(new Color(0,0,0));
		add(lblbienvenido);
		
		lblusuario = new JLabel("Usuario: ");
		lblusuario.setBounds(40,60,100,30);
		lblusuario.setFont(new Font("Andale Mono", 0, 12));
		lblusuario.setForeground(new Color(0,0,0));
		add(lblusuario);
		
		lblcontrasena = new JLabel("Contrase�a: ");
		lblcontrasena.setBounds(40,90,100,30);
		lblcontrasena.setFont(new Font("Andale Mono", 0, 12));
		lblcontrasena.setForeground(new Color(0,0,0));
		add(lblcontrasena);
		
		jtusuario = new JTextField();
		jtusuario.setBounds(120,67,150,20);
		add(jtusuario);
		
		jpcontrasena = new JPasswordField();
		jpcontrasena.setBounds(120,97,150,20);
		add(jpcontrasena);
		
		botoningresar = new JButton("Ingresar");
		botoningresar.setBounds(125,160,100,30);
		//botoningresar.setBackground(new Color(255,255,255));
		botoningresar.setFont(new Font("Andale Mono", 1, 12));
		//botoningresar.setForeground(new Color(255,0,0));
		botoningresar.addActionListener(this);
		add(botoningresar);
		
		
		
	}
	
	public void ventana() {
		Login formulario1 = new Login();
		formulario1.setBounds(0,0,350,250);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == botoningresar) {
			textoU = jtusuario.getText().trim();
			textoC = jpcontrasena.getText().trim();
			
			if(textoU.equals("") || textoC.equals("")){
		    	JOptionPane.showMessageDialog(null, "Debes ingresar tu Usuario y Contrase�a.");
		    }else {
		    	
		    }
		}
	}
	
}
