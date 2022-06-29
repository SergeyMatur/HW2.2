public class HogwartsStudent {

    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return String.format("Студент хогвартса %s: сила магии - %d, сила трансгрессии - %d", name, magic, transgression);
    }

    private int abilityHogwartsStudent() {
        return magic + transgression;
    }

    public void compareHogwartsStudents(HogwartsStudent hogwartsStudent) {
        int ability1 = abilityHogwartsStudent();
        int ability2 = hogwartsStudent.abilityHogwartsStudent();
        if (ability1 > ability2) {
            System.out.printf("Студент хогвартса %s лучше студента %s (%d VS %d)%n", name, hogwartsStudent.name, ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент хогвартса %s лучше студента %s (%d VS %d)%n", hogwartsStudent.name, name, ability2, ability1);
        } else {
            System.out.printf("Студент хогвартса %s, точно такой же, как студент %s (%d VS %d)%n", hogwartsStudent.name, name, ability2, ability1);
        }
    }

    public void print() {
        System.out.println(this);
    }

}
