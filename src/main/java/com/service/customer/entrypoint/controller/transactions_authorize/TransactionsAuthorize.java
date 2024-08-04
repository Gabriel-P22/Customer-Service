package com.service.customer.entrypoint.controller.transactions_authorize;

import org.springframework.http.ResponseEntity;

public interface TransactionsAuthorize {
    ResponseEntity<Boolean> authorize();
}
