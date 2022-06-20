package br.com.phdigitalcode.processoservice.contoller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("processo")
@RestController
public class ProcessoController {
	
	@GetMapping("/cnpjInstituicao/{cnpjInstituicao}/size/{size}/page/{page}")
	public Page<?> listarProcesso(@PathVariable String cnpjInstituicao, @PathVariable Integer size,@PathVariable Integer page) {
		return null;
	}
	
	@PostMapping("/cnpjInstituicao/{cnpjInstituicao}")
	public boolean registraProcesso(@PathVariable String cnpjInstituicao, @RequestBody Object processo) {
		return true;
	}
	@PostMapping("/cnpjInstituicao/{cnpjInstituicao}/size/{size}/page/{page}")
	public Page<?> filtrarProcesso(@PathVariable String cnpjInstituicao, @PathVariable Integer size,@PathVariable Integer page,@RequestBody Object filtros) {
		return null;
	}
	
	@PatchMapping("/{numeroProcesso}/cnpjInstituicao/{cnpjInstituicao}")
	public boolean finalizarProcesso(@PathVariable String numeroProcesso, @PathVariable String cnpjInstituicao, @RequestBody Object dadosFinalizar) {
		return true;
	}
	
}
