package conexionssh;

import java.util.Scanner;

public class MainMenu {
	
	public void Iniciomenu(){
		int numeroOpcion = 0;
		
		System.out.println("Eliga una opcion: ");
		
		while(numeroOpcion != 5)
		{		
			System.out.println("\n\n1-Buscar Patologias por nombre");
			System.out.println("2-Buscar Sintomas por nombre");
			System.out.println("3-Listar patologias");
			System.out.println("4-Buscar patologias por sintoma");
			System.out.println("5-Salir\n");
			numeroOpcion = numeroMenu();
			try {
				menuAccion(numeroOpcion);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}

	public static void menuAccion(int numeroMenu) throws Throwable{
		switch (numeroMenu) {
		case 1:
			Conexiones.conexion(Consultas.BUSCAR_PATOLOGIAS_POR_NOMBRE);
			break;
		case 2:
			Conexiones.conexion(Consultas.BUSCAR_SINTOMAS_POR_NOMBRE);
			break;
		case 3:
			Conexiones.conexion(Consultas.LISTAR_PATOLOGIAS);
			break;
		case 4:
			Conexiones.conexion(Consultas.BUSCAR_SINTOMAS_POR_PATOLOGIA);
			break;
		default:
			System.out.println("Numero no valido");
			break;
		}
	}
	
	public static int numeroMenu(){
		int numeroDevuelto = 0;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("intoduzca un numero de menu");
			numeroDevuelto = sc.nextInt();
		
		return numeroDevuelto;
	}
}