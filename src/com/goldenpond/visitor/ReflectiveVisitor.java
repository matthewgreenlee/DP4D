package com.goldenpond.visitor;

import java.lang.reflect.Method;

import com.goldenpond.utils.Print;

public class ReflectiveVisitor implements Visitor {

	@Override
	public void visit(Object element) {
		try {
			getMethod(element.getClass()).invoke(this, new Object[] {element});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Method getMethod(Class<? extends Object> c) {
		String methodName = "visit" + c.getSimpleName();
		Method m = null;
		try {
			m = getClass().getMethod(methodName, c);
		} catch (NoSuchMethodException e) {
			try {
				m = getClass().getMethod("visitObject", Object.class);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return m;
	}

	public void visitObject(Object element) {
		Print.ln(getClass().getName() + " visits " + element.getClass().getName());
	}
}
