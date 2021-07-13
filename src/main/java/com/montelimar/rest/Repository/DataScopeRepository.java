package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.BoletaRecCampo;

@Repository
public interface DataScopeRepository  extends JpaRepository<BoletaRecCampo,Long>{}
