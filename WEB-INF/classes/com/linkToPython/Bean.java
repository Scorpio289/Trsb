package com.linkToPython;
import java.io.*;
public class Bean {
    public Bean(){
    	
    }
        private String _testResult;
	private String _5nodesResult;
        private String _6nodesResult;
	private String _7nodesResult;

        public void runtest() {
		try {
			Process proc;
                        proc = Runtime.getRuntime().exec("python /home/zzh/machineLearning/experiment/test.py");
			BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));  
		    String line;  
		    StringBuffer s = new StringBuffer();
		    while ((line = in.readLine()) != null) {  
		        s.append(line);
		    }  
		    in.close(); 
		    this._testResult = s.toString();
		    try {
				proc.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTestResult() {
		return _testResult;
	}

	public void run5nodestest() {
		try {
			Process proc;
                        proc = Runtime.getRuntime().exec("python /home/zzh/machineLearning/experiment/5nodestest.py");
			BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));  
		    String line;  
		    StringBuffer s = new StringBuffer();
		    while ((line = in.readLine()) != null) {  
		        s.append(line);
		    }  
		    in.close(); 
		    this._5nodesResult = s.toString();
		    try {
				proc.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String get5nodesResult() {
		return _5nodesResult;
	}

	public void run6nodestest() {
		try {
			Process proc;
                        proc = Runtime.getRuntime().exec("python /home/zzh/machineLearning/experiment/6nodestest.py");
			BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));  
		    String line;  
		    StringBuffer s = new StringBuffer();
		    while ((line = in.readLine()) != null) {  
		        s.append(line);
		    }  
		    in.close(); 
		    this._6nodesResult = s.toString();
		    try {
				proc.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String get6nodesResult() {
		return _6nodesResult;
	}


	
	public void run7nodestest() {
		try {
			Process proc;
                        proc = Runtime.getRuntime().exec("python /home/zzh/machineLearning/experiment/7nodestest.py");
			BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));  
		    String line;  
		    StringBuffer s = new StringBuffer();
		    while ((line = in.readLine()) != null) {  
		        s.append(line);
		    }  
		    in.close(); 
		    this._7nodesResult = s.toString();
		    try {
				proc.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String get7nodesResult() {
		return _7nodesResult;
	}
}
