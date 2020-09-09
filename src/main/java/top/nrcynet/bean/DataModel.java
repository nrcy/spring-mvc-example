package top.nrcynet.bean;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;

@Component
public class DataModel {

	private String str01;
	
	private String str02;

	@JsonView(GetOneParam.class)
	public String getStr01() {
		return str01;
	}

	public void setStr01(String str01) {
		this.str01 = str01;
	}

	@JsonView(GetTwoParam.class)
	public String getStr02() {
		return str02;
	}

	public void setStr02(String str02) {
		this.str02 = str02;
	}
	
	public interface GetOneParam{};
	public interface GetTwoParam extends GetOneParam{};
}
