/* Rodrigo
 * Nov 2018
 * MercanciaMáquinaExpendedora
 */
public class Mercancia implements Comparable <Mercancia>{
	
	private String nombre;
	private String marca;
	private String tipo;
	private String fechaCad;
	private double precio;
	private String [] nutrimento;
	private Double [] contenidoNutrimental;
	private int numNutrimentos;
	private final int VALORES=5;
	
	//ConstructorCachirul
	public Mercancia(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructor nulo 
	public Mercancia() {
		contenidoNutrimental= new Double[VALORES];
		nutrimento= new String [VALORES];
		for(int i=0;i<VALORES;i++) {
			contenidoNutrimental[i]=0.0;
			nutrimento[i]=null;
		}
		numNutrimentos=0;
	}


	public Mercancia(String nombre, String marca, String tipo, String fechaCad, double precio) {
		this();
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.fechaCad = fechaCad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}
	

	public int getNumNutrimentos() {
		return numNutrimentos;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getFechaCad() {
		return fechaCad;
	}
	//Se obtiene el nombre del primer nutrimento que encuentre con el atributo dado
	public String getNomNutrimento(double contenidoNutri) {
		String res= "No hay un nutrimento con ese contenido";
		int indice=-1;
		
		if(contenidoNutri>=0)
			indice=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(contenidoNutrimental, numNutrimentos, contenidoNutri);
		if(indice!=-1)
			res=nutrimento[indice].toString();
		return res;
	}
	//Regresa el valor del nutrimento dado, si regresa un negativo no lo encontró
	public double getValorNutrimento(String nomNutrimento) {
		double res=-1;
		int indice=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(nutrimento, numNutrimentos, nomNutrimento);
		
		if(indice!=-1)
			res=contenidoNutrimental[indice];
			
		return res;
	}
	//Se introducen los nutrimentos a la mercancía
	public boolean altaNutrimento(String nomNutrimento, double contenidoNutri) {
		boolean res= false;
		
		if(numNutrimentos<VALORES) {
			nutrimento[numNutrimentos]=nomNutrimento;
			contenidoNutrimental[numNutrimentos]=contenidoNutri;
			numNutrimentos++;
			res=true;
		}
		return res;
	}
	// Programación mínima requerida
	public int compareTo(Mercancia otra) {
		int res=-1;
		
		if(this.precio==otra.precio)
			res=0;
		else
			if(this.precio>otra.precio)
				res=1;
		
		return res;
	}
	
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("\n\tNombre del producto: "+nombre);
		res.append("\n\tMarca: "+marca);
		res.append("\n\tTipo: "+tipo);
		res.append("\n\tCaduca el: "+fechaCad);
		res.append("\n\tCosto: $ "+precio);
		
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
		Mercancia other = (Mercancia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	}

	
