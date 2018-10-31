import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {

	public static int mostrarMenu(ArrayList<Ciudad> lista_ciudades) {
		Scanner sc=new Scanner(System.in);
		for (Ciudad ciudad : lista_ciudades) {
			System.out.println(ciudad.getOpcion()+"-"+ciudad.getNombre());
		}
		int opcion=sc.nextInt();sc.nextLine();
		return opcion;
	}

}
