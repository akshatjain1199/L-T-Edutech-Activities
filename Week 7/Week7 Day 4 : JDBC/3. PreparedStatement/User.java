public class User{
    long id;
    String name, cD, uN, pwd;
    
    public User(String name,String cD, String uN, String pwd){
     //this.id=id;
     this.name=name;
     this.cD=cD;
     this.uN=uN;
	 this.pwd=pwd;
    }

    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setContactDetail(String cD){
        this.cD=cD;
    }
    public void setUsername(String uN){
        this.uN=uN;
    }
    public void setPassword(String pwd){
        this.pwd=pwd;
    }
    public Long getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
        public String getContactDetail(){
        return cD;
    }
        public String getUsername(){
        return uN;
    }
		public String getPassword(){
        return pwd;
    }
}
