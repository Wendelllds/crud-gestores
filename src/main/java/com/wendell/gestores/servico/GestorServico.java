package com.wendell.gestores.servico;
import com.wendell.gestores.modelo.GestorModelo;
import com.wendell.gestores.repositorio.GestorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class GestorServico {

    @Autowired
    private GestorRepositorio gestorRepositorio;

    @Transactional
    public void salvar(GestorModelo gestor){
        this.gestorRepositorio.save(gestor);
    }

    @Transactional
    public void editar(GestorModelo gestor, Integer id) throws Exception {

        Optional<GestorModelo> gestorBusca = this.gestorRepositorio.findById(id);
        if(!gestorBusca.isPresent()){
            throw new Exception("Gestor Não localizando no banco de dados");
        }
        GestorModelo gestorBanco = gestorBusca.get();
        gestorBanco.setNome(gestor.getNome());
        gestorBanco.setDatanascimento(gestor.getDatanascimento());
        gestorBanco.setSetor(gestor.getSetor());

        this.gestorRepositorio.save(gestorBanco);
    }
    public List<GestorModelo> listar(){
        return this.gestorRepositorio.findAll();
    }

    @Transactional
    public void deletar(Integer id){
        this.gestorRepositorio.deleteById(id);
    }

    public Optional<GestorModelo> buscar(Integer id) {
        return this.gestorRepositorio.findById(id);
    }
}
