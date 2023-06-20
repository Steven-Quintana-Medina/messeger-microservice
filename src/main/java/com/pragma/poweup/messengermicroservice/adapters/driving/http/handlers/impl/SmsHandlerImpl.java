package com.pragma.poweup.messengermicroservice.adapters.driving.http.handlers.impl;

import com.pragma.poweup.messengermicroservice.adapters.driving.http.handlers.ISmsHandler;
import com.pragma.poweup.messengermicroservice.domain.api.ISmsServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsHandlerImpl implements ISmsHandler {
    private final ISmsServicePort smsServicePort;

    @Override
    public void sendSms(String messageJson) {
        smsServicePort.sendSms(messageJson);
    }
}
