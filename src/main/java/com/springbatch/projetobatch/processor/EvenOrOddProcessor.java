package com.springbatch.projetobatch.processor;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EvenOrOddProcessor {
	
	@StepScope
	@Bean
	public FunctionItemProcessor<Integer, String> evenOrOddProcessor() {
		return new FunctionItemProcessor<Integer, String>
		(item -> item % 2 == 0 ? String.format("Item %s é Par", item) : String.format("Item %s é Ímpar", item));
	}

}
