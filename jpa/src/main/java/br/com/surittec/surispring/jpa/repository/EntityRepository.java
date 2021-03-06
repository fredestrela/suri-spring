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
package br.com.surittec.surispring.jpa.repository;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.surittec.surijpa.repository.EntityRepositorySupport;

/**
 * Suporte para classes de persistência, com encapsulamento do uso do {@link javax.persistence.EntityManager} e provendo algumas operações necessárias
 * manter ou pesquisar entidades.
 */
public abstract class EntityRepository<E, PK extends Serializable> extends EntityRepositorySupport<E, PK> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

}
