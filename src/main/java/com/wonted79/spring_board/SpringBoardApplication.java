package com.wonted79.spring_board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wonted79.spring_board.repository")
public class SpringBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoardApplication.class, args);
	}

}
