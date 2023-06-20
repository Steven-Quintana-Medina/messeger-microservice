package com.pragma.poweup.messengermicroservice.config;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Collections;
import java.util.Map;

import static com.pragma.poweup.messengermicroservice.config.Constants.*;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Map<String, String>> handlerNullPointerException(NullPointerException nullPointerException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, nullPointerException.getMessage()));
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<Map<String, String>> handlerIllegalStateException(IllegalStateException IllegalStateException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, IllegalStateException.getMessage()));
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<Map<String, String>> handleSQLIntegrityConstraintViolationException() {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, DUPLICATE_VALUE));
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handlerInvalidRangeException(IllegalArgumentException illegalArgumentException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, illegalArgumentException.getMessage()));
    }
}
