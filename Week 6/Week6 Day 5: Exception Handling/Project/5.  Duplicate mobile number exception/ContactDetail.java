class ContactDetail{

    private String mobileNumber;
    private String AlternativeMobileNumber;
    private String landline;
    private String email;
    private String address;

    public ContactDetail() {
    }

    public ContactDetail(String mobileNumber, String alternativeMobileNumber, String landline, String email, String address) {
        this.mobileNumber = mobileNumber;
        AlternativeMobileNumber = alternativeMobileNumber;
        this.landline = landline;
        this.email = email;
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternativeMobileNumber() {
        return AlternativeMobileNumber;
    }

    public void setAlternativeMobileNumber(String alternativeMobileNumber) {
        AlternativeMobileNumber = alternativeMobileNumber;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString()
    {
        return "Mobile:"+getMobileNumber()+"\n"+
                "Alternate mobile:"+getAlternativeMobileNumber()+"\n"+
                "LandLine:"+getLandline()+"\n"+
                "Email:"+getEmail()+"\n"+
                "Address:"+getAddress();

    }
}
