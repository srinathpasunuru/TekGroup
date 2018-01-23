package com.srinath.JAXBContext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	public int id;
	public String name;
	
	//@XmlElement  (this can be used instead of @XmlAccessorType(XmlAccessType.FIELD))
	public int getId() {
		return id;
	}
	//@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	//@XmlElement  (this can be used instead of @XmlAccessorType(XmlAccessType.FIELD))
	public String getName() {
		return name;
	}
	
	//@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
