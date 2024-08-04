package com.service.customer.usecases.transactions;

import java.util.Map;

public interface TransactionsValidator {
    boolean validator(Map<String, String> params);
}
