package mk.sav.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import mk.sav.internal.CustomerManager;
import mk.sav.internal.JpaCustomerManager;

@Configuration
@ComponentScan("mk.sav.repo")
@Profile("jpa")
public class AppConfigJPA {

	
	@Autowired
	DataSource dataSource;

	@Bean
	public LocalContainerEntityManagerFactoryBean EntityManagerFactory(){
		
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabase(Database.HSQL);
		
		Properties props= new Properties();
		props.setProperty("hibernate.format_sql", "true");
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(dataSource);
		emfb.setPackagesToScan("mk.sav.entity");
		emfb.setJpaProperties(props);
		emfb.setJpaVendorAdapter(adapter);
		
		return emfb;
	}
	

	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
		
		return new JpaTransactionManager(emf);
	}
	
	@Bean
	public CustomerManager customerManager(){
		return new JpaCustomerManager();
		
		
	}

	
}
