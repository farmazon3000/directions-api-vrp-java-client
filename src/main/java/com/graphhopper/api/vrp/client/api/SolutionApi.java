package com.graphhopper.api.vrp.client.api;

import com.graphhopper.api.vrp.client.ApiInvoker;
import com.graphhopper.api.vrp.client.model.Response;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.graphhopper.api.vrp.client.ApiException;

import java.util.HashMap;
import java.util.Map;

public class SolutionApi {
  String basePath = "https://graphhopper.com/api/1/vrp";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Return the solution associated to the jobId
   * This endpoint returns the solution of a large problems. You can fetch it with the job_id, you have been sent.\n
   * @param key your API key
   * @param jobId Request solution with jobId
   * @return Response
   */
  public Response getSolution (String key, String jobId) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/solution/{jobId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiInvoker.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (key != null)
      queryParams.put("key", ApiInvoker.parameterToString(key));
    
    
    String[] contentTypes = {
      "application/json",
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Response) ApiInvoker.deserialize(response, "", Response.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
