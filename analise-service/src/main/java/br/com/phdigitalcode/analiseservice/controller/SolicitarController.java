package br.com.phdigitalcode.analiseservice.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("solicitar")
public class SolicitarController {
	@PatchMapping("/cnpjInstituicao/{cnpjInstituicao}/processo/{numeroProcesso}/responsavel/{cpfResponsavel}")
	public boolean solicitarDocumento(@PathVariable String cnpjInstituicao,
										@PathVariable String numeroProcesso,
										@PathVariable String cpfResponsavel) {
		return true;
	}
}
