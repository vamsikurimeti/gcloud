package com;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.entity.Book;

@SpringBootApplication
public class GcloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcloudFunctionApplication.class, args);
	}
	
	@Bean
	public Function<String,String> reverse(){
		return (input)-> new StringBuilder(input).reverse().toString();
	}
	
	@Bean
	public Supplier<Book> getBook(){
		return ()->new Book(101,"java");
	}
	
	@Bean
	public Consumer<String> getMessage(){
		return(input) -> System.out.println(input);
	}

}
