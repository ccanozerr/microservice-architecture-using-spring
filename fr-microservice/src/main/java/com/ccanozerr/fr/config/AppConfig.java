package com.ccanozerr.fr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ccanozerr.fr.application.FrApplication;
import com.ccanozerr.fr.application.business.StandardFrApplication;
import com.ccanozerr.fr.domain.metadata.annotations.EventPublisher;
import com.ccanozerr.fr.repository.FootballerRepository;

@Configuration
public class AppConfig {

	@Bean
	public FrApplication frApp(FootballerRepository footballerRepository, EventPublisher eventPublisher) {
		return new StandardFrApplication(footballerRepository, eventPublisher);
	}

}