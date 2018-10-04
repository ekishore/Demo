package com.nareshit.jaxb.domain;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshallTest {
public static void main(String[] args) {
	try {
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Employee emp=(Employee)unmarshaller.unmarshal(new File("employee.xml"));
		System.out.println(emp.getEmpno()+" "+emp.getName()+" "+emp.getSalary());
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
