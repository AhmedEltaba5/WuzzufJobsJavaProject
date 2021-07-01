
import dao.JobDAO;
import java.io.IOException;
import java.util.List;
import pojo.Job;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed eltabakh
 */
public class Main {
    
     public static void main(String[] args) throws IOException {
        System.out.println("output");
        JobDAO jobDOAObj = new JobDAO();
        List<Job> jobs = jobDOAObj.readJobsFromCSV();
        
        //print all pyramids in the csv
        int i = 0;
        for(Job p:jobs){
            System.out.println("#"+(i++)+" "+p);
        }
        
    }
}
