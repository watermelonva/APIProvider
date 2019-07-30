package com.vega.APIProvider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easylink.api.model.Amicale;
@Repository
public interface AmicaleRepository extends JpaRepository<Amicale, Integer>{

}
