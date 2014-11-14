package cl.administration.service;

import cl.administration.model.HelloWorld;

public interface HelloWorldService {

	void save(HelloWorld helloWorld);
	void update(HelloWorld helloWorld);
	void delete(HelloWorld helloWorld);
	HelloWorld findByHelloWorldCode(String helloWorldCode);
}
