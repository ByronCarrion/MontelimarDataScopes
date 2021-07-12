package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.ColumnaBascula;

@Repository
public interface RepositoryColumnaBascula extends JpaRepository<ColumnaBascula, Long> {

}
