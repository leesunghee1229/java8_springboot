package com.example;

import com.example.Board.SosiRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DemoApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		SosiRepository sosiRepository = context.getBean(SosiRepository.class);

//		sosiRepository.save(new Sosi("태연"));
//		sosiRepository.save(new Sosi("윤아"));
//		sosiRepository.save(new Sosi("수영"));
//		sosiRepository.save(new Sosi("효연"));
//		sosiRepository.save(new Sosi("유리"));
//		sosiRepository.save(new Sosi("티파니"));
//		sosiRepository.save(new Sosi("써니"));
//		sosiRepository.save(new Sosi("서현"));
//		Hibernate: insert into sosi (name) values (?)


	}
}
