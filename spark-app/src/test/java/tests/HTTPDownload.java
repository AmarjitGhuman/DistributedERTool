package tests;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

public class HTTPDownload {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		int N = 122;
		ArrayList<String> oa_fileNames = new ArrayList<String>();  
		int n = 123;
		//System.out.println(String.format("%06d", n));
		
		
		//System.out.printf("%6d",d.intValue());
	/*	for(int i = 2; i <= N; i++){
			
			System.out.println("OA_dump_"+String.format("%06d", i)+".nt.gz");
				
		}*/
		
		FileUtils.copyURLToFile(new URL("http://83.212.110.197:50070/logs/hadoop-cmf-hdfs-NAMENODE-master.log.out"), 
				new File("logs-namenode"));
		
	}

}
