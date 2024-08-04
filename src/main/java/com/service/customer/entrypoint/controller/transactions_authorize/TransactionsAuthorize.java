package com.service.customer.entrypoint.controller.transactions_authorize;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

public interface TransactionsAuthorize {
    ResponseEntity<Boolean> authorize(@RequestHeader Map<String, String> headers);
}
