package top.nrcynet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonView;

import top.nrcynet.bean.DataModel;
import top.nrcynet.bean.DataModel.GetOneParam;
import top.nrcynet.bean.DataModel.GetTwoParam;
import top.nrcynet.bean.ResultModel;

@Controller
public class Demo07JsonController {

	@Autowired
	private DataModel dataModel;
	
	@Autowired
	private ResultModel resultModel;
	
	@RequestMapping("d7m1")
	public String d7m1(){
		return "success";
	}
	
	@RequestMapping(value="d7m2", method=RequestMethod.POST)
	@ResponseBody
	@JsonView(ResultModel.GetResult.class)
	public ResultModel d7m2(@RequestParam("str01") String str01,
			@RequestParam("str02") String str02) {
		dataModel.setStr01(str01);
		dataModel.setStr02(str02);
		resultModel.setObject(dataModel);
		return resultModel;
 	}
	
	
	@JsonView(GetOneParam.class)
	@RequestMapping("d7m3")
	@ResponseBody
	public DataModel d7m3() {
		return dataModel;
	}

	@JsonView(GetTwoParam.class)
	@RequestMapping("d7m4")
	@ResponseBody
	public DataModel d7m4() {
		return dataModel;
	}
	
	@RequestMapping("d7m5")
	@ResponseBody
	@JsonView(ResultModel.GetDataModel.class)
	public ResultModel d7m5() {
		return resultModel;
	}
}
