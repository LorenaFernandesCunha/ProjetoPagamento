package com.example.curso.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.OrdemItem;

public interface OrderItemRepository extends JpaRepository<OrdemItem, Long>{

	
}
