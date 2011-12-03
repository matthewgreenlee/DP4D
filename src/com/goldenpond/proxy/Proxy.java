package com.goldenpond.proxy;

public class Proxy implements ISubject {

	private SubjectImpl subject;

	public SubjectImpl getSubject() {
		return subject;
	}

	public void setSubject(SubjectImpl subject) {
		this.subject = subject;
	}

	@Override
	public void bizMethod() {
		if (subject == null) {
			subject = new SubjectImpl();
		}
		subject.bizMethod();
	}

}
