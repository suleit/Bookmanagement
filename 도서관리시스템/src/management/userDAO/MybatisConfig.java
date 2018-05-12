package management.userDAO;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	
	private static SqlSessionFactory sqlsf; 
	
	static {
		String resource="Mybatis_config.xml";
		
		try {
			Reader reader= Resources.getResourceAsReader(resource);
			sqlsf=new SqlSessionFactoryBuilder().build(reader);
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSessionFactory() {
		return sqlsf;
		
	}

}
