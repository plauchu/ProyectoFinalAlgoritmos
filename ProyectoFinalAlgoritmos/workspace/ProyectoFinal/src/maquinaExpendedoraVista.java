import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Rodrigo
 * Nov 2018
 * MáquinaExpendedoraVista
 */
public class maquinaExpendedoraVista extends JFrame{
	
	protected static MaquinaExpendedora maquinita;
	protected JPanel miPanel;
	protected Border miBorde;
	protected JButton bt1, bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btCancela,btInfo,btVenta,btAlta,btCaro,btBusc,btOn;
	protected JTextField tfnombre;
	protected JLabel espacio1,espacio2,espacio3,espacio4,nom;
	protected JTextArea consola;
	protected JScrollPane scroll;
	
	public maquinaExpendedoraVista() {
		
	}
	
	public maquinaExpendedoraVista(String nombre) {
		super(nombre);
		
		miPanel= new JPanel();
		miPanel.setLayout(new GridLayout(10,7)); //filas columnas cuadricula 
		miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);  
		miPanel.setBorder(miBorde);
		miPanel.setBackground(Color.DARK_GRAY);
		
		btOn= new JButton ();
		btOn.setIcon(new ImageIcon("ON.png"));
		btOn.setBorderPainted(false);
		miPanel.add(btOn);
		
		btInfo= new JButton ();
		miPanel.add(btInfo);
		btInfo.setIcon(new ImageIcon("Info.png"));
		btInfo.setBorderPainted(false);
		
		
		bt1= new JButton();
		bt1.setIcon(new ImageIcon("carlosv2.jpg"));
		bt1.setBorderPainted(false);
		miPanel.add(bt1);
		
		bt2= new JButton();
		bt2.setIcon(new ImageIcon("cho.jpg"));
		bt2.setBorderPainted(false);
		miPanel.add(bt2);
		
		bt3= new JButton();
		bt3.setIcon(new ImageIcon("Boing.png"));
		bt3.setBorderPainted(false);
		miPanel.add(bt3);
		
		bt4= new JButton();
		bt4.setIcon(new ImageIcon("dedo.jpg"));
		bt4.setBorderPainted(false);
		miPanel.add(bt4);
		
		bt5= new JButton();
		bt5.setIcon(new ImageIcon("bubu.png"));
		bt5.setBorderPainted(false);
		miPanel.add(bt5);
		
		bt6= new JButton();
		bt6.setIcon(new ImageIcon("luca.jpeg"));
		bt6.setBorderPainted(false);
		miPanel.add(bt6);
		
		bt7= new JButton();
		bt7.setIcon(new ImageIcon("sab.jpg"));
		bt7.setBorderPainted(false);
		miPanel.add(bt7);
		
		bt8= new JButton();
		miPanel.add(bt8);
		bt8.setIcon(new ImageIcon("tin.jpg"));
		bt8.setBorderPainted(false);
		
		btCancela= new JButton();
		btCancela.setIcon(new ImageIcon("cancelado.jpg"));
		btCancela.setBorderPainted(false);
		miPanel.add(btCancela);
		
		btVenta= new JButton();
		btVenta.setIcon(new ImageIcon("carro.jpeg"));
		btVenta.setBorderPainted(false);
		miPanel.add(btVenta);
		
		btAlta= new JButton();
		btAlta.setIcon(new ImageIcon("flecha.png"));
		btAlta.setBorderPainted(false);
		miPanel.add(btAlta);
		
		btCaro= new JButton();
		btCaro.setIcon(new ImageIcon("peso.png"));
		btCaro.setBorderPainted(false);
		miPanel.add(btCaro);
		
		btBusc= new JButton();
		btBusc.setIcon(new ImageIcon("lupa.jpg"));
		btBusc.setBorderPainted(false);
		miPanel.add(btBusc);
		
		consola= new JTextArea();
		consola.setBounds(20, 20, 400, 400);
		miPanel.add(consola);
		consola.setEditable(true);
		consola.setText("");
		
		scroll= new JScrollPane(consola,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		miPanel.add(scroll);
		
		nom=new JLabel("Nombre");
		miPanel.add(nom);
		nom.setForeground(Color.BLACK);
		tfnombre=new JTextField();
		miPanel.add(tfnombre);

		
		this.add(miPanel);
		
		this.setBounds(50, 50, 890, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	/*
	public static void main(String[] args) {
		maquinaExpendedoraVista maquinita= new maquinaExpendedoraVista("Maquinita");
	}
	*/

}
