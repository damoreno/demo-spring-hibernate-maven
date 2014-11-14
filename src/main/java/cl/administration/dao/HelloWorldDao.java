package cl.administration.dao;

import cl.administration.model.HelloWorld;

public interface HelloWorldDao {

	void save(HelloWorld helloWorld);
	void update(HelloWorld helloWorld);
	void delete(HelloWorld helloWorld);
	HelloWorld findByHelloWorldCode(String helloWorldCode);
}
