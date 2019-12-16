<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<c:import url="cabecalho.jsp" />
<div class="container-fluid">
    <div class="row">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
         <p>
            <h2>Editar Gestor</h2>
         </p>
            <div class="table-responsive">
                <form action="${gestor.matricula}" method="post">
                    <div class="form-group">
                        <label for="nome">Nome</label>
                        <input required="true" type="text" class="form-control" id="nome" name="nome" value ="${gestor.nome}">
                    </div>
                    <div class="form-group">
                        <label for="setor">Setor</label>
                        <select class="custom-select" id="setor" value ="${gestor.setor}"  name="setor">

                            <option value="A">Administração</option>
                            <option value="T">Tecnologia</option>
                            <option value="R">Recursos Humanos</option>
                            <option value="H">Suporte Técnico</option>

                        </select>
                    </div>
                    <div class="form-group">
                        <label for="datanascimento">Data Nascimento</label>
                        <input required="true" type="date" class="form-control" id="datanascimento"  name="datanascimento" value ="${gestor.datanascimento}">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </main>
    </div>
</div>
<c:import url="rodape.jsp" />
