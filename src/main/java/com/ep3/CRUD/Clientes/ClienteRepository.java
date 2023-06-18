package com.ep3.CRUD.Clientes;

import com.ep3.CRUD.Clientes.Entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes,Long> {
}
