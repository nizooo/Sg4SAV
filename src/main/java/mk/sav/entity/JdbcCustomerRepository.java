package mk.sav.entity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerRepository extends CustomerRepository {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcCustomerRepository(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
		
	}
	
	private String getFirstCustomerName(String id){
		
		String sql = "select NAME from T_CUSTOMER";
		return jdbcTemplate.queryForObject(sql, String.class);
		
	}
	
	
	

}
