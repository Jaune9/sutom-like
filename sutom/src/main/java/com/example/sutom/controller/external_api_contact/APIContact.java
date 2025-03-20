package com.example.sutom.controller.external_api_contact;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

public class APIContact {
    
	private final RestClient restClient;

	public APIContact(RestClient.Builder restClientBuilder) {
		this.restClient = restClientBuilder.baseUrl("https://catfact.ninja").build();
	}

	public String someRestCall(String name) {
		return this.restClient.get().uri("/fact").retrieve().body(null);
	}

}
