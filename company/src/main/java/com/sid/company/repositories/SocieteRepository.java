package com.sid.company.repositories;

import com.sid.company.entities.Societe;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@RepositoryRestController
public interface SocieteRepository extends JpaRepository<Societe, Long> {
}

