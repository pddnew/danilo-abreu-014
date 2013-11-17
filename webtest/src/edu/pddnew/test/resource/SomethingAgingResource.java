package edu.pddnew.test.resource;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import edu.pddnew.test.bean.SomethingAging;

public class SomethingAgingResource {

	public String toJSON(SomethingAging bean){
		ObjectMapper map = new ObjectMapper();
		String json = null;
		try {
			json = map.writeValueAsString(bean);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
}
