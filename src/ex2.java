import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        //1-1
//          System.out.println("Welcome to Java");
//1-2
//        System.out.println("Programming is fun!");
//          System.out.println("Fundamentals First");
//          System.out.println("Problem Driven");

//1-3
//        System.out.println((10.5+2*3)/(45-3.5));
//1-4
        //System.out.println("Welcome to Java);
//1-5
        //System.out.println(1/0);
//1-6
//          System.out.println((9/5)*35+32);
//1.2
//        for (int i=0;i<5;i++){
//            System.out.println("Welcome to java");
//        }
//1.3
//        System.out.println("    J    A    V     V    A");
//        System.out.println("    J   A A    V   V    A A");
//        System.out.println("J   J  AAAAA    V V    AAAAA");
//        System.out.println(" J J  A     A    V    A     A");
//1.4
//          System.out.println("a\ta^2\ta^3");
//          System.out.println("1\t1\t1\t");
//          System.out.println("2\t4\t8\t");
//          System.out.println("3\t9\t27\t");
//          System.out.println("4\t16\t64\t");
//1.5
//        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
//1.6
//        int sum=0;
//        for(int i=1;i<9;i++){
//            sum+=i;
//        }
//1.7
//        double total=0;
//        int d=1;
//        for(int i=1;i<13;i+=2){
//            total+=d*(1.0/i);
//            d*=-1;
//        }
//        System.out.println(4*total);
//1.8
//        final double pi=3.14159;
//        double C=2*5.5*pi;
//        double S=5.5*5.5*pi;
//1.9
//            double S=4.5*7.9;
//            double C=2*(4.5+7.9);

//1.10
         //System.out.println((14/1.6)/((45*60+30)/3600.0));
//1.11
        //System.out.println((312032486-365*24*3600/(13-7+45)));
//1.12
//        double v=(24*1.6)/((3600+40/60*3600+35)/3600);
//1.13
//          double x=(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1);
//          double y=(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1);
//2-1
//        double radius;
//        double area;
//        radius=20;
//        area=radius*radius*3.14159;
//        System.out.println("The"+"Area"+"is"+area);
//2-2
//        Scanner input=new Scanner(System.in);
//        System.out.println("print your radius:");
//        double radius=input.nextDouble();
//        double area=radius*radius*3.14159;
//        System.out.println("The"+"Area"+"is"+area);
//2-3
//        Scanner input=new Scanner(System.in);
//        double num1=input.nextDouble();
//        double num2=input.nextDouble();
//        double num3=input.nextDouble();
//        System.out.println((num1+num2+num3)/3);
//2-4
//        final double PI=3.14159;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your number to radius:");
//        double radius=input.nextDouble();
//        double area=radius*radius*PI;
//        System.out.println("The area for the circle of radius"+radius+"is"+area);
//2-5
//        Scanner input=new Scanner(System.in);
//        System.out.println("Please input your Senconds");
//        int seconds=input.nextInt();
//        int minutes=seconds/60;
//        int remainSeconds=seconds%60;
//        System.out.println(seconds+"seconds is minutes+remainseconds"+minutes+remainSeconds);

        //System.out.println(Math.pow(2,0.5));

//        System.out.println(56%6);
//        System.out.println(100%7+2);
//        System.out.println(25.0/4);
//        System.out.println(2*(5/2+5/2));
//        System.out.println(2*(5/2+2*5/2));
//        System.out.println(2*(5/2));
//        System.out.println(2*5/2);
//        System.out.println(Math.pow(2,3.5));
//
//        Scanner input=new Scanner(System.in);
//        int m=input.nextInt();
//        int r=input.nextInt();
//        System.out.println(m*r*r*1.0);

//        long d=2147483648L;
//        float f=3.14f;
//        double g=3.13;
//          System.out.println(0B1111);
//          System.out.println(07777);
//          System.out.println(0XFFFF);
//        long ssn=232_45_4519_341512L;
//        double data=1.23456E-2;
//2-6
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your Fahrenheit: ");
//        double fahrenheit=input.nextDouble();
//        double celsius=(5.0/9)*(fahrenheit-32);
//        System.out.println("Celsius is: "+celsius);
//2-7
//        long totalMilliseconds=System.currentTimeMillis();
//        long totalSeconds=totalMilliseconds/1000;
//        long totalMinutes=totalSeconds/60;
//        long totalHours=totalMinutes/60;
//        long currentHours=totalHours%24;
//        long currentMinutes=totalMinutes%60;
//        long currentSeconds=totalSeconds%60;
//        System.out.println("Current time is: "+currentHours+":"+currentMinutes+":"+currentSeconds);
//2-8
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter purchase amount: ");
//        double purchaseAmount=input.nextDouble();
//        double tax=purchaseAmount*0.06;
//        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
//2-9
//        Scanner input=new Scanner(System.in);
//        double annualInterestRate=input.nextDouble();
//        double monthlyInterestRate=annualInterestRate/1200;
//        int numberOfYears=input.nextInt();
//        double loanAmount=input.nextDouble();
//        double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
//        double totalPayment=monthlyPayment*numberOfYears*12;
//        System.out.println("The monthly payment is $"+(int)(monthlyPayment*100)/100.0);
//        System.out.println("The total payment is $"+(int)(totalPayment*100)/100.0);
//2-10
//        Scanner input=new Scanner(System.in);
//        double amount=input.nextDouble();
//        int remainAmount=(int)(amount*100);
//        int numberOfOneDollars=remainAmount/100;
//        remainAmount=remainAmount%100;
//        int numberOfQuarters=remainAmount/25;
//        remainAmount=remainAmount%25;
//        int numberOfDimes=remainAmount/10;
//        remainAmount=remainAmount%10;
//        int numberOfNickels=remainAmount/5;
//        remainAmount=remainAmount%5;
//        int numberOfPennies=remainAmount;
//        System.out.println("Your amount + "+amount+"consists of");
//        System.out.println(" "+numberOfOneDollars+"dollars");
//        System.out.println(" "+numberOfQuarters+"quarters");
//        System.out.println(" "+numberOfDimes+"dimes");
//        System.out.println(" "+numberOfNickels+"nickels");
//        System.out.println(" "+numberOfPennies+"pennies");
//2.6
//          Scanner input=new Scanner(System.in);
//          int data=input.nextInt();
//          int sum=0;
//          while (data>0){
//              sum+=data%10;
//              data=data/10;
//          }
//          System.out.println(sum);
//2.13
//        double total=0;
//        int n;
//        Scanner input=new Scanner(System.in);
//        n=input.nextInt();
//        double originMoney=0;
//        for (int i=0;i<n;i++){
//            originMoney=total+100;
//            total+=(originMoney)*(1+0.00417);
//        }
//        System.out.println(total);
    }
}
//class Empolyee{
//    private String employName;
//    private  int employAge;
//    private char employSex;
//    public Empolyee(String name,int age,char sex){
//        employName=name;
//        employAge=age;
//        employSex=sex;
//    }
//    public  void setName(String newName){
//        employName=newName;
//    }
//}


