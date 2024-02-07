package com.task10.tables;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.syndicate.deployment.annotations.lambda.LambdaHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@LambdaHandler(
	lambdaName = "api_handler_tables_get_all",
	roleName = "api_handler_tables_get_all-role"
)
public class ApiHandlerTablesGetAll implements RequestHandler<Object, Map<String, Object>> {

	private static final Logger logger = Logger.getLogger(ApiHandlerTablesGetAll.class.getName());

	public Map<String, Object> handleRequest(Object request, Context context) {
		logger.info("Start TablesGetAll");

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("statusCode", 200);
		resultMap.put("body", "Hello from Lambda");
		return resultMap;
	}
}
