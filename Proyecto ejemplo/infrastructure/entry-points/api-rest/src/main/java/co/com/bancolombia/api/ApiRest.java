package co.com.bancolombia.api;
import co.com.bancolombia.model.gateways.Persona;
import co.com.bancolombia.model.gateways.VideoJuegos;
import co.com.bancolombia.usecase.PersonaUseCase;
import co.com.bancolombia.usecase.VideoJuegosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final VideoJuegosUseCase useCase;
    private final PersonaUseCase personaUseCase;


    @GetMapping(path = "/listarvideoJuegos/{id}")
    public Mono<VideoJuegos> getVideoJuegos(@PathVariable String id) {
        return useCase.getVideoJuegos(id);

    }

    @PostMapping(path = "/crearVideoJuego")
    public String postCrearVideojuego(@RequestBody VideoJuegos videoJuegos) {
        return videoJuegos.toString();

    }

    @GetMapping(path = "/verResenaVideojuego")
    public String verResenaVideojuego(){
        Persona persona = new Persona("1", "Antonia Velez", "Juego de soshi", 3);
        VideoJuegos videojuegos = new VideoJuegos("1", "Antonia", "Juego de pensar", "En grupo");
        personaUseCase.crearResena("Antonia", "Jugadora de soshi", 5);
        return this.personaUseCase.getResena();
    }

}
