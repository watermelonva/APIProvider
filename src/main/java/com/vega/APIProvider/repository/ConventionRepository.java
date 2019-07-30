package com.vega.APIProvider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easylink.api.model.Convention;
@Repository
public interface ConventionRepository extends JpaRepository<Convention, Integer> {

}
