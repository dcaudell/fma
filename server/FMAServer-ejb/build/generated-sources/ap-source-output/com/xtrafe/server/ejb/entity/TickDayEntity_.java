package com.xtrafe.server.ejb.entity;

import com.xtrafe.server.ejb.entity.StockEntity;
import com.xtrafe.server.ejb.entity.TickEntity;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-20T16:38:22")
@StaticMetamodel(TickDayEntity.class)
public class TickDayEntity_ { 

    public static volatile SingularAttribute<TickDayEntity, Long> id;
    public static volatile SingularAttribute<TickDayEntity, Double> previousClose;
    public static volatile SingularAttribute<TickDayEntity, Double> peRatio;
    public static volatile SingularAttribute<TickDayEntity, StockEntity> stockEntity;
    public static volatile SingularAttribute<TickDayEntity, String> mktCap;
    public static volatile CollectionAttribute<TickDayEntity, TickEntity> ticks;
    public static volatile SingularAttribute<TickDayEntity, Double> earns;
    public static volatile SingularAttribute<TickDayEntity, Calendar> tickDayDate;
    public static volatile SingularAttribute<TickDayEntity, String> annRange;

}