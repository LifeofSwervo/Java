// @author: Clarence= Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 3
// @version: September 25th, 2023
/* RESOURCES: Utilized coding examples week 3, Java doc's, Book examples */

/* EXPLANATION: This program is a 20 questions game asking you questions to guess what game you  are thinking of */


import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) {

        // Declare variables
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a game/franchise, I'll try to guess it! Press enter when ready");
        input.nextLine(); // Grab Input

        // Declare Constants
        final String YES_OR_NO = "Type (Y or N): "; // Constant asking yes or no
        final String CORRECT_GAME = "Yay I got it right!!!";
        final String INCORRECT_GAME = "It seems I was unable to guess your game, I do apologize.";
        final String EXIT_MESSAGE = "Have a great rest of your day!";
        final String TELL_USER_INPUT_INT = "Type an integer (1, 2, 3 etc): ";
        final String INVALID_INPUT = "Invalid response given.";


        System.out.println("Is the game primarily SinglePlayer?");
        System.out.print(YES_OR_NO); // Ask user for yes or no response
        String isSinglePlayer = input.nextLine(); // Grab Input

        // Player is thinking of a singlePlayer game
        if (isSinglePlayer.equalsIgnoreCase("y")) // Player selected yes
        {
            System.out.println("Is the game 3rd person?");
            System.out.print(YES_OR_NO); // Ask user for yes or no response
            String singlePlayerPerspective = input.nextLine(); // Grab Input 

            // Player is thinking of single player 3rd person game
            if (singlePlayerPerspective.equalsIgnoreCase("y")) // Player selected yes
            {
                
                System.out.println("Is the game a shooting game? ");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String singlePlayerShooterInput = input.nextLine(); // Grab Input

                // Player is thinking of a single player 3rd person shooting game
                if (singlePlayerShooterInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Is the game military based? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerMilitaryInput = input.nextLine(); // Grab Input

                    // Player is thinking of a single player military game
                    if (singlePlayerMilitaryInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Do you play as an infamous spy in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerSpyGameInput = input.nextLine(); // Grab Input

                        // Player is thinking of a single player spy game
                        if (singlePlayerSpyGameInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Metal Gear Franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of Metal Gear
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
                            // Player is thinking of a single player game without a well known spy
                        } else if (singlePlayerSpyGameInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Ghost Recon: Future Soldier? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of Ghost Recon
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
                        // Player is thinking of a single player game, not military related
                    } else if (singlePlayerMilitaryInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Is the game a horror game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerHorrorInput = input.nextLine(); // Grab Input

                        // Player is thinking of a horror game
                        if (singlePlayerHorrorInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Resident Evil franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            //  Player is thinking of a Resident Evil game
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
                            // Player is thinking of a single player game, not horror related
                        } else if (singlePlayerHorrorInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Hitman franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a hitman game
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
                    // Player is thinking of a single player game, not a shooter
                } else if (singlePlayerShooterInput.equalsIgnoreCase("n")) {
                    System.out.println("Are puzzles prominent in this game? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerPuzzlesInput = input.nextLine(); // Grab Input

                    // Player is thinking of a single player puzzle game
                    if (singlePlayerPuzzlesInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is this game's target audience children? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerKidsGame = input.nextLine(); // Grab Input

                        // Player is thinking of a single player kids game
                        if (singlePlayerKidsGame.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Legend of Zelda franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Legend of Zelda game
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
                            // Player is thinking of a single player non-kids game
                        } else if (singlePlayerKidsGame.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the God of War franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player god of war game
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
                        // Player is thinking of a single player non-puzzle related game
                    } else if (singlePlayerPuzzlesInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Do you play as an assassin in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerAssassinInput = input.nextLine(); // Grab Input

                        // Player is thinking of a single player assassin's game
                        if (singlePlayerAssassinInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Assassin's Creed franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Assassin's creed game
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
                            // Player is thinking of a single player non-assassin related game
                        } else if (singlePlayerAssassinInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Devil May Cry franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response
                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Devil May Cry game
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
                // Single player game, not 3rd person
            } else if (singlePlayerPerspective.equalsIgnoreCase("n"))
            {
                System.out.println("Is the game a strategy game? ");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String singlePlayerStrategyInput = input.nextLine(); // Grab Input

                // Player is thinking of a single player strategy game
                if (singlePlayerStrategyInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Is the game turned based? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerTurnBasedInput = input.nextLine(); // Grab Input

                    // Player is thinking of a single player turned based game
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

                            // Player is thinking of a single player Darkest Dungeon game
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

                            // Player is thinking of a single player Pokémon game
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

                            // Player is thinking of a single player into the breach game
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
                        // Player is thinking of a single player non-turned based strategy game
                    } else if (singlePlayerTurnBasedInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Does the game take place in space or on earth? ");
                        System.out.print("Type in 'Space' or 'Earth': ");
                        String singlePlayerSetting = input.nextLine(); // Grab Input

                        // Player is thinking of a single player strategy space game
                        if (singlePlayerSetting.equalsIgnoreCase("Space"))
                        {
                            System.out.println("Is the game Faster than light? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Faster than Light game
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
                            // Player is thinking of a single player strategy earth game
                        } else if (singlePlayerSetting.equalsIgnoreCase("Earth"))
                        {
                            System.out.println("Is the game They are billions? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player They are Billions
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
                    // Player is thinking of a single player non-strategy game
                } else if (singlePlayerStrategyInput.equalsIgnoreCase("n")) // Player selected no
                {
                    System.out.println("Does the game have a win condition? (Select 'n' if the game is infinite) ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String singlePlayerWinConditionInput = input.nextLine(); // Grab Input

                    // Player is thinking of a single player game with a win-condition
                    if (singlePlayerWinConditionInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is the game futuristic ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerFutureGameInput = input.nextLine(); // Grab Input

                        // Player is thinking of a single player futuristic game with a win condition
                        if (singlePlayerFutureGameInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game CyberPunk? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Cyberpunk game
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
                            // Player is thinking of a single player non-futuristic game with a win condition
                        } else if (singlePlayerFutureGameInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Skyrim? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Skyrim game
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
                        // Player is thinking of a single player with no win condition
                    } else if (singlePlayerWinConditionInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Does the game take place in a city? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String singlePlayerCityGameInput = input.nextLine(); // Grab Input

                        // Player is thinking of a single player city game
                        if (singlePlayerCityGameInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game the Sims? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Sim's Game
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
                            // Player is thinking of a single player non-city related game
                        } else if (singlePlayerCityGameInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game RimWorld? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a single player Rimworld game
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

            // Player is thinking of a multiplayer Co-op game
            if (multiplayerCoopInput.equalsIgnoreCase("y")) // Player selected yes
            {
                System.out.println("Is the game's only perspective 1st person?");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String multiplayerFirstPersonInput = input.nextLine(); // Grab Input

                // Player is thinking of a multiplayer first person game
                if (multiplayerFirstPersonInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Is this game a Looter, Gear based RPG? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String multiplayerGearBasedRpgInput = input.nextLine(); // Grab Input

                    // Player is thinking of a multiplayer Looter, Gear based RPG
                    if (multiplayerGearBasedRpgInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is the game based in our (Milky way) Galaxy? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerGalaxySettingInput = input.nextLine(); // Grab Input

                        // Player is thinking of a multiplayer game with a setting in our galaxy
                        if (multiplayerGalaxySettingInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Destiny franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer game from the Destiny franchise
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
                            // Player is thinking of a multiplayer game not in our galaxy
                        } else if (multiplayerGalaxySettingInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game from the Borderlands franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Borderlands game
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
                        // Player is thinking of a multiplayer game, that is not Gear Based
                    } else if (multiplayerGearBasedRpgInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Are zombies in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerZombieInput = input.nextLine(); // Grab Input

                        // Player is thinking of a multiplayer game with Zombies
                        if (multiplayerZombieInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game from the Left 4 Dead franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Left 4 Dead game
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
                            // Player is thinking of a multiplayer game, with no zombies
                        } else if (multiplayerZombieInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game from the War-hammer Vermantide franchise?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer War-hammer Vermantide game
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
                    // Player is thinking of a multiplayer game that is not 1st person
                } else if (multiplayerFirstPersonInput.equalsIgnoreCase("n")) // Player selected no
                {
                    System.out.println("Is the game an MMO? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String multiplayerMMOInput = input.nextLine(); // Grab Input

                    // Player is thinking of a massive multiplayer online game (MMO)
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

                            // Player is thinking of a multiplayer World of Warcraft game
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
                        } else if (multiplayerLobbySize > 15 && multiplayerLobbySize <= 49) // If lobby size is 15 - 49
                        {
                            System.out.println("Is the game Tower of Fantasy? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Tower of Fantasy game
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
                        } else if (multiplayerLobbySize > 8 && multiplayerLobbySize < 16) // If lobby size is 9 - 15
                        {
                            System.out.println("Is the game from the Diablo franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Diablo game
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
                        } else if (multiplayerLobbySize <= 8 && multiplayerLobbySize > 0) // No bots in a lobby so 0 is min size
                        {
                            System.out.println("Is the game Warframe?");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Warframe game
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
                        // Player is thinking of a multiplayer game but not Massive Multiplayer Online (MMO)
                    } else if (multiplayerMMOInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Is this game 2d? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayer2dInput = input.nextLine(); // Grab Input

                        // Player is thinking of a multiplayer 2d game
                        if (multiplayer2dInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game Factorio? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Factorio game
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
                            // Player is thinking of a multiplayer non-2d game
                        } else if (multiplayer2dInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Minecraft? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Minecraft game
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
                // Player is thinking of a multiplayer game with no Co-op
            } else if (multiplayerCoopInput.equalsIgnoreCase("n")) // Player selected no
            {
                System.out.println("Is the game a shooter? ");
                System.out.print(YES_OR_NO); // Ask user for yes or no response
                String multiplayerShooterInput = input.nextLine(); // Grab Input

                // Player is thinking of a multiplayer shooter game
                if (multiplayerShooterInput.equalsIgnoreCase("y")) // Player selected yes
                {
                    System.out.println("Does the game have a military focus? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String multiplayerMilitaryInput = input.nextLine(); // Grab Input

                    // Player is thinking of a multiplayer military focused game
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

                            // Player is thinking of a multiplayer Battlefield game
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

                            // Player is thinking of a multiplayer Call of Duty game
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
                        // Player is thinking of a multiplayer without a military focus
                    } else if (multiplayerMilitaryInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Did Blizzard develop this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerBlizzardInput = input.nextLine(); // Grab Input

                        // Player is thinking of a multiplayer Blizzard developed game
                        if (multiplayerBlizzardInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game Overwatch? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Overwatch game
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
                            // Player is thinking of a multiplayer game, not developed by blizzard
                        } else if (multiplayerBlizzardInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game Paladins? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Paladins game
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
                    // Player is thinking of a multiplayer game, without a focus on shooting
                } else if (multiplayerShooterInput.equalsIgnoreCase("n")) // Player selected no
                {
                    System.out.println("Is this a sports game? ");
                    System.out.print(YES_OR_NO); // Ask user for yes or no response
                    String isMultiplayerSportsInput = input.nextLine(); // Grab Input

                    // Player is thinking of a multiplayer sports game
                    if (isMultiplayerSportsInput.equalsIgnoreCase("y")) // Player selected yes
                    {
                        System.out.println("Is this game based on Basketball or Football? ");
                        System.out.print("Type in 'Basketball' or 'Football': ");
                        String multiplayerSportTypeInput = input.nextLine(); // Grab Input

                        // Player is thinking of a multiplayer Basketball game
                        if (multiplayerSportTypeInput.equalsIgnoreCase("Basketball"))
                        {
                            System.out.println("Is the game from the NBA 2k franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer NBA 2k game
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
                            // Player is thinking of a multiplayer Football game
                        } else if (multiplayerSportTypeInput.equalsIgnoreCase("Football"))
                        {
                            System.out.println("Is the game from the Madden franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Madden game
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
                        // Player is thinking of a multiplayer non-sports game
                    } else if (isMultiplayerSportsInput.equalsIgnoreCase("n")) // Player selected no
                    {
                        System.out.println("Is a ball involved in this game? ");
                        System.out.print(YES_OR_NO); // Ask user for yes or no response
                        String multiplayerBallInput = input.nextLine(); // Grab Input

                        // Player is thinking of a multiplayer non-sports game with a ball
                        if (multiplayerBallInput.equalsIgnoreCase("y")) // Player selected yes
                        {
                            System.out.println("Is the game Rocket League? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Rocket League game
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
                            // Player is thinking of a multiplayer game with no ball involved
                        } else if (multiplayerBallInput.equalsIgnoreCase("n")) // Player selected no
                        {
                            System.out.println("Is the game from the Forza Horizon franchise? ");
                            System.out.print(YES_OR_NO); // Ask user for yes or no response

                            String correctGameChosenInput = input.nextLine(); // Grab Input

                            // Player is thinking of a multiplayer Forza Horizon game
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
