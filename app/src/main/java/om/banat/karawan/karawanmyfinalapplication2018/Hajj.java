package om.banat.karawan.karawanmyfinalapplication2018;

public class Hajj {
    private String Name;
    private String LastName;
    private String Age;
    private String PlaceLiving;
    private String Email;
    private String Phone;
    private String Information;
    public Hajj()
    {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPlaceLiving() {
        return PlaceLiving;
    }

    public void setPlaceLiving(String placeLiving) {
        PlaceLiving = placeLiving;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    @Override
    public String toString() {
        return "Hajj{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age='" + Age + '\'' +
                ", PlaceLiving='" + PlaceLiving + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Information='" + Information + '\'' +
                '}';
    }
}

