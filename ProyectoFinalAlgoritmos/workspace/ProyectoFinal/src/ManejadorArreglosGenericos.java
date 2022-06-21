/* Rodrigo
 * Oct 2018
 * ManejadorArreglosGenericos
 */
import java.util.ArrayList;
public class ManejadorArreglosGenericos {
	
	public static <T extends Comparable<T>> int posMaximo(T[] a, int n) {
		int posMay=0;
		
		
		for(int i=1; i<n; i++)
			if(a[posMay].compareTo(a[i])<0) {
				posMay=i;
			}	
		return posMay;
	}
	public static <T extends Comparable <T>> int cuantosMayX(T[] a, int n, T parametro) {
		int res=0;
		
		for (int i=0; i<=n; i++)
			if(a[i].compareTo(parametro)>0)
				res++;
		return res;
	}
	public static <T extends Comparable<T>> ArrayList<Integer>cualesMayX(T[] a, int n, T parametro) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=0; i<n;i++)
			if(a[i].compareTo(parametro)>0)
				lista.add(i);
		return lista;
	}
	public static <T extends Comparable<T>> int cuantosMenX(T[] a, int n, T parametro) {
		int res=0;
		
		for (int i=0; i<=n; i++)
			if(a[i].compareTo(parametro)>0)
				res++;
		return res;
	}
	public static <T extends Comparable<T>> ArrayList<Integer>cualesMenX(T[] a, int n, T parametro) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=0; i<n;i++)
			if(a[i].compareTo(parametro)<0)
				lista.add(i);
		return lista;
	}
	public static <T>void swap(T[] a, int x, int y ) {
		T temp= a[x];
		
		a[x]=a[y];
		a[y]=temp;
	}
	public static <T> void invertir(T[] a, int n) {
		for(int i=0; i<=n/2; i++)
			swap(a,i,n-i);
	}
	public static <T> void corrimientoDer(T[] a, int n, int k) {
		for(int i=n;i>k;i--)
			a[i]=a[i-1];
	}
		
	public static <T> void corrimientoIzq(T[] a, int n, int k) {
		for(int i=k;i<(n-1);i++)
			a[i]=a[i+1];
	}
	public static <T extends Comparable<T>> int posMinimo(T[] a, int n, int inicio) {
		int posMin=inicio;
		
		for(int i=inicio+1; i<n; i++)
			if(a[posMin].compareTo(a[i])>0)
				posMin=i;
		return posMin;
	}
	public static <T extends Comparable<T>> void seleccionDirecta(T[] a, int n) {
		int posMenor;
		
		for(int i=0; i<n-1; i++) {
			posMenor=posMinimo(a,n,i);
			swap(a,i,posMenor);
		}
	}
	public static <T extends Comparable<T>>int busquedaSecuencialDesordenada(T[] a, int n, T x) {
		int pos,i=0;
		while(i<n && !a[i].equals(x))
			i++;
		if(i==n)
			pos=-1;
		else
			pos=i;
		return pos;
	}
	public static <T extends Comparable<T>>int busSecOrd(T[] a, int n, T x) {
		int i=0;
		
		while(i<n && a[i].compareTo(x)<0)
			i++;
		if(i==n|| !a[i].equals(x))
			i=-i-1;
		
		return i;
	}
	public static <T extends Comparable <T>>int busBinaria(T[] a, int n, T x) {
		int izq=0,der=n-1,centro=(izq+der)/2;
		while(izq<=der&&a[centro]!=x){
			if(x.compareTo(a[centro])>0)
				izq=centro+1;
			else
				der=centro-1;
			centro=(izq+der)/2;
		}
		if(izq>der) 
			centro=(izq+1)*-1;
		return centro;
	}
	private static <T> int inserta (T[] a, int n, int pos, T x) {
		if(n<a.length) {
			corrimientoDer(a, n, pos);
			a[pos]=x;
			n++;
		}
		return n;
	}
	public static <T extends Comparable<T>> int insertaElementoEnOrden(T[] a, int n, T x) {
		int pos;
		if(n<a.length){
			pos=busBinaria(a, n, x);
			if(pos<0){
				pos=pos*-1-1;
				corrimientoDer(a,n, pos);
				a[pos]=x;
				n++;
			}
		}
		return n;
	}
	public static <T> int insertaAlFinal(T[] a, int n, T x) {
		
		if(n<a.length){
			a[n-1]=x;
			n++;
		}
		return n;
	}
	
	public static <T extends Comparable <T>> int eliminaElemOrd(T[] a, int n, T x) {
		int pos=busSecOrd(a,n,x);
		if(pos>=0){ 
			corrimientoIzq(a,n,pos);
			n--;
		}
		return n;
	}
	public static <T extends Comparable <T>> int eliminaElemDesord(T[] a, int n, T x) {
		int pos=busquedaSecuencialDesordenada(a,n,x);
		if(pos>=0){
			a[pos]=a[n-1];
			a[n-1]=null;
			n--;
		}
		return pos;
	
	}
	
}
