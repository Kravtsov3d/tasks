package com.task10.tables;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.syndicate.deployment.annotations.lambda.LambdaHandler;

import java.util.HashMap;
import java.util.Map;

@LambdaHandler(lambdaName = "api_handler_tables_get_by_id",
	roleName = "api_handler_tables_get_by_id-role",
	isPublishVersion = true,
	aliasName = "${lambdas_alias_name}"
)
public class ApiHandlerTablesGetById implements RequestHandler<Object, Map<String, Object>> {

	public Map<String, Object> handleRequest(Object request, Context context) {
		System.out.println("Hello from lambda");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("statusCode", 200);
		resultMap.put("body", "Hello from Lambda");
		return resultMap;
	}
}
