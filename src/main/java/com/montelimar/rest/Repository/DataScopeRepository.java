package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.DataScope;

@Repository
public interface DataScopeRepository  extends JpaRepository<DataScope,Long>{}
