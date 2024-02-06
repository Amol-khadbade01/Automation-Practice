package RestAssuredTest;

public class AllPayload {

	public static String Add_place() {
		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Rahul Shetty Academy\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n" + "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n" + "  ],\r\n" + "  \"website\": \"http://rahulshettyacademy.com\",\r\n"
				+ "\"language\": \"French-IN\"\r\n" + "}";
	}

	public static String update_pace() {
		return "";

	}

	public static String PricePayload() {
		return "{\r\n" + "\"RateRequest\": {\r\n" + "\"requestor\": {\r\n" + "\"name\": \"CUSTOMER_RATE\",\r\n"
				+ "\"dateTime\": \"2022-03-03T02:27:27-00:00\",\r\n" + "\"sourceSystemId\": \"MSTMND\",\r\n"
				+ "\"userId\": \"mastermind@werner.com\",\r\n" + "\"correlationId\": \"4000078734332022142727\"\r\n"
				+ "},\r\n" + "\"requestDetails\": [\r\n" + "{\r\n" + "\"header\": {\r\n"
				+ "\"contextId\": \"4000078734\",\r\n" + "\"ratingMode\": \"REVENUE\",\r\n"
				+ "\"transportMode\": \"ROAD\",\r\n" + "\"loadType\": \"LTL\"\r\n" + "},\r\n" + "\"config\": [\r\n"
				+ "{\r\n" + "\"externalRatingConfig\": {\r\n" + "\"partiesInvolved\": {\r\n"
				+ "\"customerIdentifier\": {\r\n" + "\"customerIdentifierType\": \"LEGACY_BILLTO_CODE\",\r\n"
				+ "\"identifierValue\": \"PILGLA02\"\r\n" + "},\r\n" + "\"carrierIdentifier\": {\r\n"
				+ "\"identifierValue\": \"WENP\"\r\n" + "}\r\n" + "}\r\n" + "},\r\n" + "\"sequenceNo\": 1,\r\n"
				+ "\"overrideFirstConfig\": false\r\n" + "}\r\n" + "],\r\n" + "\"move\": {\r\n" + "\"distance\": {\r\n"
				+ "\"totalDistance\": {\r\n" + "\"uom\": \"M\",\r\n" + "\"value\": 38.0\r\n" + "},\r\n"
				+ "\"directDistance\": {\r\n" + "\"uom\": \"M\",\r\n" + "\"value\": 38.0\r\n" + "},\r\n"
				+ "\"isLowAltitudeRoute\": false\r\n" + "},\r\n" + "\"ratableStops\": {\r\n" + "\"ratableStop\": [\r\n"
				+ "{\r\n" + "\"stopSequence\": 1,\r\n" + "\"stopType\": \"PU\",\r\n"
				+ "\"distanceFromPreviousStop\": {\r\n" + "\"uom\": \"M\",\r\n" + "\"value\": 0.0\r\n" + "},\r\n"
				+ "\"address\": {\r\n" + "\"city\": \"Seguin\",\r\n" + "\"stateProvince\": \"TX\",\r\n"
				+ "\"postalCode\": \"78155\",\r\n" + "\"countryCode\": \"USA\"\r\n" + "},\r\n" + "\"dates\": {\r\n"
				+ "\"date\": [\r\n" + "{\r\n" + "\"type\": \"SCHEDULED_LATEST\",\r\n"
				+ "\"date\": \"2022-03-03T06:00:00-00:00\"\r\n" + "}\r\n" + "]\r\n" + "}\r\n" + "},\r\n" + "{\r\n"
				+ "\"stopSequence\": 2,\r\n" + "\"stopType\": \"Del\",\r\n" + "\"distanceFromPreviousStop\": {\r\n"
				+ "\"uom\": \"M\",\r\n" + "\"value\": 38.0\r\n" + "},\r\n" + "\"address\": {\r\n"
				+ "\"city\": \"Buda\",\r\n" + "\"stateProvince\": \"TX\",\r\n" + "\"postalCode\": \"78610\",\r\n"
				+ "\"countryCode\": \"USA\"\r\n" + "},\r\n" + "\"dates\": {\r\n" + "\"date\": [\r\n" + "{\r\n"
				+ "\"type\": \"SCHEDULED_LATEST\",\r\n" + "\"date\": \"2022-03-03T06:00:00-00:00\"\r\n" + "}\r\n"
				+ "]\r\n" + "}\r\n" + "}\r\n" + "]\r\n" + "},\r\n" + "\"equipment\": {\r\n"
				+ "\"equipmentDetail\": \"\",\r\n" + "\"equipmentType\": \"TV\"\r\n" + "},\r\n" + "\"packaging\": {\r\n"
				+ "\"pallets\": 0,\r\n" + "\"package\": [\r\n" + "{\r\n" + "\"freightClass\": 65.0,\r\n"
				+ "\"quantity\": {\r\n" + "\"value\": 1,\r\n" + "\"uom\": \"BAG\",\r\n" + "\"type\": \"PKG\"\r\n"
				+ "},\r\n" + "\"weight\": {\r\n" + "\"value\": 11,\r\n" + "\"uom\": \"L\",\r\n" + "\"type\": \"G\"\r\n"
				+ "},\r\n" + "\"label\": 0\r\n" + "}\r\n" + "]\r\n" + "}\r\n" + "},\r\n" + "\"ratingPreference\": {\r\n"
				+ "\"accessorialOnlyRating\": false,\r\n" + "\"dryRun\": false,\r\n" + "\"constraints\": {}\r\n"
				+ "}\r\n" + "}\r\n" + "]\r\n" + "}\r\n" + "}";
	}

	public static String CoursePrice() {

		return "{\r\n" + "  \"dashboard\": {\r\n" + "    \"purchaseAmount\": 1162,\r\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\r\n" + "  },\r\n" + "  \"courses\": [\r\n" + "    {\r\n"
				+ "      \"title\": \"Selenium Python\",\r\n" + "      \"price\": 50,\r\n" + "      \"copies\": 6\r\n"
				+ "    },\r\n" + "    {\r\n" + "      \"title\": \"Cypress\",\r\n" + "      \"price\": 40,\r\n"
				+ "      \"copies\": 4\r\n" + "    },\r\n" + "    {\r\n" + "      \"title\": \"RPA\",\r\n"
				+ "      \"price\": 45,\r\n" + "      \"copies\": 10\r\n" + "    },\r\n" + "     {\r\n"
				+ "      \"title\": \"Appium\",\r\n" + "      \"price\": 36,\r\n" + "      \"copies\": 7\r\n"
				+ "    }\r\n" + "    \r\n" + "    \r\n" + "    \r\n" + "  ]\r\n" + "}\r\n" + "";

	}

	public static String LotId() {
		return "lotto {\r\n" + " \"lotto\":{\r\n" + "   \"lottoId\":5,\r\n"
				+ "   \"winning-numbers\":[2,45,34,23,7,5,3],\r\n" + "   \"winners\":[{\r\n"
				+ "     \"winnerId\":23,\r\n" + "     \"numbers\":[2,45,34,23,3,5]\r\n" + "   },{\r\n"
				+ "     \"winnerId\":54,\r\n" + "     \"numbers\":[52,3,12,11,18,22]\r\n" + "   }]\r\n" + "  }\r\n"
				+ " }";
	}
}
