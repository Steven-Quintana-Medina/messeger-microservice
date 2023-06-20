package com.pragma.poweup.messengermicroservice.domain.model;

public class Sms {
    private String phoneClient;
    private String phoneSender;
    private String pin;

    public Sms() {
    }

    public Sms(String phoneClient, String phoneSender, String pin) {
        this.phoneClient = phoneClient;
        this.phoneSender = phoneSender;
        this.pin = pin;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

    public String getPhoneSender() {
        return phoneSender;
    }

    public void setPhoneSender(String phoneSender) {
        this.phoneSender = phoneSender;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
