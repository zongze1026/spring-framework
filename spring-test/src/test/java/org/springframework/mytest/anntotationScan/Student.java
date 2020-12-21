package org.springframework.mytest.anntotationScan;
import org.springframework.stereotype.Service;

/**
 * Create By xzz on 2020/4/30
 */
@Service
public class Student implements Person {

	private String name;

	public Student() {
		this.name = "toms";
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	@Override
	public String name() {
		return name;
	}


}
