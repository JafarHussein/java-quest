public class Printf {

    public static void main(String[] args){

        //printf - This statement is used to format output in java, more like f strings in py

        String name ="Spongebob";
        char firstLetter = 'S';
        int age=30;
        double height=60.5;
        boolean isEmployed=true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your second name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f centimeters tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        //Using multiple variables in the printf system 

        System.out.printf("%s is %d years old", name, age);

        //Precision in format specifiers 

        double price1=12.35;

        double price2=123.45345;

        double price3=155.23242442;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);


    }
    
}
