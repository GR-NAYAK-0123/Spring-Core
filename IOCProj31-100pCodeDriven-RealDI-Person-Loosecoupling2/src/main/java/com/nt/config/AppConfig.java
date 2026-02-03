package com.nt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource(value = "com/nt/cfgs/applicationContext.xml")
@PropertySource(value = "com/nt/commons/Info.properties")
public class AppConfig {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.minimumIdle}")
	private Integer minimumIdle;
	@Value("${jdbc.maximumPoolSize}")
	private Integer maximumPoolSize;
	@Value("${jdbc.idleTimeout}")
	private Integer idleTimeout;
	
	@Bean("hkds")
	public HikariDataSource getHDS() {
		HikariDataSource source = new HikariDataSource();
		source.setDriverClassName(driver);
		source.setJdbcUrl(url);
		source.setUsername(username);
		source.setPassword(password);
		source.setMinimumIdle(minimumIdle);
		source.setMaximumPoolSize(maximumPoolSize);
		source.setIdleTimeout(idleTimeout);
		return source;
	}
}
