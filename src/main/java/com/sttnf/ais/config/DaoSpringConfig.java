package com.sttnf.ais.config;

import com.sttnf.ais.dao.KhsDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sttnf.ais.dao.MahasiswaDao;
import com.sttnf.ais.dao.MatakuliahDao;
import com.sttnf.ais.dao.UserDao;
import com.sttnf.ais.dao.impl.KhsDaoImpl;
import com.sttnf.ais.dao.impl.MahasiswaDaoImpl;
import com.sttnf.ais.dao.impl.MatakuliahDaoImpl;
import com.sttnf.ais.service.UserService;


@Configuration
public class DaoSpringConfig {
    
        @Bean
	public MahasiswaDao mahasiswaDao() {
	    return new MahasiswaDaoImpl();
	}
        
        @Bean
	public MatakuliahDao matakuliahDao() {
		return new MatakuliahDaoImpl();
	}
      
        @Bean
	public KhsDao khsDao() {
		return new KhsDaoImpl();
	}
        
        
	@Bean
        public WebMvcConfigurerAdapter corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
            	registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
                .allowedHeaders("*");
            }
        };
    }
}
