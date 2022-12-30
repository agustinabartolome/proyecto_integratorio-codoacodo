package com.mycompany.web.servlets;

import java.io.IOException;

import com.mycompany.web.models.AccionesCursos;
import com.mycompany.web.models.Cursos;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/vercursos")
public class VerServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("id_cursos"));

        Cursos registro = AccionesCursos.verCursos(i);

        req.setAttribute("c", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("/infoCursos.jsp");
        respuesta.forward(req, resp);
    }

    
}
