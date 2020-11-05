package TestingFramework.Utility;

import java.io.*;

public class LiveReportHTMLCreator {
    public static void create() {
        try {
            File file = new File(".\\Execution_Reports\\TempReport.html");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("<html><head><title>Temporary/Live Reporting . . .</title></head><body><h1>Report</h1><ul>");
            if(TempReportUtil.resultMap.size()!=0){
                for(String testName:TempReportUtil.resultMap.keySet()){
                    String status = TempReportUtil.resultMap.get(testName);
                    bw.write("<li>"+testName+" - "+status+"</li>");
                }
            }
            bw.write("</ul></body></html>");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
