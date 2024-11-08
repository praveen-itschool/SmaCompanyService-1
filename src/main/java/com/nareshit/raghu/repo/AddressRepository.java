package com.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.raghu.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
