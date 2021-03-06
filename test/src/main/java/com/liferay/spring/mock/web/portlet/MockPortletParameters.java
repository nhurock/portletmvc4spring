/**
 * Copyright (c) 2000-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.spring.mock.web.portlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.portlet.MutablePortletParameters;
import javax.portlet.PortletParameters;


/**
 * Mock implementation of the {@link PortletParameters} interface.
 *
 * @author  Neil Griffin
 * @since   5.1.0
 */
public class MockPortletParameters implements PortletParameters {

	protected Map<String, String[]> parameters = new HashMap<>();

	@Override
	public MutablePortletParameters clone() {
		return null;
	}

	@Override
	public Set<String> getNames() {
		return parameters.keySet();
	}

	@Override
	public String getValue(String name) {
		String[] values = parameters.get(name);

		if ((values != null) && (values.length > 0)) {
			return values[0];
		}

		return null;
	}

	@Override
	public String[] getValues(String name) {
		return parameters.get(name);
	}

	@Override
	public boolean isEmpty() {
		return parameters.isEmpty();
	}

	@Override
	public int size() {
		return parameters.size();
	}
}
