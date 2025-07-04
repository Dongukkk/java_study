package study.practice.practice55;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice55 {

	public static void main(String[] args) {
		
		try {
			String jsonString = "{\r\n"
					+ "\"employees\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 1,\r\n"
					+ "\"name\": \"홍길동\",\r\n"
					+ "\"position\": \"개발자\",\r\n"
					+ "\"salary\": 50000,\r\n"
					+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"id\": 2,\r\n"
					+ "\"name\": \"김철수\",\r\n"
					+ "\"position\": \"디자이너\",\r\n"
					+ "\"salary\": 40000,\r\n"
					+ "\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
					+ "}\r\n"
					+ "],\r\n"
					+ "\"company\": {\r\n"
					+ "\"name\": \"주식회사 ABC\",\r\n"
					+ "\"address\": \"서울시 강남구\",\r\n"
					+ "\"established\": \"1990-01-01\",\r\n"
					+ "\"departments\": [\r\n"
					+ "{\r\n"
					+ "\"name\": \"개발부\",\r\n"
					+ "\"employees\": [1, 3, 5]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"name\": \"디자인부\",\r\n"
					+ "\"employees\": [2, 4]\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "},\r\n"
					+ "\"projects\": [\r\n"
					+ "{\r\n"
					+ "\"title\": \"사내 시스템 개발\",\r\n"
					+ "\"budget\": 100000,\r\n"
					+ "\"team\": [1, 3]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"title\": \"웹 디자인 프로젝트\",\r\n"
					+ "\"budget\": 80000,\r\n"
					+ "\"team\": [2, 4]\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "}";
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			System.out.println("********employees********");
			JSONArray employees = (JSONArray)jsonObj.get("employees");
			for(int i=0; i<employees.size(); i++) {
				JSONObject employee = (JSONObject)employees.get(i);
				System.out.println("id : " + employee.get("id"));
				System.out.println("name : " + employee.get("name"));
				System.out.println("position : " + employee.get("position"));
				System.out.println("salary : " + employee.get("salary"));
				JSONArray skills = (JSONArray)employee.get("skills");
				System.out.print("skills : ");
				for(int j=0; j<skills.size();j++)
					System.out.print(skills.get(j) + " ");
				System.out.println();
				System.out.println();
			}
			
			System.out.println("********company********");
			JSONObject company = (JSONObject)jsonObj.get("company");
			System.out.println("name : " + company.get("name"));
			System.out.println("address : " + company.get("address"));
			System.out.println("established : " + company.get("established"));
			JSONArray departments = (JSONArray)company.get("departments");
			System.out.println("***departments***");
			for(int i=0; i<departments.size();i++) {
				JSONObject department = (JSONObject)departments.get(i);
				System.out.println("name : " + department.get("name"));
				JSONArray dEmployees = (JSONArray)department.get("employees");
				System.out.print("employees : ");
				for(int j=0; j<dEmployees.size();j++) 
					System.out.print(dEmployees.get(j) + " ");
				System.out.println();
			}
			
			System.out.println();
			System.out.println("********projects********");
			JSONArray projects = (JSONArray)jsonObj.get("projects");
			for(int i=0; i<projects.size();i++) {
				JSONObject project = (JSONObject)projects.get(i);
				System.out.println("title : " + project.get("title"));
				System.out.println("budget : " + project.get("budget"));
				JSONArray team = (JSONArray)project.get("team");
				System.out.print("team : ");
				for(int j=0; j<team.size();j++) 
					System.out.print(team.get(j) + " ");
				System.out.println();
				System.out.println();
			}
			
			
		}catch(

	Exception e)
	{
			// 오류 내용 확인 -> 대처
		}

	}

}
