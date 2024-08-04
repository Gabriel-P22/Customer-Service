package com.service.customer.usecase.transactions;

import java.util.Map;

public interface TransactionsValidator {
    boolean validator(Map<String, String> params);
}
