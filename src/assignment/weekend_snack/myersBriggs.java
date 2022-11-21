package assignment.weekend_snack;

import java.util.Scanner;

public class myersBriggs {
    public static void main(String[] args) {
        String [][] questionnaire = {
                {"""
            1.
(1) expend energy, enjoy groups
(2) conserve energy, enjoy one-on-one""",
                """
            2.
(1) interpret literally
(2) look for meaning and possibilities""",
                """
            3.
(1) logical, thinking, questioning
(2) empathetic, feeling, accommodating""",
                """
            4.
(1) organized, orderly
(2) flexible, adaptable"""},
                {"""
            5.
(1) more outgoing, think out loud
(2) more reserved, think to yourself""",
                """
            6.
(1) practical, realistic, experiential
(2) imaginative, innovative, theoretical""",
                """
            7.
(1) candid, straight forward, frank
(2) tactful, kind, encouraging""",
                """
            8.
(1) plan, schedule
(2) unplanned, spontaneous"""},
                {"""
            9.
(1) seek many tasks, public activities, interaction with others
(2) seek private, solitary activities with quiet to concentrate""",
                """
            10.
(1) standard, usual, conventional
(2) different, novel, unique""",
                """
            11.
(1). firm, tend to criticize, hold the line
(2) gentle, tend to appreciate, conciliate""",
                """
            12.
(1) regulated, structured
(2) easygoing, 'live' and 'let live'"""},
                {"""
            13.
(1) external, communicative, express yourself
(2) internal, reticent, keep to yourself""",
                """
            14.
(1) focus on here-and-now
(2) look to the future, global perspective, 'big picture'""",
                """
            15.
(1) tough-minded, just
(2) tender-hearted, merciful""",
                """
            16.
(1) preparation, plan ahead
(2) go with the flow, adapt as you go"""},
                {"""
            17.
(1) active, initiate
(2) reflective, deliberate""",
                """
            18.
(1) facts, things, “what is”
(2) ideas, dreams, “what could be,” philosophical""",
                """
            19.
(1) matter of fact, issue-oriented
(2) sensitive, people-oriented, compassionate""",
                """
            20.
(1) control, govern
(2) latitude, freedom"""}
        };

        int[][] response = new int[5][4];
        int[] personality = new int[8];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questionnaire.length; i++) {
            int j = 0;
            while (j < questionnaire[i].length) {
                System.out.println(questionnaire[i][j]);
                int reply = input.nextInt();
                if (reply == 1) {
                    response[i][j] = 1;
                    j++;

                } else if (reply == 2) {
                    response[i][j] = 2;
                    j++;
                } else {
                    System.err.println("\ninvalid input. please enter 1 or 2\n");
                }
                int count = 0;
                if (response[0][0] == 1 || response[1][0] == 1 || response[2][0] == 1 || response[3][0] == 1 || response[4][0] == 1 ) {
                    personality[0] = count++;
                } else {
                    personality[1] = count++;
                }
                if (response[0][1] == 1 || response[1][1] == 1 || response[2][1] == 1 || response[3][1] == 1 || response[4][1] == 1) {
                    personality[2] = count++;
                } else {
                    personality[3] = count++;
                }
                if (response[0][2] == 1 || response[1][2] == 1 || response[2][2] == 1 || response[3][2] == 1 || response[4][2] == 1) {
                    personality[4] = count++;
                } else {
                    personality[5] = count++;
                }
                if (response[0][3] == 1 || response[1][3] == 1 || response[2][3] == 1 || response[3][3] == 1 || response[4][3] == 1) {
                    personality[6] = count++;
                } else {
                    personality[7] = count++;
                }
            }
        }
       // System.out.println(Arrays.toString(personality));
        for (int i = 0; i < personality.length; i++) {
            System.out.print(personality[i]+"  ");
        }
//        for (int i = 0; i < response.length; i++) {
//            for (int j = 0; j < response[i].length; j++) {
//                System.out.print(response[i][j]+"   ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < responseB.length; i++) {
//            for (int j = 0; j < responseB[i].length; j++) {
//                System.out.print(responseB[i][j]+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0, j = 0; i < questionnaire.length; i++) {
//            System.out.println(questionnaire[i]);
//            response = input.nextInt();



//            if (i % 5 == 0) {
//                j++;
//            }
//            if (response == 1) {
//
//            }

//        }
//        for (int i = 0; i < personality.length; i++) {
//            for (int j = 0; j < personality[i].length; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }









    }

}
