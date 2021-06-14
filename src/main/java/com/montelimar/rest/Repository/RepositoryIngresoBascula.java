package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.RegistroBascula;

@Repository
public interface RepositoryIngresoBascula extends JpaRepository<RegistroBascula	, Long> {

}
