package com.xtrafe.server.ejb.entity;

import com.xtrafe.server.ejb.entity.TickDayEntity;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-20T16:38:22")
@StaticMetamodel(TickEntity.class)
public class TickEntity_ { 

    public static volatile SingularAttribute<TickEntity, Long> id;
    public static volatile SingularAttribute<TickEntity, String> percentageChange;
    public static volatile SingularAttribute<TickEntity, Double> previous;
    public static volatile SingularAttribute<TickEntity, Double> change;
    public static volatile SingularAttribute<TickEntity, Calendar> tickTime;
    public static volatile SingularAttribute<TickEntity, Long> volume;
    public static volatile SingularAttribute<TickEntity, TickDayEntity> tickDayEntity;
    public static volatile SingularAttribute<TickEntity, Double> high;
    public static volatile SingularAttribute<TickEntity, Double> low;

}