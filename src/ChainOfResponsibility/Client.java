package ChainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		AuthenticationHandler auth = new AuthenticationHandler("12345");
		ContentTypeHeader type = new ContentTypeHeader("json");
		PayloadHandler payload = new PayloadHandler("Body: {\"username\"} = \"john\"}");
		
		auth.next = type;
		type.next = payload;
		
		
		String withAuthentication = auth.addHandler("Headers with authentication");
		System.out.println(withAuthentication);
		
		System.out.println("-----------------------------------------------");
		String withoutAuthentication = type.addHandler("Headers without authentication");
		System.out.println(withoutAuthentication);
	}
}
