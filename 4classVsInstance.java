import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
          } else {
              age = initialAge;
          }
        
	}

	public void amIOld() {
  		String ageStatement;
          if(age < 13){
              ageStatement = "You are young.";
          } else if(age >= 13 && age < 18){
              ageStatement = "You are a teenager.";
          } else {
              ageStatement = "You are old.";
          }
        System.out.println(ageStatement);
	}

	public void yearPasses() {
        age += 1;
	}

	public static void main(String[] args) {