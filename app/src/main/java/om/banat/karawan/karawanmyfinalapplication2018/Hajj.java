package om.banat.karawan.karawanmyfinalapplication2018;

import android.widget.EditText;

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

    public static void setKey(String key) {
    }

    public String getName() {
        return Name;
    }

    public void setName(EditText name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(EditText lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(EditText age) {
        Age = age;
    }

    public String getPlaceLiving() {
        return PlaceLiving;
    }

    public void setPlaceLiving(EditText placeLiving) {
        PlaceLiving = placeLiving;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(EditText email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(EditText phone) {
        Phone = phone;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(EditText information) {
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

