package cat.ohmushi.katasg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cat.ohmushi.katasg.application.ports.in.RegisterAccountUseCase;
import cat.ohmushi.katasg.application.services.AccountService;

@Configuration
public class AppConfiguration {
    @Bean
    RegisterAccountUseCase registerAccountUseCase() {
        return new AccountService();
    }
}
