package com.algaworks.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.models.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
