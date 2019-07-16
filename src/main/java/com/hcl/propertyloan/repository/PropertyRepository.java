package com.hcl.propertyloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.propertyloan.daolayer.AreaDetails;

@Repository
public interface PropertyRepository extends JpaRepository<AreaDetails, Long> {

}
