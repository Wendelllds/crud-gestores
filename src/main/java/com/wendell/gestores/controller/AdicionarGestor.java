package com.wendell.gestores.controller;

import com.wendell.gestores.modelo.GestorModelo;
import com.wendell.gestores.servico.GestorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/adicionar")
public class AdicionarGestor {
    @Autowired
    private GestorServico gestorServico;



    @RequestMapping(value = "", method = RequestMethod.GET)
    public String  pre(HttpServletRequest req, HttpServletResponse res) {
        return "adicionar";
    }
    @RequestMapping(value = "", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public RedirectView  adicionar(GestorModelo gestor,
                         BindingResult result, SessionStatus status) {
        this.gestorServico.salvar(gestor);
        return new RedirectView("listar");
    }


}
