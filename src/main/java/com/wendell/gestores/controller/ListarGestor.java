package com.wendell.gestores.controller;

import java.util.List;
import java.util.Map;

import com.wendell.gestores.modelo.GestorModelo;
import com.wendell.gestores.servico.GestorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ListarGestor {
    @Autowired
    private GestorServico gestorServico;


    @RequestMapping("/listar")
    public String  listar(HttpServletRequest req, HttpServletResponse res) {
        List<GestorModelo> lista =   this.gestorServico.listar();
        req.setAttribute("gestores", lista);
        return "listar";
    }


}
