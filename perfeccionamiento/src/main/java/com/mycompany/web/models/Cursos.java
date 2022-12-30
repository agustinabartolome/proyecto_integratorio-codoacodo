package com.mycompany.web.models;

import java.io.Serializable;

    
public class Cursos implements Serializable {

        private int id;
        private String Apellidos,Nombres,Curso,Alta,Contacto;

    
        public Cursos(){
    
        }
    
        public int getId(){
            return id;
        }
    
        public void setId(int nuevoId){
            this.id = nuevoId;
        }
    
         public String getApellidos(){
            return Apellidos;
        }
    
        public void setApellidos(String nuevoApellidos){
            this.Apellidos = nuevoApellidos;
        }
    
         public String getNombres(){
            return Nombres;
        }
    
        public void setNombres(String nuevoNombres){
            this.Nombres = nuevoNombres;
        }
    
         public String getCurso(){
            return Curso;
        }
    
        public void setCurso(String nuevoCurso){
            this.Curso = nuevoCurso;
        }
    
         public String getAlta(){
            return Alta;
        }
    
        public void setAlta(String nuevoAlta){
            this.Alta = nuevoAlta;
        }
    
         public String getContacto(){
            return Contacto;
        }
    
        public void setContacto(String nuevoContacto){
            this.Contacto = nuevoContacto;
        }
    }
    