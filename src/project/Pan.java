package project;

public class Pan {
    private String panNumber;
    private String aadhaarNumber;
    private String bank;
    private String investment;


    public Pan(String panNumber, String aadhaarNumber, String bank, String investment) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bank = bank;
        this.investment = investment;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", bank='" + bank + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}



