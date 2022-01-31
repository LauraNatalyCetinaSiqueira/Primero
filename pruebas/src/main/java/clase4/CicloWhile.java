package clase4;

public class CicloWhile {

	public static void main(String[] args) {
		
		short[] edades = new short [] {10,5,25};
		
		int i = 0;
		
		
		while(i < edades.length){
			System.out.println("pos:" + i + ",val:" + edades [i]);
			i++;
		}
		
		
		i = edades.length-1 ;
		
		while (i>=0){
			System.out.println("pos:" + i + ",val:" + edades [i]);
			i--;
		}
	}

}
