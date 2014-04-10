/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stuff;

/**
 *
 * @author gcorcoran
 */
public class Contact {
    String FirstName;
    String LastName;
    String StreetAddress;
    String City;
    String State;
    String ZipCode;
    String Email;
    String Phone;

    public Contact(String FirstName, String LastName, String StreetAddress, String City, String State, String ZipCode, String Email, String Phone) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.StreetAddress = StreetAddress;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
        this.Email = Email;
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", StreetAddress=" + StreetAddress + ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + ", Email=" + Email + ", Phone=" + Phone + '}';
    }
    
    
    
    public Contact(){
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
           
    
}
