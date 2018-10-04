package com.nareshit.jaxb.domain;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallTest_1 {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpno(104);
	emp.setName("kranthi");
	emp.setSalary(35000);
	try {
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		Marshaller marshaller=context.createMarshaller();
		StringWriter writer=new StringWriter();
		marshaller.marshal(emp, writer);
		String xml=writer.toString();
		System.out.println(xml);
	} catch (JAXBException e) {
		e.printStackTrace();
	}
}
}
