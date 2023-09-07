package Java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tasklist {
  public static void main(String[] args) {
    for (int i=3; i>0; i--){
      System.out.println(i);
    }
  }
}