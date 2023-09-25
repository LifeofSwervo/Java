// @author: Clarence= Thomas
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
        String INCORRECT_GAME = "It seems I was unable to guess your game, I do apologize.";
        String EXIT_MESSAGE = "Have a great rest of your day!";
        String TELL_USER_INPUT_INT = "Type an integer (1, 2, 3 etc): ";
        String INVALID_INPUT = "Invalid response given.";


        System.out.println("Think of a game/franchise, I'll try to guess it! Press enter when ready");
        input.nextLine(); // Grab Input

        // While user wishes to continue
        System.out.println("Is the game SinglePlayer?");
        System.out.print(YES_OR_NO); // Ask user for yes or no response
        String isSinglePlayer = input.nextLine(); // Grab Input

        // Player is thinking of a singlePlayer game
        if (isSinglePlayer.equalsIgnoreCase("y")) // Player selected yes
        {
            System.out.println("Is the game 3rd person?");
            System.out.print(YES_OR_NO); // Ask user for yes or no response
            String singlePlayerPerspective = input.nextLine(); // Grab Input 

            
            if (singlePlayerPerspective.equalsIgnoreCase("y")) // Player selected yes
            {
                
                System.out.println("Is the game a shooting game? ");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String singlePlayerShooterInput = input.nextLine(); // Grab Input

                
                if (singlePlayerShooterInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Is the game military based? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerMilitaryInput = input.nextLine(); // Grab Input

                    if (singlePlayerMilitaryInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Do you play as an infamous spy in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerSpyGameInput = input.nextLine(); // Grab Input

                        if (singlePlayerSpyGameInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Metal Gear Franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerSpyGameInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Ghost Recon: Future Soldier? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (singlePlayerMilitaryInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Is the game a horror game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerHorrorInput = input.nextLine(); // Grab Input

                        if (singlePlayerHorrorInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Resident Evil franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerHorrorInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Hitman franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else if (singlePlayerShooterInput.equalsIgnoreCase("n")) {
                    System.out.println("Are puzzles prominent in this game? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerPuzzlesInput = input.nextLine(); // Grab Input

                    if (singlePlayerPuzzlesInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is this game's target audience children? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerKidsGame = input.nextLine(); // Grab Input

                        if (singlePlayerKidsGame.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Legend of Zelda franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerKidsGame.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the God of War franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (singlePlayerPuzzlesInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Do you play as an assassin in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerAssassinInput = input.nextLine(); // Grab Input

                        if (singlePlayerAssassinInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Assassin's Creed franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerAssassinInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Devil May Cry franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else
                {
                    System.out.println(INVALID_INPUT); // Invalid input provided
                }
            } else if (singlePlayerPerspective.equalsIgnoreCase("n")) // Single player game, not 3rd person
            {
                System.out.println("Is the game a strategy game? ");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String singlePlayerStrategyInput = input.nextLine(); // Grab Input

                if (singlePlayerStrategyInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Is the game turned based? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerTurnBasedInput = input.nextLine(); // Grab Input

                    if (singlePlayerTurnBasedInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("How many years old is this game? ");
                        System.out.print(TELL_USER_INPUT_INT);

                        int singlePlayerGameAge = input.nextInt();

                        input.nextLine(); // Grab Input

                        if (singlePlayerGameAge <= 4 && singlePlayerGameAge >= 0) // If game is 0 - 4 years old
                        {
                            System.out.println("Is the game Darkest Dungeon 2?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerGameAge >= 10) // If game is older than or equal to 10 years old
                        {
                            System.out.println("Is the game Pokemon? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerGameAge >= 5 && singlePlayerGameAge <= 9) // If game is 5 - 9 years old
                        {
                            System.out.println("Is the game Into the Breach? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (singlePlayerTurnBasedInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Does the game take place in space or on earth? ");
                        System.out.print("Type in 'Space' or 'Earth': ");
                        String singlePlayerSetting = input.nextLine(); // Grab Input

                        if (singlePlayerSetting.equalsIgnoreCase("Space"))
                        {
                            System.out.println("Is the game Faster than light? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerSetting.equalsIgnoreCase("Earth"))
                        {
                            System.out.println("Is the game They are billions? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else if (singlePlayerStrategyInput.equalsIgnoreCase("n")) // Player selected no
                {
                    System.out.println("Does the game have a win condition? (Select 'n' if the game is infinite) ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerWinConditionInput = input.nextLine(); // Grab Input

                    if (singlePlayerWinConditionInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is the game futuristic ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerFutureGameInput = input.nextLine(); // Grab Input

                        if (singlePlayerFutureGameInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game CyberPunk? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerFutureGameInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Skyrim? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (singlePlayerWinConditionInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Does the game take place in a city? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerCityGameInput = input.nextLine(); // Grab Input

                        if (singlePlayerCityGameInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game the Sims? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (singlePlayerCityGameInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game RimWorld? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else
                {
                    System.out.println(INVALID_INPUT); // Invalid input provided
                }
            } else
            {
                System.out.println(INVALID_INPUT); // Invalid input provided
            }
            // Player is thinking of a multiplayer game
        } else if (isSinglePlayer.equalsIgnoreCase("n")) // Player selected no
        {
            System.out.println("Is the game primarily Co-op?");
            System.out.print(YES_OR_NO); // Ask user for yes or no response
            String multiplayerCoopInput = input.nextLine(); // Grab Input

            if (multiplayerCoopInput.equalsIgnoreCase("y")) // Player selected yes
            {
                System.out.println("Is the game's only perspective 1st person?");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String multiplayerFirstPersonInput = input.nextLine(); // Grab Input

                if (multiplayerFirstPersonInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Is this game a Looter, Gear based RPG? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String multiplayerGearBasedRpgInput = input.nextLine(); // Grab Input

                    if (multiplayerGearBasedRpgInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is the game based in our (Milky way) Galaxy? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerGalaxySettingInput = input.nextLine(); // Grab Input

                        if (multiplayerGalaxySettingInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Destiny franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerGalaxySettingInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game from the Borderlands franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (multiplayerGearBasedRpgInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Are zombies in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerZombieInput = input.nextLine(); // Grab Input

                        if (multiplayerZombieInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Left 4 Dead franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerZombieInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game from the War-hammer Vermantide franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else if (multiplayerFirstPersonInput.equalsIgnoreCase("n")) // Player selected no
                {
                    System.out.println("Is the game an MMO? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String multiplayerMMOInput = input.nextLine(); // Grab Input

                    if (multiplayerMMOInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("What is the max amount of players you can see on screen? ");
                        System.out.print(TELL_USER_INPUT_INT);
                        int multiplayerLobbySize = input.nextInt();
                        input.nextLine(); // Grab Input

                        if (multiplayerLobbySize >= 50) // If lobby size is larger than or equal to 50 players
                        {
                            System.out.println("Is the game World of Warcraft? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerLobbySize >= 16 && multiplayerLobbySize <= 49) // If lobby size is 15 - 49
                        {
                            System.out.println("Is the game Tower of Fantasy? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerLobbySize > 8 && multiplayerLobbySize <= 15) // If lobby size is 9 - 15
                        {
                            System.out.println("Is the game from the Diablo franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerLobbySize <= 8 && multiplayerLobbySize >= 1) // No bots in a lobby so 0 is min size
                        {
                            System.out.println("Is the game Warframe?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        }
                    } else if (multiplayerMMOInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Is this game 2d? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayer2dInput = input.nextLine(); // Grab Input

                        if (multiplayer2dInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game Factorio? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayer2dInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Minecraft? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else
                {
                    System.out.println(INVALID_INPUT); // Invalid input provided
                }
            } else if (multiplayerCoopInput.equalsIgnoreCase("n")) // Player selected no
            {
                System.out.println("Is the game a shooter? ");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String multiplayerShooterInput = input.nextLine(); // Grab Input

                if (multiplayerShooterInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Does the game have a military focus? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String multiplayerMilitaryInput = input.nextLine(); // Grab Input

                    if (multiplayerMilitaryInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("How many players can fit in a lobby? ");
                        System.out.print(TELL_USER_INPUT_INT);
                        int multiplayerShooterLobbySize = input.nextInt();
                        input.nextLine(); // Grab Input

                        if (multiplayerShooterLobbySize >= 13) // If lobby size is larger than or equal to 13
                        {
                            System.out.println("Is the game from the Battlefield franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerShooterLobbySize <= 12 && multiplayerShooterLobbySize >= 0) // Bots can be in lobby so min size is 0
                        {
                            System.out.println("Is the game from the Call of Duty franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (multiplayerMilitaryInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Did Blizzard develop this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerBlizzardInput = input.nextLine(); // Grab Input

                        if (multiplayerBlizzardInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game Overwatch? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerBlizzardInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Paladins? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else if (multiplayerShooterInput.equalsIgnoreCase("n")) // Player selected no
                {
                    System.out.println("Is this a sports game? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String isMultiplayerSportsInput = input.nextLine(); // Grab Input

                    if (isMultiplayerSportsInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is this game based on Basketball or Football? ");
                        System.out.print("Type in 'Basketball' or 'Football': ");
                        String multiplayerSportTypeInput = input.nextLine(); // Grab Input

                        if (multiplayerSportTypeInput.equalsIgnoreCase("Basketball"))
                        {
                            System.out.println("Is the game from the NBA 2k franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided 
                            }
                        } else if (multiplayerSportTypeInput.equalsIgnoreCase("Football"))
                        {
                            System.out.println("Is the game from the Madden franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else if (isMultiplayerSportsInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Is a ball involved in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerBallInput = input.nextLine(); // Grab Input

                        if (multiplayerBallInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game Rocket League? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else if (multiplayerBallInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game from the Forza Horizon franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            if (correctGameChosenInput.equalsIgnoreCase("y")) // Player selected yes
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n")) // Player selected no
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT); // Invalid input provided
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT); // Invalid input provided
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT); // Invalid input provided
                    }
                } else
                {
                    System.out.println(INVALID_INPUT); // Invalid input provided
                }
            } else
            {
                System.out.println(INVALID_INPUT); // Invalid input provided
            }
        } else
        {
            System.out.println(INVALID_INPUT); // Invalid input provided
        }
    }
}
