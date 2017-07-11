import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class Board {
	public static int[][] grid;
	public static long[][] pos;
	public static HashMap<String, Integer> map;
	public static int qs;

	Board(String path) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		qs = Integer.parseInt(br.readLine());
		if (Math.pow(Math.sqrt(qs), 2) != qs) {
			throw (new Exception("File not valid"));
		}
		String[] values = br.readLine().split(" ");
		grid = new int[qs][qs];
		for (int i = 0; i < qs - 1; i++) {
			map.put(values[i], i);
		}
		map.put(values[qs - 1], -1);

		for (int i = 0; i < qs; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < qs; j++) {
				grid[j][i] = map.get(input[j]);
			}
		}
	}

}
