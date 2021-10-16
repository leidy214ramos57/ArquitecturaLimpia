package co.com.bancolombia.usecase;

import co.com.bancolombia.model.gateways.Persona;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaUseCase {

    private Persona persona;

    public void crearResena(String nombre, String comentario, Integer nota){
      if(validarNota(nota)){
          this.persona = new Persona("1",nombre, comentario, nota);
      }
    }

    @Deprecated
    public String getResena(){
        return "Estos es la reseña de la jugadora"+ this.getPersona();
    }

    private Boolean validarNota(Integer nota){
        return  nota >= 1 && nota <= 5;
    }
}
