package com.Entity;

import java.util.Iterator;
import java.util.List;

public class Question {
	 
	private int qid;
	private String qname;
	private List <String> answer;
	
    public Question(int qid, String qname, List<String> answer) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answer = answer;
	}

    public void display() {
	System.out.println(qid + " " + qname);
	Iterator<String> itr = answer.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
