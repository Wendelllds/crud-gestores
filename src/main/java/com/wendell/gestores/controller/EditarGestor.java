package com.wendell.gestores.controller;

import com.wendell.gestores.modelo.GestorModelo;
import com.wendell.gestores.servico.GestorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/editar")
public class EditarGestor {
    @Autowired
    private GestorServico gestorServico;



    @RequestMapping(value = "{matricula}", method = RequestMethod.GET)
    public String  pre(@PathVariable("matricula")int id, HttpServletRequest req, HttpServletResponse res) {
        GestorModelo gestorModelo = this.gestorServico.buscar(id).get();
        req.setAttribute("gestor", gestorModelo);
        return "editar";
    }

    @RequestMapping(value = "{matricula}", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public RedirectView  adicionar(@PathVariable("matricula")int id, GestorModelo gestor,
                                   BindingResult result, SessionStatus status) throws Exception{
        this.gestorServico.editar(gestor,id);
        return new RedirectView("/listar");
    }


}
