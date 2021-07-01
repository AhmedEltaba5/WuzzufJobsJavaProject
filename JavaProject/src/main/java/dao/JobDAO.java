package dao;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class JobDAO {
    
    //read csv method
    public List<Job> readJobsFromCSV() throws FileNotFoundException, IOException{
        
        File jobInfo = new File("F:\\ITI\\Java SE\\archive\\Wuzzuf_Jobs.csv");
        FileReader fr = new FileReader(jobInfo);
        BufferedReader br = new BufferedReader(fr);
        
        String strCurrentLine;
        br.readLine();//pass first row
        
        //array of pyramids => arraylist
        List<Job> jobList = new ArrayList<>();
        
        while ((strCurrentLine = br.readLine()) != null){

            String[] jobData = strCurrentLine.split(",");
            
            jobList.add(createJob(jobData)); 
        }
        
        return jobList;
        
    }
    
    //create Job
    public Job createJob(String[] jobData){
        //create job object
        Job jobObj = new Job(jobData[0],jobData[1],jobData[2],jobData[3],jobData[4],jobData[5],jobData[6],jobData[7]);
        
        return jobObj;
    }
    
}
