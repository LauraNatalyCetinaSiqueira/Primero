package torreDeControl;


public class MainVoladores {

	public static void main(String[] args) {
		
		Avion a = new Avion ("Volador1", "blanco", 2010, "Comercial", 105);
		Helicoptero h = new Helicoptero ("Volador 2", "Verde", 2000, 1);
		Superman s = new Superman ("Volador 3", "Rojo", 1990);
		Ovni o = new Ovni ("Volador 4" , "Transparente" , 600);
		
		
		Voladores [] volar = new Voladores [] {a,h,s,o};
		
		for (Voladores v : volar) {
			if ( v instanceof Aterrizable) {
				
				Aterrizable aterriza = (Aterrizable)v;
				aterriza.aterrizar();
				
			}else {
				
				System.out.println(v + "_ No puede aterrizar, no cumple contrato");
			}
		}
		

	}

}
