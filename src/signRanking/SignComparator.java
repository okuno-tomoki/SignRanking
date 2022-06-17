package signRanking;
import java.util.Comparator;


	public class SignComparator implements Comparator<Sign> {

		@Override
		public int compare(Sign p1, Sign p2) {
			return p1.num < p2.num ? -1 : 1;// 3条構文
		}
	}