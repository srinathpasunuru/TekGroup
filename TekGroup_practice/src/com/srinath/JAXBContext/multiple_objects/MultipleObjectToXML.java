package com.srinath.JAXBContext.multiple_objects;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MultipleObjectToXML {

	public static void main(String[] args) {
		
		Employees employees = new Employees();
		List list = new ArrayList();
		
		Employee emp1 = new Employee(123, "srinath");
		Employee emp2 = new Employee(124, "ramakanth");
		Employee emp3 = new Employee(125, "akhil");
		Employee emp4 = new Employee(126, "vineeth");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		employees.setEmployees(list);
		
		File file = new File("src\\com\\srinath\\JAXBContext\\multiple_objects\\employees.xml");
		
		try {
			JAXBContext context = JAXBContext.newInstance(Employees.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(employees, file);
			System.out.println("marshalling multiple objects is completed");
		}
		catch(JAXBException e) {
			e.printStackTrace();
		}
		
		try {
			
			JAXBContext context = JAXBContext.newInstance(Employees.class);
			Unmarshaller unmarshall = context.createUnmarshaller();
			Object employees_list = unmarshall.unmarshal(file);
			System.out.println(employees_list);
		}
		catch(JAXBException e) {
			e.printStackTrace();
		}

	}

}
