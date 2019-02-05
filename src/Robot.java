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

    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
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
