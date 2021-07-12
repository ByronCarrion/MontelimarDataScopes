package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.HumedadTemperatura;

@Repository
public interface RepositoryHumedadTemperatura extends JpaRepository<HumedadTemperatura,	 Long>{

}
