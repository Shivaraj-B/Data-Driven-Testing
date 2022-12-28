package com.datadriven.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.datadriven.entity.TestCaseType;
import com.datadriven.entity.TestDataMapper;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojoConverterUtil {

	private static final String VISA_TEST_JSON = "/visa-data.json";
	private static final String VISA_TEST_MASTER_CARD = "/visa-data_MC.json";
	public static TestDataMapper getListOfTestDataMapper(TestCaseType testCaseType) {
		switch (testCaseType) {
		case VISA_TYPE:
			return getListOfTestDataMapper(VISA_TEST_JSON);
		case MASTER_CARD_TYPE:
			return getListOfTestDataMapper(VISA_TEST_MASTER_CARD);
		}
		
		return null;

	}

	public static TestDataMapper getListOfTestDataMapper(String fileName) {
		TestDataMapper output = null;
		InputStream inJson = TestDataMapper.class.getResourceAsStream(fileName);
		try {
			output = new ObjectMapper().readValue(inJson, TestDataMapper.class);
			return output;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;

	}

}
