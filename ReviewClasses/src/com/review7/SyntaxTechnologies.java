package com.review7;

public class SyntaxTechnologies {

	String schoolName, lastDayOfClass, year;

	int batch;

	SyntaxTechnologies() {

		System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);

	}

	SyntaxTechnologies(String schoolName, int batch, String year, String lastDayOfClass) {

		this.schoolName = schoolName;
		this.lastDayOfClass = lastDayOfClass;
		this.year = year;
		this.batch = batch;

		System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);

	}

}
