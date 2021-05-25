package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.modelviajespersonales;
@Repository
public interface RepositoryViajepersona extends JpaRepository<modelviajespersonales, Long> {

}
