package com.pragma.poweup.messengermicroservice.domain.api;

public interface ISmsServicePort {
    void sendSms(String messageJson);
}
