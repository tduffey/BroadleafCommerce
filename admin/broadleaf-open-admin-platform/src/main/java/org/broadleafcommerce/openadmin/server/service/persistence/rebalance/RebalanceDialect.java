package org.broadleafcommerce.openadmin.server.service.persistence.rebalance;

import org.hibernate.dialect.Dialect;

import java.math.BigDecimal;

/**
 * @author Jeff Fischer
 */
public interface RebalanceDialect {

    public boolean canHandle(Dialect hibernateDialect);

    public String[] createRebalanceQuery(String tableName, String sortColumn, String whereClause, BigDecimal startValue, BigDecimal increment);

}
