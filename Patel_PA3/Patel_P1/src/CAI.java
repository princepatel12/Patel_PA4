import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI {

    public static void main(String args[]) {

        boolean start_stop = true;
        int A_1 = 0, Quest = 10;
        int AnsRight= 0, AnsWrong = 0;
        int diff, sessionCont;

        Scanner input = new Scanner(System.in);


        while (start_stop) {

            System.out.print("Select a difficulty level 1-4: ");
            diff = input.nextInt();

            if(diff < 1 || diff > 4) {

                System.out.println("Invalid difficulty level. Please try again.\n");

                System.out.print("Select a difficulty level 1-4: ");
                diff = input.nextInt();
            }

            System.out.print("What type of arithmetic problem do you want to study? 1: Addition  2. Multiplication  3. Subtraction  4. Division:  ");
            int arithmeticType = input.nextInt();

            while (Quest > 0) {

                Random ri = new Random();
                int randCorrect = ri.nextInt(4);

                if(arithmeticType == 1)
                    A_1 = RandNumAdd(diff);
                else if(arithmeticType == 2)
                    A_1 = RandNumMult(diff);
                else if(arithmeticType == 3)
                    A_1 = RandNumSub(diff);
                else if(arithmeticType == 4)
                    A_1 = RandNumDib(diff);

                Quest--;

                int u_Answer = input.nextInt();

                if (u_Answer == A_1) {
                    AnsRight++;
                    switch (randCorrect) {
                        case 0:
                            System.out.println("Very good!");
                            break;
                        case 1:
                            System.out.println("Excellent!");
                            break;
                        case 2:
                            System.out.println("Nice work!");
                            break;
                        case 3:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                } else {
                    AnsWrong++;
                    int randWrong = ri.nextInt(4);
                    switch (randWrong) {
                        case 0:
                            System.out.println("No. Please try again.");
                            break;
                        case 1:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 2:
                            System.out.println("Don't give up!");
                            break;
                        case 3:
                            System.out.println("No. Keep trying");
                            break;
                    }
                }


            }

            System.out.println("Number correct: " + AnsRight);
            System.out.println("Number incorrect: " + AnsWrong + "\n");

            if((AnsRight/10.0) < .75){
                System.out.println("Please ask your teacher for extra help.");
            }
            else
                System.out.println("Congratulations, you are ready to go for the next level!");

            System.out.println("Session is over. Do you wish to start a new one? 1 = Yes --- 2 = No");
            sessionCont = input.nextInt();

            if(Quest == 0 && sessionCont == 2)
                start_stop = false;
            else
                Quest = 10;

        }


    }

    private static int RandNumAdd(int diffLevel) {

        int result = 0;

        if (diffLevel == 1) {
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(9);
            int digit2 = secureRandGen.nextInt(9);

            System.out.println("How much is " + digit1 + " plus " + digit2 + "?");

            result = digit1+digit2;
        }

        else if (diffLevel == 2) {

            int min = 10;
            int max = 99;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " plus " + digit2 + "?");

            result = digit1+digit2;
        }

        else if (diffLevel == 3) {

            int min = 100;
            int max = 999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " plus " + digit2 + "?");

            result = digit1+digit2;
        }

        else if (diffLevel == 4) {

            int min = 1000;
            int max = 9999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " plus " + digit2 + "?");

            result = digit1+digit2;
        }

        return result;

    }
    private static int RandNumMult(int diffLevel) {

        int result = 0;

        if (diffLevel == 1) {
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(9);
            int digit2 = secureRandGen.nextInt(9);

            System.out.println("How much is " + digit1 + " times " + digit2 + "?");

            result = digit1 *digit2;
        }

        else if (diffLevel == 2) {

            int min = 10;
            int max = 99;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " times " + digit2 + "?");

            result = digit1 *digit2;
        }

        else if (diffLevel == 3) {

            int min = 100;
            int max = 999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " times " + digit2 + "?");

            result = digit1 *digit2;
        }

        else if (diffLevel == 4) {

            int min = 1000;
            int max = 9999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " times " + digit2 + "?");

            result = digit1 *digit2;
        }

        return result;
    }

    private static int RandNumSub(int diffLevel) {

        int result = 0;

        if (diffLevel == 1) {
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(9);
            int digit2 = secureRandGen.nextInt(9);

            System.out.println("How much is " + digit1 + " minus " + digit2 + "?");

            result = digit1-digit2;
        }

        else if (diffLevel == 2) {

            int min = 10;
            int max = 99;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " minus " + digit2 + "?");

            result = digit1-digit2;
        }

        else if (diffLevel == 3) {

            int min = 100;
            int max = 999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " minus " + digit2 + "?");

            result = digit1-digit2;
        }

        else if (diffLevel == 4) {

            int min = 1000;
            int max = 9999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " minus " + digit2 + "?");

            result = digit1-digit2;
        }

        return result;
    }

    private static int RandNumDib(int diffLevel) {

        int result = 0;

        if (diffLevel == 1) {
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(9);
            int digit2 = secureRandGen.nextInt(9);

            System.out.println("How much is " + digit1 + " divided by " + digit2 + "?");

            result = digit1/digit2;
        }

        else if (diffLevel == 2) {

            int min = 10;
            int max = 99;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " divided by " + digit2 + "?");

            result = digit1/digit2;
        }

        else if (diffLevel == 3) {

            int min = 100;
            int max = 999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " divided by " + digit2 + "?");

            result = digit1/digit2;
        }

        else if (diffLevel == 4) {

            int min = 1000;
            int max = 9999;
            SecureRandom secureRandGen = new SecureRandom();

            int digit1 = secureRandGen.nextInt(max-min)+min;
            int digit2 = secureRandGen.nextInt(max-min)+min;

            System.out.println("How much is " + digit1 + " divided by " + digit2 + "?");

            result = digit1/digit2;
        }

        return result;

    }
}

