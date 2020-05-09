package com.beantemplate;



import org.springframework.beans.factory.annotation.Autowired;

public class Candidate {
	
	 @Autowired
	    private Job job;

	    @Override
	    public String toString() {
	        return "Person{" +
	                "job=" + job +
	                '}';
	    }

}
