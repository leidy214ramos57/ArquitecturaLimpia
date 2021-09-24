package co.com.bancolombia.model.person.gateways;

import co.com.bancolombia.model.person.VideoJuegos;
import reactor.core.publisher.Mono;

public interface VideoJuegosService {

    Mono<VideoJuegos> getPerson(String id);
    Mono<String> getNombre(String id);
    Mono<String> getDescripcion(String id);


}
