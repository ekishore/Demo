package com.nareshit.jaxb.domain;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpno(102);
		emp.setName("kishu");
		emp.setSalary(20000);
		try {
			JAXBContext context=JAXBContext.newInstance(Employee.class);
			Marshaller marshaller=context.createMarshaller();
			marshaller.marshal(emp, new File("employee.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
}
