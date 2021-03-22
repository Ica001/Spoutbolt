package MainPackage;

public class AtomicSubscription {
	public String field;
	public String operator;
	public Object value;

	public AtomicSubscription(String field,String operator,Object value) {
		this.field=field;
		this.operator=operator;
		this.value=value;
		
	}

	@Override
	public String toString() {
		return "(" + field + " " + operator + " " + value + ")";
	}
	
}
