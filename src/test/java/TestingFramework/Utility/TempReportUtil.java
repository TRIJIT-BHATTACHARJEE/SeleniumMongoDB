package TestingFramework.Utility;

import java.util.LinkedHashMap;
import java.util.Map;

public class TempReportUtil {
    public static Map<String,String> resultMap = new LinkedHashMap<>();
    public static void add(String name, boolean failed) {
        try{
            String res="";
            if(failed){
               res="Fail";
            }else{
                res="Pass";
            }
            resultMap.put(name,res);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            LiveReportHTMLCreator.create();
        }
    }


    public static void show() {
        try{
            if(resultMap.size()!=0){
                System.out.println(resultMap.toString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
