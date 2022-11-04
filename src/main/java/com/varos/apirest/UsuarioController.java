package com.varos.apirest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varos.apirest.entity.Usuario;

@RestController
public class UsuarioController {
	
	@PostMapping("/DevOps")
	public Response insert(@RequestBody Usuario usuario) {
		Response res = new Response();
		res.setMessage("Hola " + usuario.getTo() + " tu mensaje será enviado");
		return res;   
	}
}
