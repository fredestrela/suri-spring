/*
 * SURITTEC
 * Copyright 2015, TTUS TECNOLOGIA DA INFORMACAO LTDA, 
 * and individual contributors as indicated by the @authors tag
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package br.com.surittec.surispring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import br.com.surittec.surispring.example.domain.entity.Pessoa;
import br.com.surittec.surispring.example.domain.repository.PessoaRepository;
import br.com.surittec.surispring.example.util.i18n.Messages;
import br.com.surittec.util.validation.Assert;

@Service
public class PessoaService extends br.com.surittec.surispring.core.service.Service {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private Messages messages;

	/*
	 * Public Methods
	 */

	public List<Pessoa> findByNome(String nome) {
		return pessoaRepository.findPessoaByNome(nome);
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public List<Pessoa> findAllWithJpql() {
		return pessoaRepository.findAllWithJpql();
	}

	public void save(Pessoa pessoa) {
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("email")
				.withIgnoreCase()
				.withIncludeNullValues();

		Example<Pessoa> example = Example.of(pessoa, matcher);

		Assert.isFalse(pessoaRepository.exists(example), messages.pessoaCadastroFalhaUnicidade());

		pessoaRepository.save(pessoa);
	}
}
