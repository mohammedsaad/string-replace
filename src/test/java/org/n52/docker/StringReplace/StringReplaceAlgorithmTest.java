package org.n52.docker.StringReplace;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class StringReplaceAlgorithmTest {
  @Test

  public void testFormats(){
    StringReplaceAlgorithm algorithm = new StringReplaceAlgorithm();
    algorithm.setInput("The string 'WPS is the best' can be replaced");
    algorithm.execute();
    assertThat(algorithm.getOutput(), equalTo("The string 'javaPS is the best' can be replaced"));
  }

}
