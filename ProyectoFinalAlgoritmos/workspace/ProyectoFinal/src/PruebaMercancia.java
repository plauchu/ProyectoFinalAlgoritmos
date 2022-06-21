/*
 * Rodrigo
 * Nov 2018
 * MercanciaMáquinaExpendedoraPrueba
 */
public class PruebaMercancia {

	public static void main(String[] args) {
		
		Mercancia dulce= new Mercancia("Carlos V","Nestle","Chocolate","10/JUN/22", 8);
		
		dulce.altaNutrimento("Sodio", 7);
		dulce.altaNutrimento("Energía", 20);
		dulce.altaNutrimento("Acidez", 2);
		dulce.altaNutrimento("Grasa", 20);
		dulce.altaNutrimento("Gramaje", 20);
		System.out.println(dulce.getNomNutrimento(20));
		System.out.println(dulce.getValorNutrimento("Sodio"));
		System.out.println(dulce.toString());

	}

}
