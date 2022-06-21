import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * Rodrigo
 * Nov 2018
 * MáquinaExpendedoraControlador
 */
public class maquinaExpendedoraControlador extends maquinaExpendedoraVista{
	
	public void lecturaInicial() {
		String nom,marca,tipo,fechaCad,esp;
		double precio;
		boolean res;
		int estante,col;
		File archivoEntrada = new File("Datos.txt");
		Mercancia prod;
		
		try (Scanner lec=new Scanner(archivoEntrada)){
			while(lec.hasNext()) {
				nom=lec.nextLine();
				marca= lec.nextLine();
				tipo= lec.nextLine();
				fechaCad= lec.nextLine();
				precio= lec.nextDouble();
				estante=lec.nextInt();
				col= lec.nextInt();
				esp=lec.next();
				
				prod= new Mercancia(nom,marca,tipo,fechaCad,precio);
				res= maquinita.altaProducto(prod, estante, col);
				if(res) {
					consola.setText("El producto ha sido ingresado a la máquina exitosamente");
				}
				else
					consola.setText("Ha ocurrido un error, por favor vuelva a intentarlo");
				
			}
			consola.setText(maquinita.toString());
			lec.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("MUY MAL" +fnfe);
			System.exit(-1);
		}
		
	}
	public class EscuchadorOn implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			miPanel.setVisible(false);
			
		}
	}
	public class EscuchadorAlta implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			altaControlador alta= new altaControlador("Alta");
			
		}
	}
	public class EscuchadorCancela implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText("");
			
		}
	}
	public class EscuchadorStr implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.toString());
			
		}
	}
	public class Escuchadorbt1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(0, 0));
			
		}
	}
	public class Escuchadorbt2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(0, 1));
			
		}
	}
	public class Escuchadorbt3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(1, 0));
			
		}
	}
	public class Escuchadorbt4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(1, 1));
			
		}
	}
	public class Escuchadorbt5 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(2, 0));
			
		}
	}
	public class Escuchadorbt6 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(2, 1));
			
		}
	}
	public class Escuchadorbt7 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(3, 0));
			
		}
	}
	public class Escuchadorbt8 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			consola.setText(maquinita.getInfoProd(3, 1));
			
		}
	}
	public class EscuchadorVenta implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String x;
			
			x= tfnombre.getText();
			consola.setText(maquinita.ventaProducto(x));
			
		}
	}
	public class EscuchadorCaro implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				consola.setText(maquinita.getProdMasCaro());
			}catch(Exception ex) {
				consola.setText("La máquina debe estar llena");
			}
		}
	}
	public class EscuchadorBusc implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String nomProd;
			boolean res;
			
			nomProd= tfnombre.getText();
			res=maquinita.existeProducto(nomProd);
			if(res)
				consola.setText("Producto en inventario");
			else
				consola.setText("Producto inexistente o fuera de inventario");
			
		}
	}
	
	public maquinaExpendedoraControlador(String nombre) {
		super(nombre);
		
		maquinita= new MaquinaExpendedora(1,"Pasillo ideas","DulcesRodrigo");
		lecturaInicial();
		//Escuchadores
		//btingreso.addActionListener(new EscuchadorIngresa());
		btOn.addActionListener(new EscuchadorOn());
		btInfo.addActionListener(new EscuchadorStr());
		btCancela.addActionListener(new EscuchadorCancela());
		btAlta.addActionListener(new EscuchadorAlta());
		btVenta.addActionListener(new EscuchadorVenta());
		btCaro.addActionListener(new EscuchadorCaro());
		bt1.addActionListener(new Escuchadorbt1());
		bt2.addActionListener(new Escuchadorbt2());
		bt3.addActionListener(new Escuchadorbt3());
		bt4.addActionListener(new Escuchadorbt4());
		bt5.addActionListener(new Escuchadorbt5());
		bt6.addActionListener(new Escuchadorbt6());
		bt7.addActionListener(new Escuchadorbt7());
		bt8.addActionListener(new Escuchadorbt8());
		btBusc.addActionListener(new EscuchadorBusc());
		
		
	}
	/*
	 * Rodrigo
	 * Nov 2018
	 * MáquinaExpendedoraEjecutable
	 */
	
	public static void main(String[] args) {
		
		maquinaExpendedoraControlador miVista;	
		miVista= new maquinaExpendedoraControlador("Maquinita");
		miVista.pack();
		
		}
		
}