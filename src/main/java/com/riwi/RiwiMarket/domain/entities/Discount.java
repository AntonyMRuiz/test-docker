package com.riwi.RiwiMarket.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "discount")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "DECIMAL(2,2)")
    private Double amount;

    @Column(length = 100)
    private String description;

    private LocalDateTime startDiscount;

    private LocalDateTime endDiscount;

    @Column(nullable = false)
    private Boolean status;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "discountId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<SaleDiscount> saleDiscounts;
}
