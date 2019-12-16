package com.wendell.gestores.controller;

import com.wendell.gestores.modelo.GestorModelo;
import com.wendell.gestores.servico.GestorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ExcluirGestor {
    @Autowired
    private GestorServico gestorServico;


    @RequestMapping("/excluir/{matricula}")
    public RedirectView  listar(@PathVariable("matricula")int id) {
        this.gestorServico.deletar(id);
        return new RedirectView("/listar");
    }


}
