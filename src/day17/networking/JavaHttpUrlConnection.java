package day17.networking;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class JavaHttpUrlConnection {
    
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.detik.com/");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            Map<String, List<String>> httpHeaders = huc.getHeaderFields();
            for(String headerName : httpHeaders.keySet()){
                List<String> headerValues = httpHeaders.get(headerName);
                System.out.println(headerName + ":" + headerValues);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
