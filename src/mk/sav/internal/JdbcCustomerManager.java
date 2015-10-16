package mk.sav.internal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerManager implements CustomerManager {


	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcCustomerManager() {

		Logger.getLogger(getClass()).info("Created JdbcCustomerManager");
	}

	@Override
	public String getCustomerName() {
		
		String sql = "select NAME from T_CUSTOMER";
		return jdbcTemplate.queryForObject(sql ,String.class);
	}
	
	
}
