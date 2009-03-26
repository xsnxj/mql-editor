package org.pentaho.commons.metadata.mqleditor;

import java.io.Serializable;
import java.util.List;

/**
 * Represents a Metadata Domain object containing Metadata Models {@see MqlModel}
 *
 *
 * @param <T>
 */
public interface MqlDomain<T extends MqlModel> extends Serializable{

  public String getId();

  public String getName();

  public List<T> getModels();

}
