package com.ladidas.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ladidas.store.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}