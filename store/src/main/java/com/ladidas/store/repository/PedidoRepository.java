package com.ladidas.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ladidas.store.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}