package co.com.bancolombia.bancolombiaservice;

import co.com.bancolombia.model.person.VideoJuegos;
import co.com.bancolombia.model.person.gateways.VideoJuegosService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ApiService implements VideoJuegosService {

    @Override
    public Mono<VideoJuegos> getVideojuego(String id) {
        return Mono.just(VideoJuegos.builder().id(id).nombre("Mario Bros").descripcion("Juego de destreza").modalidad("Individual").build());
    }

    @Override
    public Mono<String> getNombre(String id) {
        return Mono.just("Mario Bros");
    }

    @Override
    public Mono<String> getDescripcion(String id) {
        return Mono.just("Juego de destreza");
    }

    @Override
    public Mono<String> getModalidad(String id) {
        return Mono.just("Individual");
    }
}
