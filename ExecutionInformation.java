package Hello;

import org.springframework.data.annotation.Id;
import org.springframework*

public class ExecutionInformation {

	@Id private String id;

	private String testcaseid; 
	private String xml;

	public String getTestCase() {
		return testcaseid;
	}

	public void setTestCase(String testcaseid) {
		this.testcaseid = testcaseid;
	}

	public String getXML() {
		return xml;
	}

	public void setXML(String xml) {
		this.xml = xml;
	}
	
}