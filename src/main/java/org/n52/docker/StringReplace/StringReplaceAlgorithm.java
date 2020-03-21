package org.n52.docker.StringReplace;


//import statements omitted

import org.n52.javaps.algorithm.annotation.Algorithm;
import org.n52.javaps.algorithm.annotation.Execute;
import org.n52.javaps.algorithm.annotation.LiteralInput;
import org.n52.javaps.algorithm.annotation.LiteralOutput;

@Algorithm(identifier ="org.n52.docker.StringReplace" ,version = "1.0.0",title = "StringReplace",abstrakt = "this process replaces he wps in a text to a javaPs")
public class StringReplaceAlgorithm {
	private String input;
	private String output;

	@LiteralInput(identifier = "source",binding = org.n52.javaps.io.literal.xsd.LiteralStringType.class,title = "Source input text",maxOccurs = 1,minOccurs = 1)
	public void setInput(String value) {
		this.input= value;
	}

	@Execute
	public void execute() {
		this.output = input.replace("WPS","javaPS");

	}

	@LiteralOutput(identifier = "output",binding = org.n52.javaps.io.literal.xsd.LiteralStringType.class,title = "text after processing")
	public String getOutput() {
		return this.output;
	}


}