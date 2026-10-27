package com.kodewala.String4;

public class QueryGenerator {
	public StringBuilder generateQuery(String empId,int salary) {
		StringBuilder query = new StringBuilder("Select * from employee");//created sb object
		
		if (salary > 0) {
			query.append(" where salary is " + salary + ";"); //modifying existing content
		}
		else if (empId != null) {
			query.append(" where empId is " + empId + ";"); //modifying existing content
		}
		else {
			query.append(";");
		}
		return query;
	}

}
