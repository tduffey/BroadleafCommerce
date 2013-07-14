package org.broadleafcommerce.openadmin.server.service.persistence.rebalance;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Jeff Fischer
 */
@Component("blMySqlRebalanceDialect")
public class MySqlRebalanceDialect implements RebalanceDialect {

    @Override
    public boolean canHandle(Dialect hibernateDialect) {
        return hibernateDialect instanceof MySQLDialect;
    }

    @Override
    public String[] createRebalanceQuery(String tableName, String sortColumn, String whereClause, BigDecimal startValue, BigDecimal increment) {
        String[] response = new String[2];
        StringBuilder sb = new StringBuilder();
        sb.append("SET @i=");
        sb.append(startValue.toString());
        sb.append(";");
        response[0] = sb.toString();
        sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(tableName);
        sb.append(" SET ");
        sb.append(sortColumn);
        sb.append(" = (@i:=@i+");
        sb.append(increment.toString());
        sb.append(")");
        if (!StringUtils.isEmpty(whereClause)) {
            if (!whereClause.toUpperCase().trim().startsWith("WHERE")) {
                sb.append(" WHERE");
            }
            sb.append(" ");
            sb.append(whereClause.trim());
        }
        sb.append(";");
        response[1] = sb.toString();
        return response;
    }
}
