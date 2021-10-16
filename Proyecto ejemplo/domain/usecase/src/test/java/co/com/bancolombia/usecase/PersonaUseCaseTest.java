package co.com.bancolombia.usecase;


import co.com.bancolombia.model.gateways.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PersonaUseCase.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonaUseCaseTest {

    private PersonaUseCase personaUseCaseTest;
    private Persona personaTest;

    @BeforeAll
    void llenarDatosPrueba(){
        this.personaTest = new Persona("1", "Tomas", "Jugador de Mario Bros", 5);
    }

    @Test
    void verificarNotaMenorAuno(){
        this.personaUseCaseTest = new PersonaUseCase();
        personaUseCaseTest.crearResena(personaTest.getNombrePersona(), personaTest.getComentario(), 1);
        Assertions.assertNull(personaUseCaseTest.getPersona());
    }


}
