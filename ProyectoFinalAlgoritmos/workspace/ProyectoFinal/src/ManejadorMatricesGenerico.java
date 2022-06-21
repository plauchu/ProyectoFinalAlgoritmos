/* Rodrigo
 * Nov 2018
 * ManejadorMatricesGenericos
 */
public class ManejadorMatricesGenerico {
	
	public static <T extends Comparable<T>> int mayRen(T [][] arr, int ren, int n) {
		int maxIndex=0;
		T may=arr[ren][0];
		
		for(int i=1; i<n;i++) {
			if(arr[ren][i].compareTo(may)>0){
				may=arr[ren][i];
				maxIndex = i;
			}	
		}
		
		return maxIndex;
	}
	public static <T extends Comparable<T>> int mayCol(T [][] arr, int col, int n) {
		int maxIndex = 0;
		T may=arr[0][col];
		
		for(int i=1; i<n;i++) {
			if(arr[i][col].compareTo(may)>0) {
				may=arr[i][col];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	public static <T extends Comparable<T>> int minRen(T [][] arr, int ren, int n) {
		int minIndex = 0;
		T min=arr[ren][0];
		
		for(int i=1; i<n;i++) {
			if(arr[ren][i].compareTo(min)<0) {
				min=arr[ren][i];
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	public static <T extends Comparable<T>> int minCol(T [][] arr, int col, int n) {
		int minIndex = 0;
		T min=arr[0][col];
		
		for(int i=1; i<n;i++) {
			if(arr[i][col].compareTo(min)<0) {
				min=arr[i][col];
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	
	public static <T extends Comparable<T>> int [] posMenor(T [][] arr, int m, int n) {
		int [] res= new int[2];
		T men= arr[0][0];
		
		for(int i=1; i<m;i++)
			for(int j=1;j<n;j++)
				if(arr[i][j].compareTo(men)<0) {
					men=arr[i][j];
					res[0]=i;
					res[1]=j;
				}
		return res;
	}
	public static <T extends Comparable<T>> int [] posMayor(T [][] arr, int m, int n) {
		int [] res= new int [2];
		T may= arr[0][0];
		
		for(int i=0; i<m;i++)
			for(int j=0;j<n;j++)
				if(arr[i][j].compareTo(may)>0) {
					may=arr[i][j];
					res[0]=i;
					res[1]=j;
				}
		return res;
	}
	public static <T extends Comparable<T>> boolean esSimetrica(T[][] arr, int n) {
		boolean res=true;
		
		for(int i=1;i<n;i++)
			for(int j=0;j<n;j++) {
				if(arr[i][j].compareTo(arr[j][i])<0)						
					res=false;
			}
		return res;		
		
	}
	
	public static <T> T[][] traspuesta(T [][] arr, int m, int n) {
		T res[][] = (T[][]) new Object[n][m];
		
		for(int i=0;i<m;i++)
			for(int j=0; j<n; j++) {
				res[j][i]=arr[i][j];
				
		}
		
		return res;
	}

}
