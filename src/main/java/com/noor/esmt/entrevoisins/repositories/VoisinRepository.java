package com.noor.esmt.entrevoisins.repositories;

import com.noor.esmt.entrevoisins.entities.Voisin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestController
public interface VoisinRepository extends JpaRepository<Voisin,Long> {
}
