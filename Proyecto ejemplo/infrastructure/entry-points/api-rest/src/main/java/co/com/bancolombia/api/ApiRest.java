package co.com.bancolombia.api;
import co.com.bancolombia.model.person.VideoJuegos;
import co.com.bancolombia.usecase.person.VideoJuegosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final VideoJuegosUseCase useCase;


    @GetMapping(path = "/listarvideoJuegos/{id}")
    public Mono<VideoJuegos> getVideoJuegos(@PathVariable String id) {
       return useCase.getVideoJuegos(id);

    }

    @PostMapping(path = "/crearVideoJuego")
    public String postCrearVideojuego(@RequestBody VideoJuegos videoJuegos) {
        return videoJuegos.toString();

    }

}
