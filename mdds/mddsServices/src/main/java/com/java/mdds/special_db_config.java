package com.java.mdds;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  entityManagerFactoryRef = "entityManagerFactory",
  basePackages = { "com.java.mdds.special.repo" }
)
public class special_db_config {
  
	  @Bean(name = "barDataSource")
	  @ConfigurationProperties(prefix = "special.datasource")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }

	  @Bean(name = "barEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
	      EntityManagerFactoryBuilder builder, @Qualifier("barDataSource") DataSource dataSource) {
	    return builder.dataSource(dataSource).packages("com.java.mdds.special.entity")
	        .build();
	  }

	  @Bean(name = "barTransactionManager")
	  public PlatformTransactionManager barTransactionManager(
	      @Qualifier("barEntityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
	    return new JpaTransactionManager(barEntityManagerFactory);
	  }
}
