package com.pragma.poweup.messengermicroservice.config;

public class Constants {
    //response key
    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String WRONG_CREDENTIALS_MESSAGE = "Wrong credentials";
    public static final String DESCRIPTION_MESSAGE_KEY = "http 200 type messages";
    public static final String DESCRIPTION_MESSAGE_BOOLEAN_KEY = "true for http 200 message types and false for http 400 message types";
    public static final String DESCRIPTION_ERROR_KEY = "http 400 type messages";

    //response code 200
    public static final String MESSAGE_SENT = "Message sent successfully";
    //response code 400
    public static final String DUPLICATE_VALUE = "a value is already registered in the database";
    //swagger
    public static final String SWAGGER_TITLE_MESSAGE = "Messenguer API Pragma Power Up";
    public static final String SWAGGER_DESCRIPTION_MESSAGE = "Messenger microservice";
    public static final String SWAGGER_VERSION_MESSAGE = "2.0.4";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "https://springdoc.org/v2/";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "http://swagger.io/terms/";

    private Constants() {
        throw new IllegalStateException("Utility class");
    }


}
