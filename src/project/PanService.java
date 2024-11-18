package project;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap=new HashMap<>();
    static{
        panMap.put("EDWABC123N8", new Pan("EDWABC123N8"
                , "1234567890", "HDFC BANK", "Stock ,ELSS, FD, Index funds"));
        panMap.put("SDWABC144Y4", new Pan("SDWABC144Y4"
                , "4512547982", "Kotak BANK", "Stock,FD, Index funds"));
        panMap.put("KSDABC329W7", new Pan("KSDABC329W7"
                , "9812547942", "SBI BANK", "FD, Mutual Funds"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        for (Pan pan : panMap.values()){
            if (pan.getAadhaarNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
