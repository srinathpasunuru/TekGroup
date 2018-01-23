package com.srinath.JAXBContext;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class StudentJAXB {

	public static void main(String args[]) {
		
		Student student1 = new Student(111, "srinath");
		
		File file = new File("src\\com\\srinath\\JAXBContext\\student.xml");
		try {
			
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(student1, file);
			System.out.println("Marshalling done");
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		try {
			
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshall = context.createUnmarshaller();
			Student student = (Student) unmarshall.unmarshal(file);
			System.out.println(student);
			
		}
		catch(JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
