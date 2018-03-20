package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	Date dob = new Date();
	double sallary = 0;
	ArrayList<Staff> myStaff = new ArrayList();
	
	private double averageSal() {
		for (int i = 0; i < myStaff.size(); i++) {
			sallary += myStaff.get(i).getSalary();
		}
		return sallary / 5;
	}
	@Test
	public void test() throws Exception {
		
		myStaff.add(new Staff("Samuel", "Thomas", "Schooler", dob, "Newark", "phone", "email", 
				"office hours", 5, 100, dob, eTitle.MR));
		myStaff.add(new Staff("Tony", "Ironman", "Stark", dob, "Newark", "phone", "email", 
				"office hours", 5, 50, dob, eTitle.MR));
		myStaff.add(new Staff("Anthony", "MyTA", "LastName", dob, "Newark", "phone", "email", 
				"office hours", 5, 20, dob, eTitle.MR));
		myStaff.add(new Staff("Jigar", "Helps", "Alot", dob, "Newark", "phone", "email", 
				"office hours", 5, 100, dob, eTitle.MR));
		myStaff.add(new Staff("Ammid", "NotSo", "Much", dob, "Newark", "phone", "email", 
				"office hours", 5, 100, dob, eTitle.MR));
		
		
		assertEquals(averageSal(), 74, .01);
	}	

}
