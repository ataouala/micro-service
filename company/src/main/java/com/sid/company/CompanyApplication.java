package com.sid.company;

import com.sid.company.entities.Societe;
import com.sid.company.repositories.SocieteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class CompanyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(CompanyApplication.class, args);

		SocieteRepository societeRepository = ctx.getBean(SocieteRepository.class);

		Stream.of("A","B", "C").forEach(s->societeRepository.save(new Societe(s)));

		societeRepository.findAll().forEach(s->System.out.println(s));
	}


}
