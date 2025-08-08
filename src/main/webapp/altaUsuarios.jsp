<%-- 
    Document   : altaUsuarios
    Created on : 6 ago. 2025, 23:46:22
    Author     : Martin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"%>
<%@include file="Components/bodyPrimeraParte.jsp"%>

<h1>Alta usuarios</h1>
<p>Aqui se daran de alta los usuarios en el sistema</p>
<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsuario" name="nombreusu"
                placeholder="Nombre usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contraseña" name="contrasenia"
                placeholder="Contraseña">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                placeholder="Rol del usuario">
        </div>
    </div>
    <button href="SvUsuarios" class="btn btn-primary btn-user btn-block" type="submit">
        Crear Usuario
    </button>
    <hr>
                                
                                
</form>

<%@include file="Components/bodyFinal.jsp"%>
