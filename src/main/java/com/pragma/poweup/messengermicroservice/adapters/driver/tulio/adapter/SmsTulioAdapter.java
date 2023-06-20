package com.pragma.poweup.messengermicroservice.adapters.driver.tulio.adapter;

import com.pragma.poweup.messengermicroservice.domain.model.Sms;
import com.pragma.poweup.messengermicroservice.domain.spi.ISmsPersistencePort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Value;

public class SmsTulioAdapter implements ISmsPersistencePort {
    @Value("${ACCOUNT_SID}")
    private String ACCOUNT_SID;
    @Value("${AUTH_TOKEN}")
    private String AUTH_TOKEN;
    private final String MESSAGE = "your order is ready! use this pin to claim it: ";


    @Override
    public void sendSms(Sms sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new com.twilio.type.PhoneNumber(sms.getPhoneClient()),
                new com.twilio.type.PhoneNumber(sms.getPhoneSender()),
                MESSAGE+sms.getPin()).create();

    }
}
