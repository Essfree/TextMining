package jan_16;

import java.io.IOException;
import java.util.Map;


public class Main {
	/**
	 * 根据学长给的3000的摘要改的
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//文本分词		
//		SplitText st = new SplitText();
//		String dataDir = "E:\\MUC\\1.16\\test";
//		st.split(dataDir);
		String splitDir = "E:\\MUC\\1.16\\Sample";
		Tfidf tI = new Tfidf();
		Map<String, Map<String, Double>> tfidfMap = tI.CalTfIdf(splitDir);
		int classNum = 6;
		KmeansCal kc = new KmeansCal(tfidfMap,classNum);
//		String analy = "E:\\MUC\\1.16\\Result\\Result.txt";
//		Analysis as = new Analysis();
//		as.analyData(analy);
	}

}
