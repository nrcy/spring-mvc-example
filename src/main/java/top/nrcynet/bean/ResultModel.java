package top.nrcynet.bean;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;

@Component
public class ResultModel {

	private boolean result;
	
	private Object object;

	@JsonView(GetDataModel.class)
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@JsonView(GetResult.class)
	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	public interface GetResult{};
	public interface GetDataModel extends DataModel.GetTwoParam, GetResult{};
}
