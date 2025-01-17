package com.riwi.RiwiMarket.domain.entities;

import java.math.BigDecimal;
import java.util.List;
import com.riwi.RiwiMarket.util.enums.RoleEmployee;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "employee")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String document;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 15)
    private String phone;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 50, nullable = false)
    private String password;

    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private BigDecimal salary;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleEmployee role;
    
    @Column(nullable = false)
    private Integer schedule;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "employeeId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Expense> expenses;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "employeeId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Payroll> payrolls;


    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "employeeId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Sale> sales;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "employeeId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<CashMachine> cashMachines;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    private Store storeId;

}
