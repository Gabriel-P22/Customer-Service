package com.service.customer.entrypoint.controller.transactions_authorize;

import com.service.customer.usecases.transactions.TransactionsValidator;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("transactions")
public class TransactionsAuthorizeImpl implements TransactionsAuthorize {

    private final TransactionsValidator transactionsValidator;

    @Override
    @GetMapping("/v1/authorize")
    public ResponseEntity<Boolean> authorize(Map<String, String> headers) {
        return ResponseEntity.ok(
                transactionsValidator.validator(headers)
        );
    }
}
