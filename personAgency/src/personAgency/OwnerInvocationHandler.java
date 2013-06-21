package personAgency;

import java.lang.reflect.*;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 12:10
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean  person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessError {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }  else if (method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
