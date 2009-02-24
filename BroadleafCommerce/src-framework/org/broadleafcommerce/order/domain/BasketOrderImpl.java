package org.broadleafcommerce.order.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "TYPE")
@DiscriminatorValue("BASKET")
public class BasketOrderImpl extends OrderImpl implements BasketOrder, Serializable {

    private static final long serialVersionUID = 1L;
}
