package org.springframework.mytest.anntotationScan;

import org.springframework.stereotype.Service;

/**
 * Create By xzz on 2020/4/30
 */
@Service
public class Girl implements Person {
	private String name;

	public Girl() {
		this.name = "小红";
	}

	@Override
	public String name() {
		return name;
	}
}
