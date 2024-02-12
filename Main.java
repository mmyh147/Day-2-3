import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ====================== Day 2 Task 1 =========================

//        float weight, height;
//        System.out.println("Enter your weight in kilogram: ");
//        weight = input.nextFloat();
//        System.out.println("Enter your height in meters: ");
//        height = input.nextFloat();
//        System.out.println("Your BMI is : " + (weight / (height * height)));

        // ====================== Day 2 Task 2 =========================

//        float marks, totalMarks;
//        System.out.println("Enter the marks");
//        marks = input.nextFloat();
//        System.out.println("Enter the total");
//        totalMarks = input.nextFloat();
//        System.out.println("the percentage : " + ((marks / totalMarks) * 100) +"%");

        // ====================== Day 2 Task 3 =========================

//        double amount, exchangeRate;
//        System.out.println("Enter the amount in USD : ");
//        amount = input.nextDouble();
//        System.out.println("Enter the exchange rate(USD to Euro)");
//        exchangeRate = input.nextDouble();
//        System.out.println("Amount in EURO : " +(amount * exchangeRate));


        // ====================== Day 2 Task 4 =========================

//        String name;
//        System.out.println("Enter your name: ");
//        name = input.nextLine();
//        System.out.println("the length of your name: " + name.length() + " And the reversed of your name: " + new StringBuilder(name).reverse());


        // ====================== Day 2 Task 5 =========================

//        String sentence;
//        int startIndex, endIndex;
//        System.out.println("Enter the sentence: ");
//        sentence = input.nextLine();
//        System.out.println("Enter the start index");
//        startIndex = input.nextInt();
//        System.out.println("Enter the end index");
//        endIndex = input.nextInt();
//        System.out.println(sentence.substring(startIndex, endIndex - 1));



        // ====================== Day 2 Task 6 =========================

//        String sentence, keyword1;
//        System.out.println("Enter the sentence: ");
//        sentence = input.nextLine();
//        System.out.println("Enter the keyword: ");
//        keyword1 = input.nextLine();
//        if(sentence.toLowerCase().contains(keyword1.toLowerCase())){
//            System.out.println("Keyword \"" + keyword1 + "\" is present in the sentence");
//
//        }else {
//            System.out.println("Keyword \"" + keyword1 + "\" is not present in the sentence");
//
//        }



        // ====================== Day 2 Task 7 =========================


//        String sentence, wordToReplace, replacement;
//        System.out.println("Enter the sentence: ");
//        sentence = input.nextLine();
//        System.out.println("Enter the word to replace: ");
//        wordToReplace = input.nextLine();
//        System.out.println("Enter the replacement: ");
//        replacement = input.nextLine();
//        sentence = sentence.replace(wordToReplace, replacement);
//        System.out.println(sentence);



        // ====================== Day 2 Task 8 =========================

//        String str1, str2;
//        System.out.println("Enter the first String to compare");
//        str1 = input.nextLine();
//        System.out.println("Enter the second string to compare");
//        str2 = input.nextLine();
//        if(str1.equalsIgnoreCase(str2)){
//            System.out.println("Strings are equal (Ignoring case)");
//        }else{
//            System.out.println("Strings are not equal (Ignoring case)");
//        }









        // ====================== Day 3 Task 1 =========================

//        String role;
//        System.out.println("Enter your role. admin, superuser, or user: ");
//        role = input.nextLine();
//        if(role.equalsIgnoreCase("admin")){
//            System.out.println("Welcome admin");
//
//        }else if(role.equalsIgnoreCase("superuser")){
//            System.out.println("Welcome superuser");
//        }else if(role.equalsIgnoreCase("user")){
//            System.out.println("Welcome user");
//        }else{
//            System.out.println("Invalid role");
//        }


        // ====================== Day 3 Task 2 =========================
//        int num1, num2, num3;
//        System.out.println("Enter the first number");
//        num1 = input.nextInt();
//        System.out.println("Enter the second number");
//        num2 = input.nextInt();
//        System.out.println("Enter the third number");
//        num3 = input.nextInt();
//        if (num1 >= num2 && num1 >= num3) {
//            System.out.println("The greatest : " + num1);
//        } else if (num2 >= num1 && num2 >= num3) {
//            System.out.println("The greatest : " + num2);
//        } else {
//            System.out.println("The greatest : " + num3);
//        }


        // ====================== Day 3 Task 3 =========================
//        Random random = new Random();
//        int randomNum = random.nextInt(7) + 1;
//        switch (randomNum) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");


        // ====================== Day 3 Task 4 =========================
//        int grade;
//        System.out.print("Enter your grade score: ");
//        grade = input.nextInt();
//        System.out.println("Numeric Score: " + grade);
//        System.out.print("Letter Grade: ");
//        if (grade >= 90 && grade <= 100) {
//            System.out.println("A");
//        } else if (grade >= 80 && grade <= 89) {
//            System.out.println("B");
//        } else if (grade >= 70 && grade <= 79) {
//            System.out.println("C");
//        } else if (grade >= 60 && grade <= 69) {
//            System.out.println("D");
//        } else if (grade >= 0 && grade <= 59) {
//            System.out.println("F");
//        } else {
//            System.out.println("Invalid score. Please enter a score between 0 and 100.");
//        }

        // ====================== Day 3 Task 5 =========================

//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//        if (age < 13) {
//            System.out.println("You are a Child.");
//        } else if (age >= 13 && age <= 19) {
//            System.out.println("You are a Teenager.");
//        } else {
//            System.out.println("You are an Adult.");
//        }



    }



    }

