/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiClasses;

import dao.JobDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.spark.api.java.JavaRDD;
import static org.apache.spark.ml.r.RWrappers.sparkSession;
import org.apache.spark.sql.Dataset;
import pojo.Job;

/**
 *
 * @author ahmed eltabakh
 */
@Path("/readdataset")
public class ReadDataset {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getJobs() throws IOException{

        JobDAO jobDOAObj = new JobDAO();
        List<Job> jobs = jobDOAObj.readJobsFromCSV();
        String title = jobs.get(1).getTitle();
        return title;
        /*
        Dataset<Job> df = spark.createDataFrame(Jobs);
                
        //Convert it to RDD
        JavaRDD<Job> rdd = javaSparkContext.parallelize(jobs);
        //Convert it to dataset

        sparkSession.createDataFrame(rdd, StringWrapper.class).show(false);
        */

    }
    
}
