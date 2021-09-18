package com.sap.olingo.jpa.metadata.api;

import java.util.List;
import java.util.Map;

import javax.persistence.metamodel.ManagedType;

import com.sap.olingo.jpa.metadata.core.edm.mapper.exception.ODataJPAModelException;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediateEntityContainerAccess;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediateEntitySetAccess;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediateEntityTypeAccess;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediateNavigationPropertyAccess;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediatePropertyAccess;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extention.IntermediateReferenceList;

import org.apache.olingo.commons.api.edm.provider.CsdlNavigationProperty;
import org.apache.olingo.commons.api.edm.provider.CsdlProperty;
import org.apache.olingo.commons.api.edm.provider.CsdlPropertyRef;

public abstract class JPAEdmMetadataPostProcessor {

  public List<CsdlProperty> customizeProperties(
    ManagedType<?> jpaManagedType,
    List<CsdlProperty> properties,
    Map<String, String> nameMap
  ) {
    return properties;
  }

  public List<CsdlNavigationProperty> customizeNavigationProperties(
    ManagedType<?> jpaManagedType,
    List<CsdlNavigationProperty> properties,
    Map<String, String> nameMap
  ) {
    return properties;
  }

  public List<CsdlPropertyRef> customizeKey(
    ManagedType<?> jpaManagedType,
    List<CsdlPropertyRef> properties,
    Map<String, String> nameMap
  ) {
    return properties;
  }

  public void processEntityContainer(final IntermediateEntityContainerAccess container) {}

  public abstract void processEntityType(final IntermediateEntityTypeAccess entityType);

  public void processEntitySet(final IntermediateEntitySetAccess entitySet) {}

  public abstract void processNavigationProperty(final IntermediateNavigationPropertyAccess property,
      final String jpaManagedTypeClassName);

  /**
   *
   * @param property
   * @param jpaManagedTypeClassName
   * @return
   */
  public abstract void processProperty(final IntermediatePropertyAccess property, final String jpaManagedTypeClassName);

  public abstract void provideReferences(final IntermediateReferenceList references) throws ODataJPAModelException;
}
