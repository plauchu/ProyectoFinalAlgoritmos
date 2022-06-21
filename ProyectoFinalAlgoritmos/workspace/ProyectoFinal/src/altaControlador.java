import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * Rodrigo
 * Nov 2018
 * AltaControlador
 */
public class altaControlador extends altaVista {
	
	public altaControlador(String nombre) {
		super(nombre);
		
		btEnviar.addActionListener(new Escuchador());	
	}

	public class Escuchador implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean alta;
			Mercancia prod;
			String nom, marca, tipo, fechaCad,dinero,ren,col;
			double precio;
			int coordA,coordB;
			
			nom=tfnombre.getText();
			marca=tfmarca.getText();
			tipo=tftipo.getText();
			fechaCad=tfFechaCad.getText();
			dinero=tfprecio.getText();
			ren=tfcoordA.getText();	
			col=tfcoordB.getText();
			
			precio=Double.parseDouble(dinero);
			coordA=Integer.parseInt(ren);
			coordB=Integer.parseInt(col);
			
			prod= new Mercancia(nom, marca, tipo, fechaCad, precio);
			alta=maquinita.altaProducto(prod, coordA, coordB);
			
			if(!alta)
				res.setText("Alta exitosa");
			else
				res.setText("Hubo un error, inténtelo de nuevo");
				
			
		}
	}
	
		public static void main(String[] args) {
		
		altaControlador miVista;	
		miVista= new altaControlador("Alta");
		miVista.pack();
		
	}

}


