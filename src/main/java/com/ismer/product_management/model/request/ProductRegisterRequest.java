package com.ismer.product_management.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductRegisterRequest {

    private List<String> barcodeList;
}
