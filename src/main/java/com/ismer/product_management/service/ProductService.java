package com.ismer.product_management.service;

import com.ismer.product_management.entity.ProductEntity;
import com.ismer.product_management.model.request.ProductRegisterRequest;
import com.ismer.product_management.model.response.ProductRegisterResponse;
import com.ismer.product_management.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductRegisterResponse register(ProductRegisterRequest request) {

        var list = request.getBarcodeList().stream().map((barcode) -> {
            ProductEntity entity = new ProductEntity();
            entity.setCreateUser("SYSTEM");
            entity.setBarcode(barcode);
            return entity;
        }).collect(Collectors.toList());

        productRepository.saveAll(list);

        return new ProductRegisterResponse();
    }
}
