package study.practice.practice56;

public class ContactsDTO {
	String type;
	String value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ContactsDTO [type=" + type + ", value=" + value + "]";
	}
	
	
}
