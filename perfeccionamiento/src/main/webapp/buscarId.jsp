<%@ page contentType="text/html" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Buscar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
    <h2>Buscar cursos por ID</h2>
    <form action="vercursos" method="get">
        <div>
            <label>ID Cursos</label>
            <input name="id_cursos" type="text">
        </div>
        <br>
        <input type="submit" class="btn btn-outline-dark" value="Ver">
    </form>
    </section>
    
</body>
</html>