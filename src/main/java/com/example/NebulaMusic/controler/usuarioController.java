package com.example.NebulaMusic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.NebulaMusic.service.usuarioService;
import com.example.NebulaMusic.model.usuario;

@Controller
public class usuarioController {
    private final usuarioService usuarioService;

    public usuarioController(usuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping({"index.html", "index"})
    public String index(){
        return "index";
    }

    @GetMapping({"/", "/iniciar-sesion", "/iniciar-sesion.html"})
    public String login(){
        return "iniciar-sesion";
    }

    @GetMapping({"/registro", "/registro.html"})
    public String registro(){
        return "registro";
    }

    @GetMapping({"/error", "/error.html"})
    public String error(){
        return "error";
    }

    @PostMapping("/crear-cuenta")
    public String crearCuenta(@ModelAttribute usuario usuario){
        if(usuarioService.existeCorreo(usuario.getCorreo())){
            return "redirect:/error";
        }
        usuarioService.registrar(usuario);

        return "redirect:/iniciar-sesion";
    }

    @PostMapping("/autenticar")
    public String autenticar(@RequestParam("correo") String correo, @RequestParam("contrasenia") String contrasenia){
        if(usuarioService.autenticar(correo, contrasenia)){
            return "redirect:/index";
        }
        return "redirect:/error";
    }

    @GetMapping("/cerrar-sesion")
    public String cerrarSesion(){
        return "redirect:/iniciar-sesion?logout";
    }
}
