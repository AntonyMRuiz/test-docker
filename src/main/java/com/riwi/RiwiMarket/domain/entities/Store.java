package com.riwi.RiwiMarket.domain.entities;

import java.math.BigDecimal;
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
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String phone;

    @Column(length = 12)
    private String nit;

    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private BigDecimal available;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "storeId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Employee> employees;
}
