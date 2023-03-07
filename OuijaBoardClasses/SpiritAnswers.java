package OuijaBoardClasses;

import java.util.Date;

public class SpiritAnswers {
    private String name;
    private Date birthDay;
    private Date deathDay;
    private String randomAnswers;

    public SpiritAnswers(String name, Date birthDay, Date deathDay, String randomAnswers) {
        this.name = name;
        this.birthDay = birthDay;
        this.deathDay = deathDay;
        this.randomAnswers = randomAnswers;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Date getDeathDay() {
        return deathDay;
    }

    public String getRandomAnswers() {
        return randomAnswers;
    }
}
