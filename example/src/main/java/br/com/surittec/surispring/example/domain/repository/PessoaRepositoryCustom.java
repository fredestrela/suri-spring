package br.com.surittec.surispring.example.domain.repository;

import java.util.List;

import br.com.surittec.surispring.example.domain.entity.Pessoa;

public interface PessoaRepositoryCustom {

	List<Pessoa> findAllWithJpql();
}
