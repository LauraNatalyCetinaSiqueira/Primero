package clase3;

import java.util.Scanner;


public class If2 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingresa la edad");
				
		//ingrese una contraseña y usuario
		// Si la contraseña = "1234" y usuario = admin=> "ok"
		// De lo contrario "fail"

		String usuario;
		String contrasenia;
		
		usuario = "jose";
		contrasenia = "12345";
		
		if(usuario == "admin" && contrasenia == "1234" ) {
			System.out.println("OK");
			
		}else {
			System.out.println("fail");
			
		}
		
		if(usuario == "admin") 
		{
			if(contrasenia == "1234") 
			{
				System.out.println("OK");
			}
		} else
		{
			System.out.println("Fail");
		}
	}

}
