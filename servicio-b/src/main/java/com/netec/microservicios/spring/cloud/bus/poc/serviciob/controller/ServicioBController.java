package com.netec.microservicios.spring.cloud.bus.poc.serviciob.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServicioBController {
	@Value("${app.nombre-servicio}")
	private String nombreServicio;

	@Value("${app.compartido.propiedad}")
	private String propiedadCompartida;

	@GetMapping("/servicio")
	public String getNombreServicio() {
		return "Nombre del servicio [" + this.nombreServicio + "]";
	}

	@GetMapping("/compartido")
	public String getPropiedadCompartida() {
		return " application.properties [" + this.propiedadCompartida + "]";
	}
}
