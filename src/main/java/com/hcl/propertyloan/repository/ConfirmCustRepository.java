package com.hcl.propertyloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.propertyloan.daolayer.CustomerConfirmed;

public interface ConfirmCustRepository extends JpaRepository<CustomerConfirmed, String> {

}
