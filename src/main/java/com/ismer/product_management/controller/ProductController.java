package com.ismer.product_management.controller;

import com.ismer.product_management.model.request.ProductRegisterRequest;
import com.ismer.product_management.model.response.ProductRegisterResponse;
import com.ismer.product_management.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("register")
    public ResponseEntity<ProductRegisterResponse> register(@RequestBody ProductRegisterRequest request) {
        return ResponseEntity.ok(productService.register(request));
    }
}
