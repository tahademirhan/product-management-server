package com.ismer.product_management.entity;

import com.ismer.product_management.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Getter
@Setter
public class ProductEntity extends BaseEntity {

    @Column(name = "barcode")
    private String barcode;
}
