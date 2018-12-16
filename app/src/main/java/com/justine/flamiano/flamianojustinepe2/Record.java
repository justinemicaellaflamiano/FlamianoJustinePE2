package com.justine.flamiano.flamianojustinepe2;

public class Record {

    String fullname, gender;
    int age;

    public Record() {
    }

    public Record(String fullname, String gender, int age) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
    }

    public String getFullname() {return fullname;}

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {return gender;}

    public void setGender(String fullname){
        this.gender = gender;
    }

    public int getAge() {return age;}

    public void setAge(int age){
        this.age = age;
    }

}
}