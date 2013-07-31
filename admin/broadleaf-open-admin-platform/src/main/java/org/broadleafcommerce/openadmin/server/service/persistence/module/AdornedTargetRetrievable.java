package org.broadleafcommerce.openadmin.server.service.persistence.module;

import org.broadleafcommerce.openadmin.dto.AdornedTargetList;
import org.broadleafcommerce.openadmin.dto.CriteriaTransferObject;
import org.broadleafcommerce.openadmin.dto.Entity;
import org.broadleafcommerce.openadmin.dto.PersistencePackage;

/**
 * @author Jeff Fischer
 */
public interface AdornedTargetRetrievable {

    public AdornedTargetListPersistenceModule.AdornedTargetRetrieval getAdornedTargetRetrieval(PersistencePackage persistencePackage, Entity entity, AdornedTargetList adornedTargetList);

    public AdornedTargetListPersistenceModule.AdornedTargetRetrieval getAdornedTargetRetrieval(PersistencePackage persistencePackage, AdornedTargetList adornedTargetList, CriteriaTransferObject cto);
}
