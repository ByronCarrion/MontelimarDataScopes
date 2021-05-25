package com.montelimar.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montelimar.rest.model.modelviajesemilla;
@Repository
public interface RepositoryViajesemilla extends JpaRepository<modelviajesemilla	, Long> {

}
