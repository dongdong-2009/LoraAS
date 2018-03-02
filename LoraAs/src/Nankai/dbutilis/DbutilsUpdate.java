package Nankai.dbutilis;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbutilsUpdate {
	/*
	 * DBUTils方法实现增删改查
	 * 
	 * */
	QueryRunner runner=new QueryRunner(new ComboPooledDataSource());
	
	
}
