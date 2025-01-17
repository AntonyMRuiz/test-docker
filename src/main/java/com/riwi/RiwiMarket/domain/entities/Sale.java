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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "sale")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Boolean delivery;

    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private BigDecimal totalPrice;

    @Column(nullable = false)
    private Boolean status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", 
    referencedColumnName = "id")
    private Customer customerId;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "saleId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<SaleDiscount> saleDiscounts;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "saleId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<SalePayment> salePayments;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "saleId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Item> items;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cash_machine_id", 
    referencedColumnName = "id")
    private CashMachine cashMachineId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", 
    referencedColumnName = "id")
    private Employee employeeId;

}
