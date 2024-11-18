package project;

import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AadhaarService aadhaarService=new AadhaarService();
        PanService panService=new PanService();

        System.out.println("Enter your aadhaar number");
        String aadhaarNumber= sc.nextLine();

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);//this is obj r isko print krty h to hashcode print hota h so we used to string
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);
        if (aadhaar!=null && pan!=null){
            System.out.println("Aadhaar Details = "+aadhaar);//to string yha py km ayega
            System.out.println("PAN Details = "+pan);
        }
        else
        {
            System.out.println("No match found....");
        }
    }
}
