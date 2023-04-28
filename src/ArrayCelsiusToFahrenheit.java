import java.util.Arrays;
public class ArrayCelsiusToFahrenheit {
    public static void main(String[] args) {
        double[] weather = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] weatherFahrenheit = Arrays.copyOf(weather, weather.length);
        for (int i = 0; i<weatherFahrenheit.length; i++) {
            weatherFahrenheit[i] = (weather[i]/5*9)+32;
        }
        System.out.println(Arrays.toString(weatherFahrenheit));
    }
}
