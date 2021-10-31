package DependencyInjector;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import net.places.PlacesDescriptionRepository;
import net.weather.WeatherRepository;
import view.PlacesController;
import view.WeatherController;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(WeatherRepository.class).in(Singleton.class);
        bind(WeatherController.class).in(Singleton.class);

        bind(PlacesDescriptionRepository.class).in(Singleton.class);
        bind(PlacesController.class).in(Singleton.class);
    }
}