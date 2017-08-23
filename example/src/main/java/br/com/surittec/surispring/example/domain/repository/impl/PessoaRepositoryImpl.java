package br.com.surittec.surispring.example.domain.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.surittec.surispring.data.repository.RepositorySupport;
import br.com.surittec.surispring.example.domain.entity.Pessoa;
import br.com.surittec.surispring.example.domain.repository.PessoaRepositoryCustom;

public class PessoaRepositoryImpl extends RepositorySupport implements PessoaRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public List<Pessoa> findAllWithJpql() {
		return jpql().from("Pessoa").getResultList(Pessoa.class);
	}

}
