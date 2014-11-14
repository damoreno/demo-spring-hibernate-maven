package cl.administration.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cl.administration.dao.HelloWorldDao;
import cl.administration.model.HelloWorld;

@Repository("HelloWorldDao")
public class HelloWorldDaoImpl implements HelloWorldDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(HelloWorld helloWorld) {
		sessionFactory.getCurrentSession().persist(helloWorld);
		//getHibernateTemplate().save(helloWorld);		
	}

	public void update(HelloWorld helloWorld) {
		sessionFactory.getCurrentSession().update(helloWorld);
		//getHibernateTemplate().update(helloWorld);		
	}

	public void delete(HelloWorld helloWorld) {
		sessionFactory.getCurrentSession().delete(helloWorld);
		//getHibernateTemplate().delete(helloWorld);		
	}

	public HelloWorld findByHelloWorldCode(String helloWorldCode) {
		//List<HelloWorld> list = sessionFactory.getCurrentSession().find(
           //     "from HelloWorldTable where helloWorldCode=?",helloWorldCode
          // );
	return null;
		//return (HelloWorld)list.get(0);
	}

}
