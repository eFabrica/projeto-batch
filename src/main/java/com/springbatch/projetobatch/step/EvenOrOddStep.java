package com.springbatch.projetobatch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.projetobatch.processor.EvenOrOddProcessor;
import com.springbatch.projetobatch.reader.CountReader;
import com.springbatch.projetobatch.writer.PrintWriter;

@Configuration
public class EvenOrOddStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step printEvenOrOddStep(CountReader countReader, EvenOrOddProcessor evenOrOddProcessor, PrintWriter printWriter) {
		return stepBuilderFactory
				.get("printEvenOrOddStep")
				.<Integer, String>chunk(1)
				.reader(countReader.countReader())
				.processor(evenOrOddProcessor.evenOrOddProcessor())
				.writer(printWriter.printWriter())
				.build();
		
	}
 	
}
