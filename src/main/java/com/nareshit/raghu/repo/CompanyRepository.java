package com.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.raghu.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
