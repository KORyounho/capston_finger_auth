package chosun.our.myapplication;

import java.util.Date;

public class LicenseInFo {
    String License_Number;
    String License_Type;
    Date License_date;
    String License_Agency;

    public String getLicense_Number() {
        return License_Number;
    }

    public void setLicense_Number(String license_Number) {
        License_Number = license_Number;
    }

    public String getLicense_Type() {
        return License_Type;
    }

    public void setLicense_Type(String license_Type) {
        License_Type = license_Type;
    }

    public Date getLicense_date() {
        return License_date;
    }

    public void setLicense_date(Date license_date) {
        License_date = license_date;
    }

    public String getLicense_Agency() {
        return License_Agency;
    }

    public void setLicense_Agency(String license_Agency) {
        License_Agency = license_Agency;
    }
}
