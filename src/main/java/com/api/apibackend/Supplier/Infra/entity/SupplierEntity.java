package com.api.apibackend.Supplier.Infra.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.context.annotation.Lazy;

import com.api.apibackend.SupplierAddress.infra.entity.SupplierAddressEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Lazy
@Data
@Entity
@Table(name = "fornecedor")
@EqualsAndHashCode(of = "idSupplier")
public class SupplierEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @NotBlank
    @Column(name = "idfornecedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSupplier;

    @Column(name = "nm_empresa")
    private String nameCompany;

    @Column(name = "regiao")
    private String region;

    @Column(name = "cargo_fornecedor")
    private String officeSupplier;
    
    @CurrentTimestamp
    @Column(name = "dt_criacao")
    private LocalDateTime date_created;

    @Column(name = "contato")
    private String contact;
    
    @Column(name = "cnpj")
    private String cnpj;

    @ManyToOne
    @JoinColumn(name = "id_ed_fornecedor", referencedColumnName = "id_ed_fornecedor")
    private SupplierAddressEntity supplierAddressEntity;
}
