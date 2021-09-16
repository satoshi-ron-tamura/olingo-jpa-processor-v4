package com.sap.olingo.jpa.processor.core.api;

import java.util.List;

import javax.persistence.criteria.Selection;

import com.sap.olingo.jpa.processor.core.database.JPAODataDatabaseSearch;
import com.sap.olingo.jpa.processor.core.database.JPAODataDatabaseTableFunction;

/**
 * Interface is in a beta state
 * @author Oliver Grande
 *
 */
public interface JPAODataDatabaseProcessor extends JPAODataDatabaseSearch, JPAODataDatabaseTableFunction {
  default List<Selection<?>> customizeSelection(List<Selection<?>> selections) {
    return selections;
  }
}
