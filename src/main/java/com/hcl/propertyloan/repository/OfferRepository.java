package com.hcl.propertyloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.propertyloan.daolayer.OfferForCust;

@Repository
public interface OfferRepository extends JpaRepository<OfferForCust, Integer> {

}
