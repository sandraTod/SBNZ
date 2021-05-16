package com.sbnz.sbnzBackend;

import java.util.ArrayList;
import java.util.Collection;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sbnz.sbnzBackend.model.MeatType;
import com.sbnz.sbnzBackend.model.UserIngredients;
import com.sbnz.sbnzBackend.model.Wine;

@SpringBootApplication
public class SbnzprojectApplication {
	

	@Bean
    public KieContainer kieContainer() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.newKieContainer(ks.newReleaseId("drools.spring.rules","drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieScanner kScanner = ks.newKieScanner(kContainer);
		kScanner.start(10_000);
		KieSession kSession =  kContainer.newKieSession("test-session");
		
		//kSession.insert();
		//kSession.fireAllRules();
		return kContainer;
    }

	public static void main(String[] args) {
		SpringApplication.run(SbnzprojectApplication.class, args);
	}
	
	
}
