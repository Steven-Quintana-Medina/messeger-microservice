package com.pragma.poweup.messengermicroservice.domain.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pragma.poweup.messengermicroservice.domain.model.Sms;

public class SmsService {
    public static Sms deserializableJsonSms(String messageJson){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(messageJson,Sms.class);
        } catch (JsonProcessingException e) {
            System.err.println("Error al serializar el objeto JSON: " + e.getMessage());
            return null;
        }
    }
}
