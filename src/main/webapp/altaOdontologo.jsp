<%-- 
    Document   : alta
    Created on : 6 ago. 2025, 22:03:00
    Author     : Martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"%>
<%@include file="Components/bodyPrimeraParte.jsp"%>

<h1>Alta odontólogos</h1>
<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni"
                placeholder="Dni">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechaNac"
                placeholder="Fecha de Nacimiento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono"
                placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                placeholder="Direccion">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad"
                placeholder="Especialidad">
        </div>
        <!<!-- Aca va a ir lo que pertenece a horario y usuarios -->
    </div>
    <a href="#" class="btn btn-primary btn-user btn-block">
        Crear Odontologo
    </a>
    <hr>
                                
                                
</form>

<%@include file="Components/bodyFinal.jsp"%>


