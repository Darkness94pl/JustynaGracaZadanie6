package hello;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static javax.swing.text.StyleConstants.Size;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(17)
    @Max(35)
    private Integer age;

    private String country;
    private String gender;

    public String getGender() { return this.gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getCountry() { return this.country; }

    public void setCountry(String country) { this.country = country; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
