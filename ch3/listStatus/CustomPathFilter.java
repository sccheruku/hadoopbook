package listStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.PathFilter;

public class CustomPathFilter implements PathFilter {

	
	
	@Override
	public boolean accept(Path path) {
		return path.toString().matches(".*");
	}
	
}
