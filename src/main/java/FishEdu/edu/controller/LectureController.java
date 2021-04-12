package FishEdu.edu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import FishEdu.edu.Section;


@RestController
@CrossOrigin("*")
public class LectureController {
	@RequestMapping("/sect")
	@ResponseBody
	public JSONObject getNextSection(int lecture, int pass,int section) {
		JSONObject resJson = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		switch(section) {
		case 11:
			Section sec = new Section();
			sec.setContent("数据类型");
			jsonArray.add(sec);
			Section sec2 = new Section();
			sec2.setType(2);
			sec2.setImgURL("../static/knowlgpg.png");
			jsonArray.add(sec2);
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			break;
		case 17:
			break;
		case 18:
			break;
		default:
			break;
		}
		resJson.put("data", jsonArray);
		resJson.put("nextsec",section);
		return resJson;
	}
	
}
