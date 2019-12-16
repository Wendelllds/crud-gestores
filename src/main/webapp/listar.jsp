<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<c:import url="cabecalho.jsp" />
<div class="container-fluid">
    <div class="row">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
         <p>
            <h2>Gestores</h2>
            <a  href="/adicionar" role="button" class="btn btn-success">Adicionar</a >
         </p>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>Matricula</th>
                        <th>Nome</th>
                        <th>Data Nascimento</th>
                        <th>Setor</th>
                        <th>Ação</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="item" items="${gestores}">
                        <tr>
                            <td>${item.matricula}</td>
                            <td>${item.nome}</td>
                            <td>${item.datanascimento}</td>
                            <td>${item.setor}</td>
                            <td><a  href="/editar/${item.matricula}" role="button" class="btn btn-primary">Editar</a>  <a  href="/excluir/${item.matricula}" role="button" class="btn btn-danger">Excluir</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </main>
    </div>
</div>
<c:import url="rodape.jsp" />
