package com.example.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Farmacia.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllBynomeContainingIgnoreCase (String nome);

}



