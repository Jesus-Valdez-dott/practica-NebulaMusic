package com.example.NebulaMusic.service;

import org.springframework.stereotype.Service;
import com.example.NebulaMusic.model.usuario;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class usuarioService {
    public usuarioService() {
    }

    private final Map<String, usuario> usuarios = new ConcurrentHashMap<>();

    public void registrar(usuario usuario){
        usuarios.put(usuario.getCorreo(), usuario);
    }

    public boolean existeCorreo(String correo){
        return usuarios.containsKey(correo);
    }

    public boolean autenticar(String correo, String contrasenia){
        usuario usuario = usuarios.get(correo);
        boolean value = usuario != null && usuario.getContrasenia().equals(contrasenia);
        return  value;
    }
}
