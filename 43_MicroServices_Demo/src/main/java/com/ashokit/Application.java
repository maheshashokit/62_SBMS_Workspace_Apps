package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/*public Mono<Map<String, String>> reactiveParallel() {
	    WebClient client = webClientBuilder.build();

	    Mono<String> call1 = client.get().uri("http://service1/api").retrieve().bodyToMono(String.class);
	    Mono<String> call2 = client.get().uri("http://service2/api").retrieve().bodyToMono(String.class);

	    return Mono.zip(call1, call2)
	               .map(tuple -> {
	                   Map<String, String> result = new HashMap<>();
	                   result.put("api1", tuple.getT1());
	                   result.put("api2", tuple.getT2());
	                   return result;
	               });
	}*/

}
