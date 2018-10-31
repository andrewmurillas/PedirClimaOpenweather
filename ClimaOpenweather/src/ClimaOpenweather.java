

public class ClimaOpenweather {
private double t_min, t_max;
private long sunrise, sunset;
public ClimaOpenweather(double t_min, double t_max, long sunrise, long sunset) {
	super();
	this.t_min = t_min;
	this.t_max = t_max;
	this.sunrise = sunrise;
	this.sunset = sunset;
}
public double getT_min() {
	return t_min;
}
public double getT_max() {
	return t_max;
}
public long getSunrise() {
	return sunrise;
}
public long getSunset() {
	return sunset;
}

}
