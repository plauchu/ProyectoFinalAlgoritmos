/*
 * Rodrigo
 * Nov 2018
 * MáquinaExpendedora
 */
public class MaquinaExpendedora implements Comparable <MaquinaExpendedora> {
	
	private Mercancia [][] maquinaExpendedora;
	private final int ESTANTES=4;
	private final int COLUMNAS=2;
	private int numProductos;
	private int numMaquina;
	private String ubicacion;
	private String empresaVendedora;
	
	//Constructor nulo
	public MaquinaExpendedora() {
		maquinaExpendedora= new Mercancia[ESTANTES][COLUMNAS];
		for(int estante=0;estante<ESTANTES;estante++)
			for(int col=0;col<COLUMNAS;col++)
				maquinaExpendedora[estante][col]=null;
		numProductos=0;
	}

	public MaquinaExpendedora(int numMaquina, String ubicacion, String empresaVendedora) {
		this();
		this.numMaquina = numMaquina;
		this.ubicacion = ubicacion;
		this.empresaVendedora = empresaVendedora;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getEmpresaVendedora() {
		return empresaVendedora;
	}

	public void setEmpresaVendedora(String empresaVendedora) {
		this.empresaVendedora = empresaVendedora;
	}

	public int getNumProductos() {
		return numProductos;
	}

	public int getNumMaquina() {
		return numMaquina;
	}
	public String getProdMasCaro() {
		int [] res= new int [2];
	
		if(numProductos!=0)
			res=ManejadorMatricesGenerico.posMayor(maquinaExpendedora, ESTANTES, COLUMNAS);
		return maquinaExpendedora[res[0]][res[1]].getNombre();
	}
	public String getProdMasBarato() {
		int [] res= new int [2];
	
		if(numProductos!=0)
			res=ManejadorMatricesGenerico.posMenor(maquinaExpendedora, ESTANTES, COLUMNAS);
		return maquinaExpendedora[res[0]][res[1]].getNombre();
	}
	
	public String getInfoProd (int estante, int col) {
		String res = "No hay un producto con esas características";
		
		if(numProductos!=0)
			res= maquinaExpendedora[estante][col].toString();
		
		return res;
	}
	
	//Uso el constructor cachirul
	public boolean existeProducto(String nomProd) {
		boolean res=false;
		Mercancia prod= new Mercancia (nomProd);
		int indice=-1;
		int estante=0;
		
		while(indice==-1 && estante<ESTANTES){
			indice= ManejadorArreglosGenericos.busquedaSecuencialDesordenada(maquinaExpendedora[estante], COLUMNAS, prod);
			estante++;
			if(indice!=-1)
				res=true;
		}
		return res;
	}
	
	
	//Rellena la maquina expendedora
	public boolean altaProducto(Mercancia prod, int estante, int col) {
		boolean res= false;
		
		if(numProductos<ESTANTES*COLUMNAS) {
			maquinaExpendedora[estante][col]=prod;
			numProductos++;
		}
		return res;
	}
	//Elimina un producto que se interpreta como una venta
	public String ventaProducto(String nomProd) {
		boolean band=false;
		int indice,estante=0;
		Mercancia prod= new Mercancia(nomProd);
		String res="Producto inexistente o agotado, por favor seleccione otro";
		
		while(estante<ESTANTES && !band) {
			indice=ManejadorArreglosGenericos.eliminaElemDesord(maquinaExpendedora[estante], COLUMNAS, prod);
			estante++;
			if(indice!=-1) {
				band=true;
				res="Gracias por su compra, tome su producto";
				numProductos--;
			}
		}
		return res;
	}
	// Programación mínima requerida
	public int compareTo(MaquinaExpendedora otra) {
		int res=-1;
		
		if(this.numMaquina==otra.numMaquina)
			res=0;
		else
			if(this.numMaquina>otra.numMaquina)
				res=1;
		return res;
	}
	
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Máquina expendedora número: "+numMaquina);
		res.append("\nVendedora de productos: "+empresaVendedora);
		res.append("\nUbicada en: "+ubicacion);
		res.append("\nActualmente contiene: "+numProductos+" productos");
		if(numProductos>0)
		for(int i=0;i<ESTANTES;i++) {
			res.append("\n");
			res.append("\t");
			for(int j=0;j<COLUMNAS;j++)
				if(maquinaExpendedora[i][j]!=null)
					res.append("\tProducto: "+maquinaExpendedora[i][j].getNombre());
		}
		return res.toString();
	}
	//equals generado 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaquinaExpendedora other = (MaquinaExpendedora) obj;
		if (numMaquina != other.numMaquina)
			return false;
		return true;
	}
	
	
	

}
