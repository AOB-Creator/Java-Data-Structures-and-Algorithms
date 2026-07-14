public class Employee {
    String name;
    String gender;
    int age;

    private Employee(){
        System.out.println("This is Private Constructor !!!");
    }

    protected Employee(String personName){
        this();
        name = personName;
    }

    public void detailsEmployee(){
        System.out.println("Name: " + name + " Gender: " + gender + " Age: " + age);
    }

    public String getAllInfo(){
        String messages;
        messages = "Name: " + name + " Gender: " + gender + " Age: " + age;
        return messages;
    }

    public String overloader(String name){
        String text = "Salom " + name + "!";
        return text;
    }

    public String overloader(String name, int age){
        String text = "Salom " + name + ". You are " + age + " years old.";
        return  text;
    }
}
