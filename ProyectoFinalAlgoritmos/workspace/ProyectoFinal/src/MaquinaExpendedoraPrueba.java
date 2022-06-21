/*
 * Rodrigo
 * Nov 2018
 * MáquinaExpendedoraPrueba
 */
public class MaquinaExpendedoraPrueba {
	public static void main(String[] args) {
		
		MaquinaExpendedora maquinita= new MaquinaExpendedora(1,"Pasillo de ideas","BIMBO");
		Mercancia prod= new Mercancia("Carlos V","Nestle","Chocolate","10/JUN/22", 8);
		Mercancia prod2= new Mercancia("Tin larin","Nestle","Chocolate","10/JUN/22", 150);
		Mercancia prod3= new Mercancia("Turin","Nestle","Chocolate","10/JUN/22", 8);
		Mercancia prod4= new Mercancia("Conejo","Nestle","Chocolate","10/JUN/22", 900);
		Mercancia prod5= new Mercancia("Rocaleta","Nestle","Chocolate","10/JUN/22", 8);
		Mercancia prod6= new Mercancia("Skittle","Nestle","Chocolate","10/JUN/22", 150);
		Mercancia prod7= new Mercancia("PicaFresa","Nestle","Chocolate","10/JUN/22", 8);
		Mercancia prod8= new Mercancia("Rollito","Nestle","Chocolate","10/JUN/22", 900);
		
		prod.altaNutrimento("Azúcares", 10);
		
		maquinita.altaProducto(prod, 0, 0);
		maquinita.altaProducto(prod2, 0, 1);
		maquinita.altaProducto(prod3, 1, 0);
		maquinita.altaProducto(prod4, 1, 1);
		maquinita.altaProducto(prod5, 2, 0);
		maquinita.altaProducto(prod6, 2, 1);
		maquinita.altaProducto(prod7, 3, 0);
		maquinita.altaProducto(prod8, 3, 1);
		
		
		System.out.println(maquinita.toString());
		System.out.println(maquinita.getProdMasCaro());
		System.out.println(maquinita.ventaProducto("Conejo"));
		System.out.println(maquinita.toString());
		System.out.println(maquinita.existeProducto("Tin larin"));
		System.out.println("El 0,0 es: "+maquinita.getInfoProd(0, 0));
	}

}
