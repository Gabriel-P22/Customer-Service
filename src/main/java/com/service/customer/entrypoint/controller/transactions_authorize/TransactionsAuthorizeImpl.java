package com.service.customer.entrypoint.controller.transactions_authorize;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("transactions")
public class TransactionsAuthorizeImpl implements TransactionsAuthorize {

    @Override
    @GetMapping("/v1/authorize")
    public ResponseEntity<Boolean> authorize() {
        return ResponseEntity.ok(true);
    }
}
