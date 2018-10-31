import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class TratarJSON {
	public static ClimaOpenweather devolverClima(String json)  {
		// TODO Auto-generated method stub
		//Lee el fichero y lo parsea
		ClimaOpenweather c=null;
		try {
			
			JSONParser parseajson=new JSONParser();
			JSONObject objeto_json=(JSONObject)parseajson.parse(json);
			JSONObject objeto_main=(JSONObject)objeto_json.get("main");
			double t_min=(double)objeto_main.get("temp_min");
			double t_max=(double)objeto_main.get("temp_max");
			JSONObject objeto_sys=(JSONObject)objeto_json.get("sys");
			long sunrise=(long)objeto_sys.get("sunrise");
			long sunset=(long)objeto_sys.get("sunset");
			c=new ClimaOpenweather(t_min, t_max, sunrise, sunset);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return c;
	}
}
