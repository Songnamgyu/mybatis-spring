package com.greedy.chap01.section01.connection.javaconfig.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.greedy.chap01.section01.connection.javaconfig")
@PropertySource("connection-info.properties")
public class ContextConfiguration {

	@Value("${oracle.dev.driver}")
	private String driver;
	
	@Value("${oracle.dev.url}")
	private String url;
	
	@Value("${oracle.dev.username}")
	private String username;
	
	@Value("${oracle.dev.password}")
	private String password;
	
	//DB정보를 가지고있는 DataSource를만들고 이걸 Bean으로 설정한다.
	//
	@Bean(destroyMethod = "close")
	public BasicDataSource dataSource() {
		
		//1. 인스턴스를 먼저 생성
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDefaultAutoCommit(false);
	
		return dataSource;	
	}
	
	//SqlSession을 사용하기위해서는 먼저 SqlSessionFactory가 먼저 필요
	
	@Bean
	//SqlSession생성을 위한 Factory 설정
	// 컨테이너 객체를 넣어가지구 빈생성할떄 호출을해준다
	public SqlSessionFactory sqlSessionFactory(ApplicationContext context) throws Exception {
		//sqlSessionFactory와 똑같지만 하지만 자동으로 Bean으로 설정해서 사용할 수있는 Spring과 연동해서 쓰는 
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		
		//데이터 소스전달역할, 데어트소스를 반환하는 데이터 소스메소드 호출
		factoryBean.setDataSource(dataSource());
		
		//sqlSessionFactory를 구성할때 mybatis추가 설정파일을 별도로 mybatis-config.xml로 만든다음 이걸 불러다가 sqlSessionFactory를 만들었다
		//container를 사용하게되면 조금더 쉽게 위치에 리소스를 얻어가지고올수있다
		//우리가 생성하는 컨테이너를 bean생성할떄에도 쓸수 있다
		//context에있는 getResource라는 메소드가 classPath에있는 경로를 문자열로 반환해주면 문자열을 자동적으로 Resource로 변환 
		//Resource를 바탕으로 configuration으로 등록할수 있는기능 제공
		factoryBean.setConfigLocation(context.getResource("com/greedy/chap01/section01/connection/javaconfig/config/mybatis-config.xml"));
		
		//sqlSessionFactoryBean을 sqlSessionFactory로 바꿔주는 메소드
		return factoryBean.getObject();
	}
	
	@Bean
	//mabatis-spring api 힌마디로 SqlSession을 spring에서 사용할 수 있게하는 메소드
	public SqlSessionTemplate sqlSessionTemplate(ApplicationContext context) throws Exception {
		
		//SqlSession을 반환해주기,sqlSessionFactory반드시넣어주기 >> 이걸넣음으로 반환 해주는 역할
		return new SqlSessionTemplate(sqlSessionFactory(context));
	}
}
