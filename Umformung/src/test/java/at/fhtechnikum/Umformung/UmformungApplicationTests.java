package at.fhtechnikum.Umformung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UmformungApplicationTests {

	@Test
	void testInchToCentimeter() {

		// Given
		UmformungController controller = new UmformungController();

		// When
		double result = controller.InchToCentimeter(3);

		// Then
		assertEquals(result, 60);

	}
	void testYardToMeter() {

		// Given
		UmformungController controller = new UmformungController();

		// When
		double result = controller.YardToMeter(3);

		// Then
		assertEquals(result, 60);

	}

}
