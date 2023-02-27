import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==============ROCK PAPER SCISSOR==============");
        // |0 == paper|1 == stone|2 == scissors|

        System.out.print("Enter number of chances : ");
        int chances = sc.nextInt();
        int x = chances +1;
        int c1=0,c2=0,c3=0;

        System.out.println("Reference:|0 == paper|1 == stone|2 == scissors| \n");
        while((--x) != 0) {
            
            System.out.print("Enter 0/1/2 : ");
             int rand1 = random.nextInt(3);
             int choice = sc.nextInt();
                if(rand1 == 0) {
                    switch (choice) {
                        case 0 -> {
                            System.out.println("Draw");
                            c3++;
                        }
                        case 1 -> {
                            System.out.println("Lost");
                            c2++;
                        }
                        case 2 -> {
                            System.out.println("Victory");
                            c1++;
                        }
                    }
                }

                    if(rand1 == 1) {
                        switch (choice) {
                            case 0 -> {
                                System.out.println("Victory");
                                c1++;
                            }
                            case 1 -> {
                                System.out.println("Draw");
                                c3++;
                            }
                            case 2 -> {
                                System.out.println("Lost");
                                c2++;
                            }
                        }
                    }

                        if(rand1 == 2) {
                            switch(choice) {
                                case 0 -> {
                                    System.out.println("Lost");
                                    c2++;
                                }
                                case 1 -> {
                                    System.out.println("Victory");
                                    c1++;
                                }
                                case 2 -> {
                                    System.out.println("Draw");
                                    c3++;
                                }
                            }
                }

        }

        if(c1>c2) System.out.println("YOU WON THE GAME!!");
        if(c2>c1) System.out.println("YOU LOST");
        if(c1==c2) System.out.println("FINAL DRAW");

    }
}
