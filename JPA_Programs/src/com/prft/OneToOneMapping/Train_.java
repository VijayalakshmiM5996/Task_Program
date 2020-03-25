package com.prft.OneToOneMapping;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-02-21T10:09:55.207+0530")
@StaticMetamodel(Train.class)
public class Train_ {
	public static volatile SingularAttribute<Train, Integer> Train_id;
	public static volatile SingularAttribute<Train, String> Train_name;
	public static volatile SingularAttribute<Train, Passenger> pass;
}
