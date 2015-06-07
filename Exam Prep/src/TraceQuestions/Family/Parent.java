package TraceQuestions.Family;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class Parent extends Grandparent {
    @Override
    public boolean good() {
        System.out.println(getAge());
        System.out.println(getMore());
        return getAge() < getMore();
    }
    public int getAge() {
        return 42;
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Ahh.........!");
    }
}
