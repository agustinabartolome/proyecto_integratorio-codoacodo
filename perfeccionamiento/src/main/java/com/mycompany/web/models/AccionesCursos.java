package com.mycompany.web.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;


public class AccionesCursos { 
//insertar registro
public static int registrarCursos(Cursos c){
    int estado = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); //OJO!!!EN CADA CONECCION DEBEREMOS CARGAR LA CLASE PRIMERO PARA PODER IDENTIFICAR AL DRIVER Y CONECTARNOS A LA BASE DE DATOS
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/perfeccionamiento","root","");

        String query = "INSERT INTO cursos(apellidos,nombres,curso,alta,contacto) VALUES (?,?,?,?,?)";

        
        String Apellidos = c.getApellidos();
        String Nombres = c.getNombres();
        String Curso = c.getCurso();
        String Alta = c.getAlta();
        String Contacto = c.getContacto();

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, Apellidos);
        pst.setString(2, Nombres);
        pst.setString(3, Curso);
        pst.setString(4, Alta);
        pst.setString(5, Contacto);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println(e);
        System.out.println("No pudo completarse la inscripcion. Intente nuevamente");
    }

    return estado;
}

//actualizar registro

public static int actualizarCursos(Cursos c){
    int estado = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/perfeccionamiento/","root","");

        String query = "UPDATE cursos SET apellidos=?,nombres=?,curso=?,alta=?,contacto=? WHERE id_cursos=?";

        int id_cursos = c.getId();
        String Apellidos = c.getApellidos();
        String Nombres = c.getNombres();
        String Curso = c.getCurso();
        String Alta = c.getAlta();
        String Contacto = c.getContacto();


        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setInt(1, id_cursos);
        pst.setString(2, Apellidos);
        pst.setString(3, Nombres);
        pst.setString(4, Curso);
        pst.setString(5, Alta);
        pst.setString(6, Contacto);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception a){
        System.out.println("No pudo completarse la inscripcion. Intente nuevamente");
    }

    return estado;
}

//consultar registro por id

public static Cursos verCursos(int idAConsultar){
    Cursos cursosADevolver = new Cursos();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/perfeccionamiento","root","");

        String query = "SELECT * FROM cursos WHERE id_cursos=?";

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setInt(1, idAConsultar);

        ResultSet consultaCursos = pst.executeQuery();

        if (consultaCursos.next()){
            cursosADevolver.setId( consultaCursos.getInt(1));
            cursosADevolver.setApellidos( consultaCursos.getString(2));
            cursosADevolver.setNombres( consultaCursos.getString(3));
            cursosADevolver.setCurso( consultaCursos.getString(4));
            cursosADevolver.setAlta( consultaCursos.getString(5));
            cursosADevolver.setContacto( consultaCursos.getString(6));
            conexion.close();
        }
    } catch (Exception e){
        System.out.println(e);
        System.out.println("No pudo completarse la inscripcion. Intente nuevamente");
    }

    return cursosADevolver;
}    

//consultar todos los registros de una tabla

public static List<Cursos> verTodosCursos(){
    List<Cursos> ListaCursosADevolver = new ArrayList<Cursos>();
    

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/perfeccionamiento/","root","");

        String query = "SELECT * FROM cursos";

        PreparedStatement pst = conexion.prepareStatement(query);

        ResultSet consultaCursos = pst.executeQuery();

        while (consultaCursos.next()){
            Cursos cursosADevolver = new Cursos(); //EN CADA VUELTA NECESITAREMOS INSTANCIAR UN NUEVO OBJETO
            cursosADevolver.setId( consultaCursos.getInt(1));
            cursosADevolver.setApellidos( consultaCursos.getString(2));
            cursosADevolver.setNombres( consultaCursos.getString(3));
            cursosADevolver.setCurso( consultaCursos.getString(4));
            cursosADevolver.setAlta( consultaCursos.getString(5));
            cursosADevolver.setContacto( consultaCursos.getString(6));
            ListaCursosADevolver.add(cursosADevolver);
        }
        conexion.close();
    } catch (Exception e){
        System.out.println(e);
        System.out.println("No pudo completarse la inscripcion. Intente nuevamente");
    }

    return ListaCursosADevolver;
} 
    
}
