package br.com.phdigitalcode.analiseservice.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("analisar")
@RestController
public class AnaliseController {
	@PatchMapping("/cnpjInstituicao/{cnpjInstituicao}/processo/{numeroProcesso}/responsavel/{cpfResponsavel}")
	public boolean analisarProcesso(@PathVariable String cnpjInstituicao,
			@PathVariable String numeroProcesso,
			@PathVariable String cpfResponsavel,
			@RequestBody Object analise ) {
		return false;
	}

}
