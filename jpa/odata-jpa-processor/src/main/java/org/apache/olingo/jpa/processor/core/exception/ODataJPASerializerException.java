package org.apache.olingo.jpa.processor.core.exception;

import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.jpa.metadata.core.edm.mapper.exception.ODataJPAMessageKey;

/*
 * Copied from org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPAModelException
 * See also org.apache.olingo.odata2.jpa.processor.core.exception.ODataJPAMessageServiceDefault
 */
public class ODataJPASerializerException extends ODataJPAProcessException {
  /**
   * 
   */
  private static final long serialVersionUID = -7188499882306858747L;

  public static enum MessageKeys implements ODataJPAMessageKey {
    RESULT_NOT_FOUND,
    NOT_SUPPORTED_RESOURCE_TYPE;

    @Override
    public String getKey() {
      return name();
    }

  }

  private static final String BUNDEL_NAME = "exceptions-i18n";

  public ODataJPASerializerException(Throwable e, final HttpStatusCode statusCode) {
    super(e, statusCode);
  }

  public ODataJPASerializerException(final MessageKeys messageKey, final HttpStatusCode statusCode,
      final Throwable cause, final String... params) {
    super(messageKey.getKey(), statusCode, cause, params);
  }

  public ODataJPASerializerException(final MessageKeys messageKey, final HttpStatusCode statusCode) {
    super(messageKey.getKey(), statusCode);
  }

  public ODataJPASerializerException(final MessageKeys messageKey, final HttpStatusCode statusCode,
      final String... params) {
    super(messageKey.getKey(), statusCode, params);
  }

  public ODataJPASerializerException(final MessageKeys messageKey, final HttpStatusCode statusCode, final Throwable e) {
    super(messageKey.getKey(), statusCode, e);
  }

  @Override
  protected String getBundleName() {
    return BUNDEL_NAME;
  }

}
