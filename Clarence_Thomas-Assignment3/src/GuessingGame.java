// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 1
// @version: September 25th, 2023
/* RESOURCES: Utilized coding examples week 3, */

/* EXPLANATION: This program is an Interest Calculator providing the interest, interest rate and loan amount after
being given the interest rate (in floating point) and loan amount. */


import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) {

        // Declare variables
        Scanner input = new Scanner(System.in);
        String YES_OR_NO = "Type (Y or N): "; // Constant asking yes or no
        String CORRECT_GAME = "Yay I got it right!!!";
        String EXIT_MESSAGE = "Have a great rest of your day!";
        String TELL_USER_INPUT_INT = "Type an integer (1, 2, 3 etc): ";


        System.out.println("Think of a game/franchise, I'll try to guess it! Press enter when ready");
        input.nextLine();

        // While user wishes to continue
        System.out.println("Is the game SinglePlayer?");
        System.out.print(YES_OR_NO);
        String isSinglePlayer = input.nextLine();

        // Player is thinking of a singlePlayer game
        if (isSinglePlayer.equalsIgnoreCase("y"))
        {
            System.out.println("Is the game 3rd person?");
            System.out.print(YES_OR_NO);
            String singlePlayerPerspective = input.nextLine();

            // Player is thinking of a singlePlayer 3rd person game
            if (singlePlayerPerspective.equalsIgnoreCase("y"))
            {
                // Ask if game is a shooter
                System.out.println("Is the game a shooting game? ");
                System.out.print(YES_OR_NO);
                String singlePlayerShooterInput = input.nextLine();

                if (singlePlayerShooterInput.equalsIgnoreCase("y"))
                {
                    System.out.println("Is the game military based? ");
                    System.out.print(YES_OR_NO);
                    String singlePlayerMilitaryInput = input.nextLine();

                    if (singlePlayerMilitaryInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("Do you play as an infamous spy in this game? ");
                        System.out.print(YES_OR_NO);
                        String singlePlayerSpyGameInput = input.nextLine();

                        if (singlePlayerSpyGameInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game from the Metal Gear Franchise? ");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerSpyGameInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game Ghost Recon: Future Soldier? ");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    } else if (singlePlayerMilitaryInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Is the game a horror game? ");
                        System.out.print(YES_OR_NO);
                        String singlePlayerHorrorInput = input.nextLine();

                        if (singlePlayerHorrorInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game from the Resident Evil franchise?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerHorrorInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Hitman franchise?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    }
                } else if (singlePlayerShooterInput.equalsIgnoreCase("n")) {
                    System.out.println("Are puzzles prominent in this game? ");
                    System.out.print(YES_OR_NO);
                    String singlePlayerPuzzlesInput = input.nextLine();

                    if (singlePlayerPuzzlesInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("Is this game's target audience children? ");
                        System.out.print(YES_OR_NO);
                        String singlePlayerKidsGame = input.nextLine();

                        if (singlePlayerKidsGame.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game from the Legend of Zelda franchise?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerKidsGame.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the God of War franchise?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    } else if (singlePlayerPuzzlesInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Do you play as an assassin in this game? ");
                        System.out.print(YES_OR_NO);
                        String singlePlayerAssassinInput = input.nextLine();

                        if (singlePlayerAssassinInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game from the Assassin's Creed franchise?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerAssassinInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Devil May Cry franchise?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    }
                }
            } else if (singlePlayerPerspective.equalsIgnoreCase("n")) // Single player game, not 3rd person
            {
                System.out.println("Is the game a strategy game? ");
                System.out.print(YES_OR_NO);
                String singlePlayerStrategyInput = input.nextLine();

                if (singlePlayerStrategyInput.equalsIgnoreCase("y"))
                {
                    System.out.println("Is the game turned based? ");
                    System.out.print(YES_OR_NO);
                    String singlePlayerTurnBasedInput = input.nextLine();

                    if (singlePlayerTurnBasedInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("How many years old is this game? ");
                        System.out.print(TELL_USER_INPUT_INT);

                        int singlePlayerGameAge = input.nextInt();

                        input.nextLine();

                        if (singlePlayerGameAge < 5)
                        {
                            System.out.println("Is the game Darkest Dungeon 2?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerGameAge > 10)
                        {
                            System.out.println("Is the game Pokemon? ");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerGameAge > 5 && singlePlayerGameAge < 10)
                        {
                            System.out.println("Is the game Into the Breach? ");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    } else if (singlePlayerTurnBasedInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Does the game take place in space or on earth? ");
                        System.out.print("Type in 'Space' or 'Earth': ");
                        String singlePlayerSetting = input.nextLine();

                        if (singlePlayerSetting.equalsIgnoreCase("Space"))
                        {
                            System.out.println("Is the game Faster than light? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerSetting.equalsIgnoreCase("Earth"))
                        {
                            System.out.println("Is the game They are billions? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    }
                } else if (singlePlayerStrategyInput.equalsIgnoreCase("n"))
                {
                    System.out.println("Does the game have a win condition? (Select 'n' if the game is infinite) ");
                    System.out.print(YES_OR_NO);
                    String singlePlayerWinConditionInput = input.nextLine();

                    if (singlePlayerWinConditionInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("Is the game futuristic ");
                        System.out.print(YES_OR_NO);
                        String singlePlayerFutureGameInput = input.nextLine();

                        if (singlePlayerFutureGameInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game CyberPunk? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerFutureGameInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game Skyrim? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    } else if (singlePlayerWinConditionInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Does the game take place in a city? ");
                        System.out.print(YES_OR_NO);
                        String singlePlayerCityGameInput = input.nextLine();

                        if (singlePlayerCityGameInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game the Sims? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        } else if (singlePlayerCityGameInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game the RimWorld? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }
}
