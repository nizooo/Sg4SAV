package mk.sav.internal;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import mk.sav.entity.Customer;

public class JdbcCustomerManager implements CustomerManager {


	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static Logger LOGGER =  Logger.getLogger(JdbcCustomerManager.class);
	
	public JdbcCustomerManager() {

	
	}

	@Override
	public String getCustomerName() {
		
		String sql = "select NAME from T_CUSTOMER";
		//return jdbcTemplate.queryForObject(sql ,String.class);
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		String signleName = null;
		for (Map row : rows) {
			
			signleName = (String) row.get("NAME");
		}
		return signleName;
				
	}

	@Override
	public boolean addCustomer(Customer customer) {
		LOGGER.debug("into addCustomer");
		//jdbcTemplate.up
		jdbcTemplate.execute("drop table if exists T_CUSTOMER ");
        jdbcTemplate.execute("create table T_CUSTOMER(ID SERIAL primary key,NUMBER varchar(9), NAME varchar(50) not null )");
        jdbcTemplate.execute("insert into T_CUSTOMER (NUMBER, NAME) values ('454544', 'AHMED')");
		jdbcTemplate.execute("insert into T_CUSTOMER (NUMBER, NAME) values ('959598', 'NIZAR')");
		jdbcTemplate.execute("insert into T_CUSTOMER (NUMBER, NAME) values ('896548', 'MOGHZEL')");
		return false;
	}
	
	
}
