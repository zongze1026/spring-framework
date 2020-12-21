package org.springframework.mytest.entity.general;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/4/30
 */
@Component("Teacher")
public class Teacher implements Person {
	private String name;

	public Teacher() {
		this.name = "lucy";
	}

	@Override
	public String name() {
		return name;
	}
}
