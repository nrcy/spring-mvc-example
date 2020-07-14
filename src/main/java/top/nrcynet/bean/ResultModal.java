package top.nrcynet.bean;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;

@Component
public class ResultModal {

	private boolean result;

	@JsonView(GetResult.class)
	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	public interface GetResult{};
	
}
