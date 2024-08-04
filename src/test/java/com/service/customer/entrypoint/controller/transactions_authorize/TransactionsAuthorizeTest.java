package com.service.customer.entrypoint.controller.transactions_authorize;

import com.service.customer.usecase.transactions.TransactionsValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TransactionsAuthorizeTest {

    TransactionsValidator transactionsValidator;

    TransactionsAuthorizeImpl transactionsAuthorizeImpl;

    @BeforeEach
    void setup() {
        transactionsValidator = Mockito.mock(TransactionsValidator.class);
        transactionsAuthorizeImpl = new TransactionsAuthorizeImpl(transactionsValidator);
    }

    @Test
    void whenDoAGetThenReturnSuccessWithValidHeader() {
        Map<String, String> headers = new HashMap<>();

        headers.put("authorization", "valid");

        when(transactionsValidator.validator(headers)).thenReturn(true);

        ResponseEntity<Boolean> response = transactionsAuthorizeImpl.authorize(headers);

//        assertEquals(Boolean.TRUE, response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
