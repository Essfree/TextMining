package jan_13;

import java.io.IOException;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws IOException {
		//文本分词		
//		SplitText st = new SplitText();
//		String dataDir = "E:\\MUC\\textmining\\all";
//		st.split(dataDir);
		String splitDir = "E:\\MUC\\textmining\\Sample";
		Tfidf tI = new Tfidf();
		Map<String, Map<String, Double>> tfidfMap = tI.CalTfIdf(splitDir);
		int classNum = 6;
		KmeansCal kc = new KmeansCal(tfidfMap,classNum);
		String analy = "E:\\MUC\\textmining\\Result\\Result.txt";
		Analysis as = new Analysis();
		as.analyData(analy);
	}

}
