package com.srinath.JAXBContext.multiple_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

		public int empid;
		public String name;
		
		public Employee(int empid, String name) {
			super();
			this.empid = empid;
			this.name = name;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Employee() {
			super();
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + "]";
		}
		
		
}
