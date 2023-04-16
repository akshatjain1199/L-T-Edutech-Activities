public class User {
    //your code goes here...    
    private Long id;
    private String name;
    private String contactDetail;
    private String username;
    private String password;

    public User(Long id,String name,String contactDetail,String username,String password){
        this.id= id;
        this.name=name;
        this.contactDetail=contactDetail;
        this.username=username;
        this.password=password;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getContactDetail(){
        return contactDetail;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
