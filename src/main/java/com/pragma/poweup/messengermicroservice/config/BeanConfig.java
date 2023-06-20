package com.pragma.poweup.messengermicroservice.config;

import com.pragma.poweup.messengermicroservice.adapters.driver.tulio.adapter.SmsTulioAdapter;
import com.pragma.poweup.messengermicroservice.domain.api.ISmsServicePort;
import com.pragma.poweup.messengermicroservice.domain.spi.ISmsPersistencePort;
import com.pragma.poweup.messengermicroservice.domain.usecase.SmsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {
    @Bean
    public ISmsPersistencePort smsPersistencePort(){
        return new SmsTulioAdapter();
    }

    @Bean
    public ISmsServicePort smsServicePort(){
        return new SmsUseCase(smsPersistencePort());
    }
}
