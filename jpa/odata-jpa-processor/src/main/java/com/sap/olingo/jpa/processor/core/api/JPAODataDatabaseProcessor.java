package com.sap.olingo.jpa.processor.core.api;

import java.util.Set;

import javax.persistence.criteria.CriteriaQuery;

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
  default Set<JPAPath> customizeSelectionPath(
      final CriteriaQuery<?> cq,
      final JPAEntityType entityType,
      final Set<JPAPath> selectionPath
  ) {
      return selectionPath;
  }
}
