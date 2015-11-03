package mk.sav.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import mk.sav.entity.Customer;
import mk.sav.entity.Customer.Gender;

@Component
public class JdbcCustomerManager implements CustomerManager {


	//@Autowired
	JdbcTemplate jdbcTemplate;

	private static Logger LOGGER =  Logger.getLogger(JdbcCustomerManager.class);

	@Autowired
	public JdbcCustomerManager(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

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


	public int addCustomer(Customer customer) {
		LOGGER.debug("into addCustomer");
		String sql = "insert into T_CUSTOMER(NAME, AGE, ADDRESS, EMAIL, FREQUENCY_NEWS, GENDER, RECEIVE_NEWSLETTER) values (?,?,?,?,?,?,?) ";
		int retour = jdbcTemplate.update(sql,
				customer.getName(),
				customer.getAge(),
				customer.getAddress(),
				customer.getEmail(),
				customer.getNewsletterFrequency().toString(),
				customer.getGender().toString(),
				customer.getReceiveNewsletter());

		LOGGER.info("insertion effectuée avec succès ="+retour);
		return retour;
	}

	public List<Customer> getListCustomers() {

		String sql ="select * from T_CUSTOMER";
		
		List<Customer> listCustomers = jdbcTemplate.query(sql, new CustomersMapper());
		for (Customer customer : listCustomers) {
			LOGGER.info("customer name ="+customer.getName());
		}
		
		return listCustomers;

		//return null;

	}


	class CustomersMapper implements RowMapper<Customer> {
		
		public Customer mapRow(ResultSet rs, int i) throws SQLException {
			Customer customer = new Customer();
			customer.setName(rs.getString("NAME"));
			customer.setAge(rs.getString("AGE"));
			customer.setAddress(rs.getString("ADDRESS"));
			customer.setEmail(rs.getString("EMAIL"));
			customer.setGender(Gender.valueOf(rs.getString("GENDER")));
			//customer.set
			return customer;
		}}



}
