package cz.czechitas.gifomat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by martina.kyjakova on 11/21/2017.
 */

public class Person {
    @SerializedName("name")
    public String jmeno;
    public String surname;
    public int age;
    public Adresa adresa;

}
