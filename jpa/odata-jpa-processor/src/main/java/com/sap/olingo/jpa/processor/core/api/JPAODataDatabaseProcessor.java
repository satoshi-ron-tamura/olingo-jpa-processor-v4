package com.sap.olingo.jpa.processor.core.api;

import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;

import com.sap.olingo.jpa.metadata.core.edm.mapper.api.JPAEntityType;
import com.sap.olingo.jpa.metadata.core.edm.mapper.api.JPAPath;
import com.sap.olingo.jpa.processor.core.database.JPAODataDatabaseSearch;
import com.sap.olingo.jpa.processor.core.database.JPAODataDatabaseTableFunction;

/**
 * Interface is in a beta state
 * @author Oliver Grande
 *
 */
public interface JPAODataDatabaseProcessor extends JPAODataDatabaseSearch, JPAODataDatabaseTableFunction {
  default Collection<JPAPath> customizeSelectionPath(
      final CriteriaBuilder cb,
      final CriteriaQuery<?> cq,
      final From<?, ?> root,
      final JPAEntityType entityType,
      final Collection<JPAPath> selectionPath
  ) {
      return selectionPath;
  }
}
