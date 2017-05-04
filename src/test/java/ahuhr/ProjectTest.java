package ahuhr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhf.ahuhr.dao.CaseDao;
import com.dhf.ahuhr.entity.User;
import com.dhf.ahuhr.exception.CaseException;
import com.dhf.ahuhr.exception.UserException;
import com.dhf.ahuhr.service.CaseService;
import com.dhf.ahuhr.service.UserService;


public class ProjectTest {
	
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
	}
	
	@Test
	public void testDataSource() throws Exception{
		DataSource ds = ctx.getBean("dataSource",DataSource.class);
		Connection connection =  ds.getConnection();
		String sql = "select 'Hello World!' as s ";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			System.out.println( rs.getString("s"));
        } 
		connection.close();
	}
	
	@Test
	public void testLogin() throws UserException{
		UserService us = ctx.getBean("userService",UserService.class);
		String code = "hong";
		String pwd = "123";
		User user = us.login(code, pwd);
		System.out.println(user);
	}
	
	@Test
	public void testFinfMyRecListByUserId(){
		CaseDao caseDao = ctx.getBean("caseDao",CaseDao.class);
		int userId = 1;
		List<Map<String, Object>> list = caseDao.findRecListByUserId(userId);
		System.out.println(list);
	}
	
	@Test
	public void testGetMyRecList() throws CaseException{
		CaseService cs = ctx.getBean("caseService",CaseService.class);
		int userId = 1;
		List<Map<String, Object>> list = cs.getMyRecList(userId);
		System.out.println(list);
	}
	
	
}
