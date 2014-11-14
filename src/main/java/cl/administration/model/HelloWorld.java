package cl.administration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HELLOWORLDTABLE")

public class HelloWorld implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;
	@Column(name = "CODE", unique = true, nullable = false, length = 10)
	private String code;
	@Column(name = "NAME", unique = true, nullable = false, length = 10)
	private String name;
 
	public HelloWorld() {
	}
 
	public HelloWorld(String code, String name) {
		this.code = code;
		this.name = name;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
