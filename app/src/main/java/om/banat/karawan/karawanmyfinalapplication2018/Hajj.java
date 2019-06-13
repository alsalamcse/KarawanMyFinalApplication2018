package om.banat.karawan.karawanmyfinalapplication2018;

import android.widget.EditText;

public class Hajj {
    private EditText Name;
    private EditText LastName;
    private EditText Age;
    private EditText PlaceLiving;
    private EditText Email;
    private EditText Phone;
    private EditText Information;
    public Hajj()
    {
    }

    public static void setKey(String key) {
    }

    public EditText getName() {
        return Name;
    }

    public void setName(EditText name) {
        Name = name;
    }

    public EditText getLastName() {
        return LastName;
    }

    public void setLastName(EditText lastName) {
        LastName = lastName;
    }

    public EditText getAge() {
        return Age;
    }

    public void setAge(EditText age) {
        Age = age;
    }

    public EditText getPlaceLiving() {
        return PlaceLiving;
    }

    public void setPlaceLiving(EditText placeLiving) {
        PlaceLiving = placeLiving;
    }

    public EditText getEmail() {
        return Email;
    }

    public void setEmail(EditText email) {
        Email = email;
    }

    public EditText getPhone() {
        return Phone;
    }

    public void setPhone(EditText phone) {
        Phone = phone;
    }

    public EditText getInformation() {
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

