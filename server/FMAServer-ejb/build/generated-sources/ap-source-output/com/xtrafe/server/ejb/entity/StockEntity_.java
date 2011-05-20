package com.xtrafe.server.ejb.entity;

import com.xtrafe.server.ejb.entity.TickDayEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-20T16:38:22")
@StaticMetamodel(StockEntity.class)
public class StockEntity_ { 

    public static volatile SingularAttribute<StockEntity, Long> id;
    public static volatile SingularAttribute<StockEntity, String> symbol;
    public static volatile SingularAttribute<StockEntity, String> name;
    public static volatile CollectionAttribute<StockEntity, TickDayEntity> tickDays;

}