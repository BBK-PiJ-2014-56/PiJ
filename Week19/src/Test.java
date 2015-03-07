/**
 * Created by jimjohn_thornton on 02/03/15.
 */
interface Person {
    public default String getName() {
        return "Name:";
    }
}

interface Academic extends Person{
    @Override
    public default String getName() {
        return "xxx";
    }
}

interface Student extends Person {
    @Override
    public default String getName() {
        return "XxX";
    }
}

interface TeachingAssistant extends Academic, Student {
    @Override
    public default String getName() {
        return "XxX";
    }
}

class TAImpl implements TeachingAssistant{
    @Override
    public String getName() {
        return "Method";
    }
}

public class Test {
    public static void main(String[] args) {
        Person ta = new TAImpl();
        System.out.println(ta.getName());
    }
}