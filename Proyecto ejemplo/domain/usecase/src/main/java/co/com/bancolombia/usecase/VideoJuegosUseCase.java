package co.com.bancolombia.usecase;

import co.com.bancolombia.model.gateways.VideoJuegos;
import co.com.bancolombia.model.gateways.VideoJuegosService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class VideoJuegosUseCase {

    private final VideoJuegosService serviceGateway;

    public Mono<VideoJuegos> getVideoJuegos(String id) {
        return serviceGateway.getVideojuego(id);
    }

    public Mono<String> getNombre(String id) {
        return serviceGateway.getNombre(id);
    }

    public Mono<String> getDescripcion(String id) {
        return serviceGateway.getDescripcion(id);
    }

    public Mono<String> getModalidad(String id) {
        return serviceGateway.getModalidad(id);
    }

}
