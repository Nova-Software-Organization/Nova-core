package com.api.apibackend.ContactNewsletter.infra.Persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contato")
public class ContactEntity implements Serializable {

	@Id
	@Column(name = "idcontato")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcontato;

	@Column(name = "email")
	private String email;

	@Column(name = "nome")
	private String name;

	@Column(name = "telefone")
	private String phone;

	@Column(name = "status")
	private Integer status;
}