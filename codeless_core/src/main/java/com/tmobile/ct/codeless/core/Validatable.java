/*******************************************************************************
 * * Copyright 2018 T Mobile, Inc. or its affiliates. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License.  You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  * License for the specific language governing permissions and limitations under
 *  * the License.
 ******************************************************************************/
package com.tmobile.ct.codeless.core;

import java.util.List;

/**
 * The Interface Validatable.
 *
 * @author Rob Graff
 */
public interface Validatable {

	/**
	 * Gets the assertions.
	 *
	 * @return the assertions
	 */
	List<Assertion> getAssertions();
	
	/**
	 * Sets the assertions.
	 *
	 * @param assertions the new assertions
	 */
	void setAssertions(List<Assertion> assertions);
	
	/**
	 * Validate.
	 */
	void validate();
}
