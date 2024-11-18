package project;

public class Aadhaar {
    private String aadhaarNumber; // WHY PRIVATE---> SECURITY  //bcz of private funcn its will n
                                                                //not be available outside class so to access these methods we will make getter setter
    private String name;
    private String fatherName;
    private String address;

    //parametric constructor---to get above funcn while making object   //jb v koi aadhaar ka obj bnyega to sary funcn zrur aye
    public Aadhaar(String aadhaarNumber, String name, String fatherName, String address) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
    }

    //getter setter
    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {  //adhr ka obj sdhy print(sout) kru to hashcode gnrt hoga lekin mujhy sari value print krani h(nane, addresss..)
        return "Aadhaar{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
