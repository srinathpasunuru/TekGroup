package com.srinath.ContactApp.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.srinath.ContactApp.Domain.User;
import com.srinath.ContactApp.rm.UserRowMapper;

@Repository // class which contact with the database are given as the repositorys.
public class UserDaoImplementation extends BaseDao implements UserDao {

	@SuppressWarnings("unchecked")
	@Override
	public void save(User u) {
		
		String sql = "Insert into User(name, phone, email, address, loginName, password, role, loginStatus)"
					+ "values(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)";
		//the above are the named parameters which are provided by the user 
		Map map = new HashMap();
		
		map.put("name", u.getName());
		map.put("phone", u.getPhone());
		map.put("email", u.getEmail());
		map.put("address", u.getAddress());
		map.put("loginName", u.getLoginName());
		map.put("password", u.getPassword());
		map.put("role", u.getRole());
		map.put("loginStatus", u.getLoginStatus());
		
		KeyHolder kh = new GeneratedKeyHolder();   //this will hold the auto-generated userId by the database
		SqlParameterSource ps = new MapSqlParameterSource(map);
		super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
		Integer userId = kh.getKey().intValue();
		u.setUserId(userId);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(User u) {
		
		String sql = "update User"
				+" set name=:name,"
				+" phone=:phone,"
				+" email=:email,"
				+" address=:address,"
				+" role=:role,"
				+" loginStatus=:loginStatus"
				+" where userId=:userId";
		
		Map map = new HashMap();
		map.put("name", u.getName());
		map.put("phone", u.getPhone());
		map.put("email", u.getEmail());
		map.put("address", u.getAddress());
		map.put("role", u.getRole());
		map.put("loginStatus", u.getLoginStatus());
		map.put("userId", u.getUserId());
		
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}

	@Override
	public void delete(User u) {
		this.delete(Integer.SIZE);
		
	}

	@Override
	public void delete(Integer userId) {
		
		String sql = "Delete from User where userid=?";
		getJdbcTemplate().update(sql, userId);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public User fingById(Integer userId) {
		
		String sql = "select userId, name, phone, email, address, loginName, role, loginStatus " 
					+"from user where userid=?";
		User u = (User) getJdbcTemplate().queryForObject(sql, new UserRowMapper(), userId);
		return u;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		String sql = "select userId, name, phone, email, address, loginName, role, loginStatus " 
				+"from user";
		/*List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
		return users;*/
		return getJdbcTemplate().query(sql, new UserRowMapper());
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByProperty(String propName, Object propValue) {
		String sql = "select userId, name, phone, email, address, loginName, role, loginStatus " 
				+"from user Where "+propName+"=?";
		
		return getJdbcTemplate().query(sql, new UserRowMapper(), propValue);
	}

}