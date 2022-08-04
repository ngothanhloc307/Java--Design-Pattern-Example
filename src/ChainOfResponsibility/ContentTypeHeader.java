package ChainOfResponsibility;

public class ContentTypeHeader implements HandlerChain {

	String contentType;
	public HandlerChain next;
	
	public ContentTypeHeader(String contentType) {
		this.contentType = contentType;
	}
	
	@Override
	public String addHandler(String inputHeader) {
		String outputHeader = inputHeader + "\nContentType: " + contentType;
		if(next == null)
			return outputHeader;
		else
			return next.addHandler(outputHeader);
	}
	
	

}
