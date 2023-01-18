import java.time.LocalDate;

public class Human {
    public String name;
    private int birthYear;

    private String city;
    public String post;

    public Human(String name, int birthYear, String city, String post) {


        if(birthYear < 0){
            this.birthYear = 0;
        }else {
            this.birthYear = birthYear;
        }
        if(name == null){
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if(city == null){
            this.city = "Информация не указана";
        }else {
            this.city = city;
        }
        if(post == null){
            this.post = "Информация не указана";
        }else {
            this.post = post;
        }

    }
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if(birthYear < 0){
            this.birthYear = 0;
        }else {
            this.birthYear = birthYear;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null){
            this.city = "Информация не указана";
        }else {
            this.city = city;
        }
    }




}
