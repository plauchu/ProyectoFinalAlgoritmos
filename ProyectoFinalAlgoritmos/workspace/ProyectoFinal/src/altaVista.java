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
 * AltaVista
 */
public class altaVista extends maquinaExpendedoraVista{
	
	protected JPanel miPanel;
	protected Border miBorde;
	protected JLabel nom,marca,tipo,fechaCad, precio,coordA,coordB;
	protected JTextField tfnombre,tfmarca,tftipo,tfFechaCad,tfprecio,tfcoordA,tfcoordB,res;
	protected JButton btEnviar;

	public altaVista(String nombre) {
		
		miPanel= new JPanel();
		miPanel.setLayout(new GridLayout(9,8)); //filas columnas cuadricula 
		miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);  
		miPanel.setBorder(miBorde);
		miPanel.setBackground(Color.CYAN);
		
		nom= new JLabel("Nombre");
		miPanel.add(nom);
		tfnombre= new JTextField();
		miPanel.add(tfnombre);
		marca= new JLabel("Marca");
		miPanel.add(marca);
		tfmarca= new JTextField();
		miPanel.add(tfmarca);
		tipo= new JLabel("Tipo");
		miPanel.add(tipo);
		tftipo= new JTextField();
		miPanel.add(tftipo);
		fechaCad= new JLabel("Fecha de caducidad");
		miPanel.add(fechaCad);
		tfFechaCad= new JTextField();
		miPanel.add(tfFechaCad);
		precio= new JLabel("Precio");
		miPanel.add(precio);
		tfprecio= new JTextField();
		miPanel.add(tfprecio);
		coordA= new JLabel("Coordenada A (Estante)");
		miPanel.add(coordA);
		tfcoordA= new JTextField();
		miPanel.add(tfcoordA);
		coordB= new JLabel("Coordenada B (Columna)");
		miPanel.add(coordB);
		tfcoordB= new JTextField();
		miPanel.add(tfcoordB);
		btEnviar= new JButton("Enviar");
		miPanel.add(btEnviar);
		res= new JTextField();
		miPanel.add(res);
		
		this.add(miPanel);
		
		this.setBounds(400, 400, 890, 800);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(true);
		
	}
	/*
	public static void main(String[] args) {
		
		altaVista miVista;	
		miVista= new altaVista("Alta");
		miVista.pack();
		
	}
	*/
	

}
