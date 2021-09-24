package co.com.bancolombia.config;


import co.com.bancolombia.model.person.gateways.VideoJuegosService;
import co.com.bancolombia.usecase.person.VideoJuegosUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCasesConfig {

        @Bean
        public VideoJuegosUseCase getVideoJuegosUseCase(VideoJuegosService serviceGateway){
                return new VideoJuegosUseCase(serviceGateway);
        }
}
