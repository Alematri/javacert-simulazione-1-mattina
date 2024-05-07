package strings;

import org.apache.commons.lang3.StringUtils;

public class Main {

  public static void main(String[] args) {
    String example = "My first maven project";
    System.out.println(StringUtils.center(example, 100, "*"));
  }
}
