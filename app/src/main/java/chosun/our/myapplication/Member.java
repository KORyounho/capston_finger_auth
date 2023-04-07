package chosun.our.myapplication;


import java.util.Date;

public class Member {
    String member_id; String name; String password; String email; String age; String gender; String phone_num; String User_Type;

    String Car_Type; String Car_Option; String Car_Number; int Finger_Info; String Car_Nickname;

    String License_Number; String License_Type; Date License_date; String License_Agency;

    boolean Car_register;

    public String getCar_Type() {
        return Car_Type;
    }

    public void setCar_Type(String car_Type) {
        Car_Type = car_Type;
    }

    public String getCar_Option() {
        return Car_Option;
    }

    public void setCar_Option(String car_Option) {
        Car_Option = car_Option;
    }

    public String getCar_Number() {
        return Car_Number;
    }

    public void setCar_Number(String car_Number) {
        Car_Number = car_Number;
    }

    public boolean isCar_register() {
        return Car_register;
    }

    public void setCar_register(boolean car_register) {
        Car_register = car_register;
    }

    public int getFinger_Info() {
        return Finger_Info;
    }

    public void setFinger_Info(int finger_Info) {
        Finger_Info = finger_Info;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getLicense_Number() { return License_Number;}

    public void setLicense_Number(String license_Number) { License_Number = license_Number;}

    public String getLicense_Type() { return License_Type;}

    public void setLicense_Type(String license_Type) { License_Type = license_Type;}

    public Date getLicense_date() { return License_date;}

    public void setLicense_date(Date license_date) {License_date = license_date;}

    public String getLicense_Agency() {return License_Agency;}

    public void setLicense_Agency(String license_Agency) {License_Agency = license_Agency;}

    public String getCarNickname() {return Car_Nickname;}

    public void setCarNickname(String car_Nickname) {Car_Nickname = car_Nickname;}

    public Member() {}

    public Member(String member_id, String email, String password, String name, String age, String gender, String User_Type, String phone_num) {
        this.member_id = member_id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.User_Type = User_Type;
        this.phone_num = phone_num;
    }

    public void AddLicense(String license_Number, String license_Type, Date license_date, String license_Agency) {
        License_Number = license_Number;
        License_Type = license_Type;
        License_date = license_date;
        License_Agency = license_Agency;
    }

    public void AddCar(String member_id, String car_Type, String car_Option, String car_Number, String car_Nickname) {
        //if(member_id!=this.member_id) 로그인한 사용자랑 등록할 사용자랑 같은사람일 경우만 가능함.(지문값으로 넣어도 될듯)
        Car_Type = car_Type;
        Car_Option = car_Option;
        Car_Number = car_Number;
        Car_Nickname = car_Nickname;
    }
}

