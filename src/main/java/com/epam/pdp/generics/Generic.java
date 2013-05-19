package com.epam.pdp.generics;

import java.util.List;

public class Generic<T> {

	T something;
	List<?> someList;

	T returnSomething() {
		return something;
	}

	void initSomeList(List<Object> list) {
		someList = list;
	}

}
