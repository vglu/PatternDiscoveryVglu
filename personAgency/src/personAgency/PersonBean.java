package personAgency;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 12:00
 */
public interface PersonBean {
    public String getName();
    public String getGender();
    public String getInterests();
    public int getHotOrNotRating();

    public void setName(String name);
    public void setGender(String gender);
    public void setInterests(String interests);
    public void setHotOrNotRating(int rating);
}
