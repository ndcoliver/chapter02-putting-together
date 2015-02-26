import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


public class Main {

	public static void main(String[] args) {

		Weld weld = new Weld();
		WeldContainer container = weld.initialize();

		BookService service = container.instance().select(BookService.class).get();

		Book book = service.createBook("H2G2", 12.5f, "Geeky scifi Book");

		System.out.println(book);

		weld.shutdown();
	}
}
