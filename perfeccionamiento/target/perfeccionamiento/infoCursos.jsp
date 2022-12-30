<%@ page contentType="text/html" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Informacion del curso</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
    <h2>Informacion de la inscripcion al curso de perfeccionamiento ID ${c.getId()}</h2>
    <p><br>Apellidos:</br> ${c.getApellidos()}</p>
    <p><br>Nombres:</br> ${c.getNombres()}</p>
    <p><br>Curso:</br> ${c.getCurso()}</p>
    <p><br>Alta:</br> ${c.getAlta()}</p>
    <p><br>Contacto:</br> ${c.getContacto()}</p>
    </section>
    
</body>
</html>