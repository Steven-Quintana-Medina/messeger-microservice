package com.pragma.poweup.messengermicroservice.domain.spi;

import com.pragma.poweup.messengermicroservice.domain.model.Sms;

public interface ISmsPersistencePort {
    void sendSms(Sms sms);
}
