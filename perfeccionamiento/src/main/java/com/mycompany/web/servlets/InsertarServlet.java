package com.mycompany.web.servlets;

import com.mycompany.web.models.Cursos;

import java.io.IOException;

import com.mycompany.web.models.AccionesCursos ;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevocursos")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n , a, c, j, z;

        n = req.getParameter("apellidos");

        a = req.getParameter("nombres");

        c = req.getParameter("curso");

        j = req.getParameter("alta");

        z = req.getParameter("contacto");

        Cursos nuevoCursos = new Cursos();

        nuevoCursos.setApellidos(n);
        nuevoCursos.setNombres(a);
        nuevoCursos.setCurso(c);
        nuevoCursos.setAlta(j);
        nuevoCursos.setContacto(z);

        int estado = AccionesCursos.registrarCursos(nuevoCursos);

        if (estado == 1){
            resp.sendRedirect("exito.jsp");
            System.out.println("La inscripción se ha realizado corectamente");
        } else {
            System.out.println("Error al realizar la inscripción. Intente nuevamente");
            resp.sendRedirect("error.jsp");
        }



    }
}
