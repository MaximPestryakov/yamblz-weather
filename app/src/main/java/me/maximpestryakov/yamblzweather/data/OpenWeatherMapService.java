package me.maximpestryakov.yamblzweather.data;

import io.reactivex.Observable;
import me.maximpestryakov.yamblzweather.data.model.Weather;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherMapService {

    String URL = "http://api.openweathermap.org/data/2.5/";

    String APP_ID = "72c4739d285455a62f672a3a98a113ab";

    @GET("weather")
    Observable<Weather> getWeather(@Query("id") int id, @Query("units") String units, @Query("lang") String lang);
}
