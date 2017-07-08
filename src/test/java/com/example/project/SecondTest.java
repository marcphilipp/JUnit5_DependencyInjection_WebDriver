/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(WebDriverExtension.class)
class SecondTest {

	private WebDriver wd;

	public SecondTest(WebDriver wd) {
		this.wd = wd;
	}

	@Test
	@DisplayName("My 2st JUnit 5 and Maven and DI and Selenium test! 😎")
	void mySecondTest(TestInfo testInfo) {
		wd.get("https://github.com/junit-team/junit5-samples/issues/29");
		assertThat(wd.getTitle(), containsString("Dependency Injection"));
	}

}
