package refactoring;
import java.util.Date;

public class Main {

	public static void main(String[] args)throws ParseException {
		// demostració de construcció d'un vehicle de categoria BASIC
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

		// demostració de construccuó d'un lloguer amb una data
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

		// demostració de formatat d'una data
		System.out.println(dateFormat.format(lloguerBasic.getData()));

	}

}
