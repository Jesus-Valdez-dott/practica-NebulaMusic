package com.example.NebulaMusic.model;

public class usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String pseudonimo;
    private String genero;
    private String suscripcion;
    private String fechaNacimiento;
    private String terminos;
    private String comentarios;

    public usuario() {
    }

    public usuario(String nombre, String correo, String contrasenia, String pseudonimo, String comentarios, String terminos, String fechaNacimiento, String suscripcion, String genero) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.pseudonimo = pseudonimo;
        this.comentarios = comentarios;
        this.terminos = terminos;
        this.fechaNacimiento = fechaNacimiento;
        this.suscripcion = suscripcion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", genero='" + genero + '\'' +
                ", suscripcion='" + suscripcion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", terminos='" + terminos + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
