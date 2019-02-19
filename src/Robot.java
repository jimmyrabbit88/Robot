public class Robot {
    private String name;
    private int age;
    private Boolean working = false;

    public Robot(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Robot() {
        setName("");
        setAge(0);
    }

    public String getName() {
        return name;
    }

    public void sendAgeMsg() throws IllegalArgumentException {
        try {
            if (age > 25) {
                throw new IllegalArgumentException("Age too old");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println( "Age ok");
    }


    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String checkAge() {
        if(age<=20){
            return "Age OK";
        }
        else{
            return "Too old";
        }
    }


    public double checkCost() {
        if (age <= 5) {
            return 10000.00;
        } else if (age <= 10) {
            return 7500.00;
        } else return 5000.00;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean isWorking() {
        return working;
    }

    public void talkToRobot(){
        working = true;
    }

    public String getWorkingMessage(){
        if(!isWorking()) {
            throw new IllegalStateException();
        }
        return "I am in working order";
    }

    public void waitTillWorking(){
        while(!working){
            //do nothing
        }
    }
}
