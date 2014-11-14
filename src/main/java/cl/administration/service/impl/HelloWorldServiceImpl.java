package cl.administration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.administration.dao.HelloWorldDao;
import cl.administration.model.HelloWorld;
import cl.administration.service.HelloWorldService;

@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	private HelloWorldDao helloWorldDao;

	public HelloWorldDao getHelloWorldDao() {
		return helloWorldDao;
	}

	public void setHelloWorldDao(HelloWorldDao helloWorldDao) {
		this.helloWorldDao = helloWorldDao;
	}

	@Transactional
	public void save(HelloWorld helloWorld) {
		helloWorldDao.save(helloWorld);
		
	}

	@Transactional
	public void update(HelloWorld helloWorld) {
		helloWorldDao.update(helloWorld);
		
	}

	@Transactional
	public void delete(HelloWorld helloWorld) {
		helloWorldDao.delete(helloWorld);
		
	}

	@Transactional
	public HelloWorld findByHelloWorldCode(String helloWorldCode) {
		return helloWorldDao.findByHelloWorldCode(helloWorldCode);
	}
	
	
}
