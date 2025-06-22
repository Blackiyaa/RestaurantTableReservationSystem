package Model;

public class Customer {

    public static int id;
    private String name;
    private String nic;
    private String email;
    private String contactNo;
    private String password;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNic() {
        return nic;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(int id, String name, String nic, String email, String contactNo, String password) {
        setId(id);
        setName(name);
        setNic(nic);
        setEmail(email);
        setContactNo(contactNo);
        setPassword(password);
    }

    public Customer(String name, String nic, String email, String contactNo, String password) {
        this(0,name,nic,email,contactNo,password);
    }
    
    public Customer(){
    
    }
    
}
