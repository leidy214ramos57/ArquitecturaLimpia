package co.com.bancolombia.model.gateways;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Persona {

    private String idPersona;
    private String nombrePersona;
    private String comentario;
    private Integer nota;



}
