package br.com.caelum.agiletickets.domain.precos;

import java.math.BigDecimal;

import br.com.caelum.agiletickets.models.TipoDeEspetaculo;

public interface CalcularPreco {
	
	BigDecimal calcula(TipoDeEspetaculo tipoEspetaculo);
	
	

}
