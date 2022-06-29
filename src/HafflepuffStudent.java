public class HafflepuffStudent extends HogwartsStudent{

    private int diligence;
    private int loyalty;
    private int honesty;

    public HafflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int ability() {
        return  diligence + loyalty + honesty;
    }

    public void compareHafflepuffStudents(HafflepuffStudent hafflepuffStudent) {
        int ability1 = ability();
        int ability2 = hafflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Пуффендуя %s лучше студента %s (%d VS %d)%n", getName(), hafflepuffStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Пуффендуя %s лучше студента %s (%d VS %d)%n", hafflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Пуффендуя %s, точно такой же, как студент %s (%d VS %d)%n", hafflepuffStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s: трудолюбие - %d, верность - %d, честность - %d", super.toString(), diligence, loyalty, honesty);
    }
}
