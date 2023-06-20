package com.pragma.poweup.messengermicroservice.domain.usecase;

import com.pragma.poweup.messengermicroservice.domain.api.ISmsServicePort;
import com.pragma.poweup.messengermicroservice.domain.spi.ISmsPersistencePort;

import static com.pragma.poweup.messengermicroservice.domain.services.SmsService.deserializableJsonSms;

public class SmsUseCase implements ISmsServicePort {
    private final ISmsPersistencePort smsPersistencePort;

    public SmsUseCase(ISmsPersistencePort smsPersistencePort) {
        this.smsPersistencePort = smsPersistencePort;
    }

    @Override
    public void sendSms(String sms) {
        smsPersistencePort.sendSms(deserializableJsonSms(sms));
    }
}
