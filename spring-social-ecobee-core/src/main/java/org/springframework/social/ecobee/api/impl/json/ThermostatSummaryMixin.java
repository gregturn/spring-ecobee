/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.ecobee.api.impl.json;

import java.util.List;

import org.springframework.social.ecobee.api.Status;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Greg Turnquist
 */
public class ThermostatSummaryMixin extends EcobeeObjectMixin {

	public ThermostatSummaryMixin(@JsonProperty("thermostatCount") int thermostatCount,
								  @JsonProperty("revisionList") List<String> revisionList,
								  @JsonProperty("statusList") List<String> statusList,
								  @JsonProperty("status") Status status) {
	}

}
