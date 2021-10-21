package com.springbatch.projetobatch.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintWriter {

	
		public ItemWriter<String> printWriter() {
			return itens -> itens.forEach(System.out::println);
		}
}
