package interfaces;

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;

public class Estudiante extends JFrame implements ActionListener{

	private JLabel jestudiante, jlabel1, jlabel2, jmateria1, jmateria2, jmateria3, jmateria4, jnota1, jnota2, jnota3, jnota4, jlabel3, jpromedio;
	private JTable tabla;
	private JButton bcerrar;
	String nombre = "";
	float promedio;
	
	public Estudiante() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Estudiante");
		getContentPane().setBackground(new Color(225,224,224));
		Login ventanaLogin = new Login();
		nombre = ventanaLogin.textoU;
		
		jestudiante = new JLabel("FABIAN EDUARDO GUEVARA MUELAS");
		jestudiante.setBounds(70,10,400,30);
		jestudiante.setFont(new Font("Andale Mono", 3, 18));
		jestudiante.setForeground(new Color(0, 0, 0));
		add(jestudiante);
		
		jlabel1 = new JLabel("MATERIAS");
		jlabel1.setBounds(30,80,100,30);
		jlabel1.setFont(new Font("Andale Mono", 1, 12));
		add(jlabel1);
		
		jlabel2 = new JLabel("NOTA FINAL");
		jlabel2.setBounds(150,80,100,30);
		jlabel2.setFont(new Font("Andale Mono", 1, 12));
		add(jlabel2);
		
		jlabel3 = new JLabel("PROMEDIO FINAL");
		jlabel3.setBounds(300,80,100,30);
		jlabel3.setFont(new Font("Andale Mono", 1, 12));
		add(jlabel3);
		
		jmateria1 = new JLabel("materia1");
		jmateria1.setBounds(30,120,100,30);
		jmateria1.setFont(new Font("Andale Mono", 0, 12));
		add(jmateria1);
		
		jmateria2 = new JLabel("materia2");
		jmateria2.setBounds(30,150,100,30);
		jmateria2.setFont(new Font("Andale Mono", 0, 12));
		add(jmateria2);
		
		jmateria3 = new JLabel("materia3");
		jmateria3.setBounds(30,180,100,30);
		jmateria3.setFont(new Font("Andale Mono", 0, 12));
		add(jmateria3);
		
		jmateria4 = new JLabel("materia4");
		jmateria4.setBounds(30,210,100,30);
		jmateria4.setFont(new Font("Andale Mono", 0, 12));
		add(jmateria4);
		
		jnota1 = new JLabel("3");
		jnota1.setBounds(150,120,100,30);
		jnota1.setFont(new Font("Andale Mono", 0, 12));
		add(jnota1);
		
		jnota2 = new JLabel("4");
		jnota2.setBounds(150,150,100,30);
		jnota2.setFont(new Font("Andale Mono", 0, 12));
		add(jnota2);
		
		jnota3 = new JLabel("1.5");
		jnota3.setBounds(150,180,100,30);
		jnota3.setFont(new Font("Andale Mono", 0, 12));
		add(jnota3);
		
		jnota4 = new JLabel("2");
		jnota4.setBounds(150,210,100,30);
		jnota4.setFont(new Font("Andale Mono", 0, 12));
		add(jnota4);
		
		promedio = ((Float.parseFloat(jnota1.getText()))+(Float.parseFloat(jnota2.getText()))+(Float.parseFloat(jnota3.getText()))+(Float.parseFloat(jnota4.getText())))/4;
		DecimalFormat df = new DecimalFormat("#.0");
		String promedio1 = df.format(promedio);
		
		jpromedio = new JLabel(""+promedio1);
		jpromedio.setBounds(330,150,100,30);
		jpromedio.setFont(new Font("Andale Mono", 3, 24));
		add(jpromedio);
		
		tabla = new javax.swing.JTable();
		tabla.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Title 1", "Title 2", "Title 3", "Title 4"
	            }
	        ));
		
		
		
	}
	public void ventana () {
		Estudiante formulario1 = new Estudiante();
		formulario1.setBounds(0,0,500,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
