package ObjectPackage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Contacts
{
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;
    public Contacts(String name,String phoneNumber,String birthDate) throws ParseException
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.birthDate=birthDate;
        simpleDateFormat formatter=new simpleDateFormat("MM/DD/YYYY");
        long diff=new Date().getTime() - formatter.parse(birthDate).getTime();
        this.age=(int) TimeUnit.MILLISECONDS.toDays(diff)/365;
    }
    public  String getName()
    {
        return name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getBirthDate()
    {
        return birthDate;
    }
    public int getAge()
    {
        return age;
    }
    public void setName()
    {
        this.name=name;
    }
    public void setPhoneNumber()
    {
        this.phoneNumber=phoneNumber();
    }
    public void setBirthDate()
    {
        this.birthDate=birthDate;
    }
    private void setAge(int age)
    {
        this.age=age;
    }
}
