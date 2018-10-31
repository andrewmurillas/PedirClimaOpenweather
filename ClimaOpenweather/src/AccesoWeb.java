import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AccesoWeb {

	public static String pedirCiudad(String nombre_ciudad) {
		// TODO Auto-generated method stub
		
				String url_txt="http://api.openweathermap.org/data/2.5/weather?q="+nombre_ciudad+"&appid=57703a7a9ab7b873a99116a3ea379748";
				String aux="";
				try {
					URL direccion=new URL(url_txt);
					URLConnection conexion_web = direccion.openConnection();
			        BufferedReader br = new BufferedReader(new InputStreamReader(conexion_web.getInputStream()));
			        String linea=br.readLine();
			        while(linea!=null)
			        {
			        	
			        	aux+=linea;
			        	linea=br.readLine();
			        }
			        br.close();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//"http://www.aemet.es/xml/municipios/localidad_01011.xml"
				return aux;

}
}
