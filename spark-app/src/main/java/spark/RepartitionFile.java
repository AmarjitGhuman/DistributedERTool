package spark;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class RepartitionFile {

	public final static org.apache.hadoop.conf.Configuration hdfsConf = new org.apache.hadoop.conf.Configuration();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SparkConf sparkConf = new SparkConf().setAppName("Repartition");
    	JavaSparkContext ctx = new JavaSparkContext(sparkConf);
    	
    	ctx.textFile(args[0],500).saveAsTextFile(args[1]);
    	ctx.close();
	}

}
