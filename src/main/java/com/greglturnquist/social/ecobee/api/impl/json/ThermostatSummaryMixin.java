package com.greglturnquist.social.ecobee.api.impl.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greglturnquist.social.ecobee.api.Status;

public class ThermostatSummaryMixin extends EcobeeObjectMixin {

	public ThermostatSummaryMixin(@JsonProperty("thermostatCount") int thermostatCount,
								  @JsonProperty("revisionList") List<String> revisionList,
								  @JsonProperty("statusList") List<String> statusList,
								  @JsonProperty("status") Status status) {
	}

}