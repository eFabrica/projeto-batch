package com.springbatch.projetobatch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class EvenOrOddJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Bean
	public Job printEvenOrOddJob(Step printevenOrOddStep) {
		return jobBuilderFactory
				.get("printEvenOrOddJob")
				.start(printevenOrOddStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}
	
}
