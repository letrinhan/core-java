import java.time.*;

public class bai28 {

	public static void main(String[] args) {
	
     LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
      System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());  
      System.out.println("Before 7 houres and 30 minutes: " + dateTime+"\n");  
	}

}
