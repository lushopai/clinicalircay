package com.clinicalircay.sistemadeparking.Repository;

import com.clinicalircay.sistemadeparking.models.Clientes;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes,Long> {
    
}
