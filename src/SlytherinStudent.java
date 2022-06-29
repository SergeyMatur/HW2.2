public class SlytherinStudent extends HogwartsStudent{

    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    private int ability() {
        return  cunning + determination + ambition + ingenuity + thirstForPower;
    }

    public void compareSlytherinStudents(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Слизерина %s лучше студента %s (%d VS %d)%n", getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Слизерина %s лучше студента %s (%d VS %d)%n", slytherinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Слизерина %s, точно такой же, как студент %s (%d VS %d)%n", slytherinStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s: хитрость - %d, решительность - %d, амбициозность - %d, находчивость - %d, жажда власти - %d", super.toString(), cunning, determination, ambition, ingenuity, thirstForPower);
    }
}
