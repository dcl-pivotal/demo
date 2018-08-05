package com.dcl.starter.simple.utils;

import com.dcl.starter.simple.model.entity.Claim;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LogUtility {

	public static String getJson(Claim claim) {

		ObjectMapper mapper = new ObjectMapper();

		String jsonObject = "";

		try {

			jsonObject = mapper.writeValueAsString(claim);
			// LOG.info(jsonObject);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		return jsonObject;
	}
}
