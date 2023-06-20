package com.pragma.poweup.messengermicroservice.adapters.driving.http.controller;

import com.pragma.poweup.messengermicroservice.adapters.driving.http.handlers.ISmsHandler;
import com.pragma.poweup.messengermicroservice.config.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

import static com.pragma.poweup.messengermicroservice.config.Constants.MESSAGE_SENT;

@RestController
@RequestMapping("/sms/")
@RequiredArgsConstructor
@Tag(name = "sms", description = "endpoints related to sms")
public class SmsController {
    private final ISmsHandler smsHandler;

    @Operation(summary = "Send Message",
            responses = {
                    @ApiResponse(responseCode = "200", description = MESSAGE_SENT,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
            })
    @PostMapping
    public ResponseEntity<Map<String, String>> sendSms(@RequestParam String messageJson) {
        smsHandler.sendSms(messageJson);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,MESSAGE_SENT));
    }

}
