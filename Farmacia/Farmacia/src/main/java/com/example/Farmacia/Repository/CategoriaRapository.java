package com.example.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Farmacia.model.Categoria;

@Repository
public interface CategoriaRapository  extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllBydescricaoContainingIgnoreCase (String descricao);

}
