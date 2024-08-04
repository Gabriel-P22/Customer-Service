package com.service.customer.usecases.transactions;

import com.service.customer.constants.ApiConstants;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class TransactionsValidatorImpl implements TransactionsValidator {

    @Override
    public boolean validator(Map<String, String> params) {
        String value = params.get(ApiConstants.AUTHORIZATION_KEY);
        return Objects.equals(value, ApiConstants.AUTHORIZATION_VALUE);
    }
}
