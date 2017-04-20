package com.sqw.conf;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sqw.util.DbConstanst;

@Configuration
@ComponentScan(basePackages={"com.odyz.dao"} ,excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig {
	@Bean
	public DataSource dataSource() {

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(DbConstanst.DBDRIVER);
		ds.setUrl(DbConstanst.DBURL);
		ds.setUsername(DbConstanst.USERNAME);
		ds.setPassword(DbConstanst.PWD);
		return ds;
	}
	
	
	@Bean
	public JdbcTemplate jdbc(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
		
}
