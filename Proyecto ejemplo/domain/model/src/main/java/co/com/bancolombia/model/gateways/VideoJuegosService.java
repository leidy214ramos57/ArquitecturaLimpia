package co.com.bancolombia.model.gateways;

import co.com.bancolombia.model.gateways.VideoJuegos;
import reactor.core.publisher.Mono;

public interface VideoJuegosService {

    Mono<VideoJuegos> getVideojuego(String id);
    Mono<String> getNombre(String id);
    Mono<String> getDescripcion(String id);
    Mono<String> getModalidad(String id);


}
