package com.service.customer.entrypoint.usecase.transactions;

import com.service.customer.constants.ApiConstants;
import com.service.customer.usecase.transactions.TransactionsValidator;
import com.service.customer.usecase.transactions.TransactionsValidatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionsValidatorTest {

    TransactionsValidator transactionsValidator;

    @BeforeEach
    void setup() {
        transactionsValidator = new TransactionsValidatorImpl();
    }

    @Test
    void whenPassAValidHeaderThenReturnTrue() {
        Map<String, String> params = new HashMap<>();

        params.put(ApiConstants.AUTHORIZATION_KEY, ApiConstants.AUTHORIZATION_VALUE);

        assertTrue(
                transactionsValidator.validator(params)
        );
    }

    @Test
    void whenPassAIncorrectHeaderThenReturnFalse() {
        Map<String, String> params = new HashMap<>();

        params.put(ApiConstants.AUTHORIZATION_KEY, "valids");

        assertFalse(
                transactionsValidator.validator(params)
        );
    }
}
