package com.nareshit.raghu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="addr_tab")
public class Address {
	@Id
	@Column(name="com_id_col")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="addr_line1_col")
	private String line1;
	
	@Column(name="addr_line2_col")
	private String line2;
	
	@Column(name="addr_city_col")
	private String city;
	
	@Column(name="addr_state_col")
	private String state;
	
	@Column(name="addr_country_col")
	private String country;
	
	@Column(name="addr_pincode_col")
	private Long pincode;
	
}
