package com.gs.core.service;

import java.io.Serializable;
//import java.util.Properties;
import java.util.stream.Stream;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
//import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.type.Type;
import org.hibernate.persister.entity.EntityPersister;

public class GsPkGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object obj) {

		EntityPersister entityPersister = session.getEntityPersister(obj.getClass().getName(), obj);

		String query = String.format("select %s from %s", entityPersister.getIdentifierPropertyName(),
				obj.getClass().getSimpleName());

		Stream<String> ids = session.createQuery(query).stream();

		Long max = ids.map(o -> o.replace(entityPersister.getEntityName() + "-", "")).mapToLong(Long::parseLong).max()
				.orElse(0L);

		return entityPersister.getEntityName() + "-" + (max + 1);
	}

//	@Override
//	public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) {
//		prefix = properties.getProperty("prefix");
//	}
}
