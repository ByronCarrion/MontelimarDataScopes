package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.HumedadFardos;
@Repository
public interface DataHumedadFardosRepository extends JpaRepository<HumedadFardos, Long>{

}
