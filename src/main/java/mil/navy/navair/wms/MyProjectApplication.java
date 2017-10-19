package mil.navy.navair.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	/**
	 * Incorrect assignment in if condition.
	 */
	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
		if (value = true) {
			//do Something
		} else {
			//else Do Something
		}
	}
}
