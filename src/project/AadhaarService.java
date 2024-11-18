package project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String ,Aadhaar> aadharMap=new HashMap<>();
    static { //static block tb chlta h jb class load hoti h //we hv put data in static block thts why we hve used static keyword , baki r v triky h isko bnany  jsy constructor bna k , method bna k, inline block
        aadharMap.put("1234567890", new Aadhaar("1234567890",
                "Uzma", "Mr Zahid", "Lucknow" ));//r jb class load hogi tb mai data put krna chti hu

        aadharMap.put("4512547982",new Aadhaar("4512547982", "Chetan",
               " Mr Mahesh" , "delhi"));

        aadharMap.put("9812547942",new Aadhaar("9812547942", "Ria",
                " Mr Suresh" , "Gujarat"));


    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){//chaty h k ye method available rhy
        return  aadharMap.get(aadhaarNumber);  // koi key dhundni h to use get
    }
}
