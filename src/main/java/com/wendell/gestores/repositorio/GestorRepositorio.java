package com.wendell.gestores.repositorio;

import com.wendell.gestores.modelo.GestorModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestorRepositorio extends JpaRepository<GestorModelo, Integer> {

}
