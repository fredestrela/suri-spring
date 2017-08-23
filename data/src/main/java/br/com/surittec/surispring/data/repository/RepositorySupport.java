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
package br.com.surittec.surispring.data.repository;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.surittec.surispring.data.criteria.JPQL;

/**
 * Suporte para classes de persistência, com encapsulamento do uso do
 * {@link javax.persistence.EntityManager} e provendo algumas operações necessárias manter ou
 * pesquisar entidades.
 */
public abstract class RepositorySupport {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected abstract EntityManager getEntityManager();

	/**
	 * Create a JPQL support
	 * 
	 * @return jpql
	 */
	protected JPQL jpql() {
		return new JPQL(getEntityManager());
	}

	/**
	 * Cria a JPQL support já iniciando o select
	 * 
	 * @param select
	 * @return
	 */
	public JPQL select(String... select) {
		return jpql().select(Arrays.asList(select));
	}

	/**
	 * Cria a JPQL support já iniciando o select
	 * 
	 * @param select
	 * @return
	 */
	public JPQL select(Collection<String> selects) {
		return jpql().select(selects);
	}

}
