package com.vega.APIProvider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easylink.api.model.Provider;
@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer>{

}
