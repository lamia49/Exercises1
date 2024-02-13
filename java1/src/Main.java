import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Qustion1:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Weight:");
        double weight = input.nextFloat();
        System.out.print("Enter your height:");
        double height = input.nextFloat();
        double BMI = weight / Math.pow(height, 2);
        System.out.print("The BMI is " + BMI);


        //Qustion2:


        System.out.print("Enter The Obtained Marks:");
        float ObtainedMarks = input.nextFloat();
        System.out.print("Enter the total:");
        int total = input.nextInt();
        float Precenteg = (float) (ObtainedMarks / total) * 100;
        System.out.print("Precenteg is:" + Precenteg + "%");


        //Qustion3:


        System.out.print("Enter The currency USD:");
        int USD = input.nextInt();
        System.out.print("Enter The Exchang Rate:");
        double ExchangRate = input.nextDouble();
        System.out.println("The Amount in EUR: " + (USD * ExchangRate));


        //Qustion4:


        System.out.print("Enter the Sentence: ");
        String Sentence = input.nextLine();
        StringBuilder SentenceReversed = new StringBuilder();
        SentenceReversed.append(Sentence);
        System.out.print("The length of String is " + Sentence.length() + " the Reversed String is:" + SentenceReversed.reverse());


        //Qustion5:


        System.out.print("Write a Sentence: ");
        String Sentence1 = input.nextLine();
        System.out.print("Enter The Start Index: ");
        int Index1 = input.nextInt();
        System.out.print("Enter The End Index: ");
        int Index2 = input.nextInt();
        System.out.println(Sentence1.substring(Index1, Index2));

        //Qustion6


        System.out.print("Write The Santence: ");
        String Write = input.nextLine();
        System.out.print("the KeyWord to cheak: ");
        String KeyWord = input.nextLine();
        if (Write.contains(KeyWord)) {
            System.out.print(KeyWord + " is present in sentence");
        } else {
            System.out.print(KeyWord + " is not present in sentence");
        }


        //Qustion7


        System.out.print("Write Santence: ");
        String Sentence3 = input.nextLine();
        System.out.print("Write Word to replec : ");
        String Replace1 = input.nextLine();
        System.out.print("Write new word : ");
        String ReplecmentWord = input.nextLine();
        System.out.println(Sentence3.replace(Replace1, ReplecmentWord));

        //Quastion8


        System.out.print("Write The First word : ");
        String string1 = input.nextLine();
        System.out.print("Write The Second word : ");
        String string2 = input.nextLine();

        if (string1.equalsIgnoreCase(string2)) {
            System.out.print("String are equal");
        } else {
            System.out.print("String are not equal");
        }

    }
}



