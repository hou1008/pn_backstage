package cn.bdqn.pn_backstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.pn_backstage.dao")
public class PnBackstageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PnBackstageApplication.class, args);
	}

}
