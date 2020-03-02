package by.patsei.singleton.seesionbeean;


import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.ArrayList;
import java.util.List;

@Startup
@Singleton
@DependsOn("LoggerВean")

public class SingManagedBean {

    private final List<String> enginerList = new ArrayList<>();

    @Lock(LockType.READ)
    public String getEnginer(Integer id) {
        return enginerList.get(id);
    }

   @Lock(LockType.WRITE)
    public void setEnginer(String state) {
       enginerList.add(state);
    }

    @PostConstruct
    public void initialize() {
        enginerList.add("Programmer");
        enginerList.add("Design");
        enginerList.add("Tester");
        enginerList.add("Manager");

    }
    public void printList() {
        for (String str: enginerList) {
            System.out.println(str);
        }

    }
}
