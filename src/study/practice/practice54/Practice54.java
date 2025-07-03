package study.practice.practice54;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice54 {

	public static void main(String[] args) {
		try {
			String jsonString = "{\r\n"
					+ "  \"도서관\": {\r\n"
					+ "    \"위치\": \"서울특별시 강남구\",\r\n"
					+ "    \"운영시간\": {\r\n"
					+ "      \"평일\": [\r\n"
					+ "        \"09:00\",\r\n"
					+ "        \"21:00\"\r\n"
					+ "      ],\r\n"
					+ "      \"주말\": [\r\n"
					+ "        \"10:00\",\r\n"
					+ "        \"18:00\"\r\n"
					+ "      ]\r\n"
					+ "    },\r\n"
					+ "    \"책목록\": [\r\n"
					+ "      {\r\n"
					+ "        \"제목\": \"자바 프로그래밍\",\r\n"
					+ "        \"저자\": \"홍길동\",\r\n"
					+ "        \"출판연도\": 2023,\r\n"
					+ "        \"가격\": 25000,\r\n"
					+ "        \"대출가능\": true,\r\n"
					+ "        \"카테고리\": [\r\n"
					+ "          \"프로그래밍\",\r\n"
					+ "          \"자기계발\"\r\n"
					+ "        ]\r\n"
					+ "      },\r\n"
					+ "      {\r\n"
					+ "        \"제목\": \"데이터 분석 입문\",\r\n"
					+ "        \"저자\": \"김철수\",\r\n"
					+ "        \"출판연도\": 2022,\r\n"
					+ "        \"가격\": 28000,\r\n"
					+ "        \"대출가능\": false,\r\n"
					+ "        \"카테고리\": [\r\n"
					+ "          \"데이터\",\r\n"
					+ "          \"분석\"\r\n"
					+ "        ]\r\n"
					+ "      }\r\n"
					+ "    ],\r\n"
					+ "    \"특별서비스\": {\r\n"
					+ "      \"키오스크\": true,\r\n"
					+ "      \"스터디룸\": {\r\n"
					+ "        \"개수\": 5,\r\n"
					+ "        \"예약 가능\": true,\r\n"
					+ "        \"비용\": {\r\n"
					+ "          \"1시간당\": 5000,\r\n"
					+ "          \"하루\": 30000\r\n"
					+ "        }\r\n"
					+ "      }\r\n"
					+ "    }\r\n"
					+ "  }\r\n"
					+ "}";
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			JSONObject library = (JSONObject)jsonObj.get("도서관");
			System.out.println("********위치********");
			System.out.println("위치 : " + library.get("위치"));
			
			System.out.println("********운영시간********");
			JSONObject op_time = (JSONObject)library.get("운영시간");
			JSONArray op_time_weekday = (JSONArray)op_time.get("평일");
			
			System.out.println("평일 운영시간 : " + op_time_weekday.get(0) + " ~ " + op_time_weekday.get(1));
			
			JSONArray op_time_weekend = (JSONArray)op_time.get("주말");
			System.out.println("주말 운영시간 : " + op_time_weekend.get(0) + " ~ " + op_time_weekend.get(1));			

			System.out.println("********책목록********");
			JSONArray books = (JSONArray)library.get("책목록");
			
			for(int i=0; i<books.size(); i++) {
				System.out.println((i+1) + ".");
				JSONObject book = (JSONObject)books.get(i);
				System.out.println("제목 : " + book.get("제목"));
				System.out.println("저자 : " + book.get("저자"));
				System.out.println("출판연도 : " + book.get("출판연도"));
				System.out.println("가격 : " + book.get("가격"));
				System.out.println("대출가능 : " + (book.get("대출가능").toString()=="true" ? "가능" : "불가능"));
				//System.out.println("대출가능 : " + (Boolean.parseBoolean(book.get("대출가능").toString()) ? "가능" : "불가능"));
				JSONArray book_cat = (JSONArray)book.get("카테고리");
				System.out.print("카테고리 : ");
				for(int j=0; j<book_cat.size();j++)
					System.out.print(book_cat.get(j) + " ");
				System.out.println();
			}
			
			System.out.println("********특별서비스********");
			JSONObject service = (JSONObject)library.get("특별서비스");
			System.out.println("키오스크 : " + ((service.get("키오스크").toString()=="true") ? "있음" : "없음"));
			System.out.println("***스터디룸***");
			JSONObject study_room = (JSONObject)service.get("스터디룸");
			System.out.println("개수 : " + study_room.get("개수"));
			System.out.println("예약 가능 : " + ((study_room.get("예약 가능").toString()=="true") ? "가능" : "불가능"));
			JSONObject study_room_cost = (JSONObject)study_room.get("비용");
			System.out.println("비용(1시간당) : " + study_room_cost.get("1시간당"));
			System.out.println("비용(하루) : " + study_room_cost.get("하루"));
		}catch(

	Exception e)
	{
			// 오류 내용 확인 -> 대처
		}

}

}

