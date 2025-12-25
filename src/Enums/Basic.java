package Enums;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //these are public, static, final
        //child class can't be made
        //can't extends classes but can implements interfaces
        //type is Week

        Week(){
            System.out.println("Constructor called for "+ this);
        }

        @Override
        public void hello() {
            System.out.println("Hey how are you");
        }
        //this is not public or protected, only private or default
        //WHY? we don't want to create new objects
        //this is not the enum concept

        //internally it's like: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Thursday;
        week.hello();
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}
