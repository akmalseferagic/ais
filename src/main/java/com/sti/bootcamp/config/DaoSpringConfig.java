package com.sti.bootcamp.config;

import com.sti.bootcamp.dao.KhsDao;
import com.sti.bootcamp.dao.impl.KhsDaoImpl;
import com.sti.bootcamp.dao.DosenpaDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sti.bootcamp.dao.MahasiswaDao;
import com.sti.bootcamp.dao.MatakuliahDao;
import com.sti.bootcamp.dao.ProdiDao;
import com.sti.bootcamp.dao.SemesterDao;
import com.sti.bootcamp.dao.impl.DosenpaDaoImpl;
import com.sti.bootcamp.dao.impl.MahasiswaDaoImpl;
import com.sti.bootcamp.dao.impl.MatakuliahDaoImpl;
import com.sti.bootcamp.dao.impl.ProdiDaoImpl;
import com.sti.bootcamp.dao.impl.SemesterDaoImpl;

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
	public ProdiDao prodiDao() {
		return new ProdiDaoImpl();
	}
        
        @Bean
	public DosenpaDao dosenpaDao() {
		return new DosenpaDaoImpl();
	}
        
        @Bean
	public SemesterDao semesterDao() {
		return new SemesterDaoImpl();
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
