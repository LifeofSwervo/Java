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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
                    }
                } else
                {
                    System.out.println(INVALID_INPUT);
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

                        if (singlePlayerGameAge <= 4 && singlePlayerGameAge >= 0)
                        {
                            System.out.println("Is the game Darkest Dungeon 2?");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (singlePlayerGameAge >= 10)
                        {
                            System.out.println("Is the game Pokemon? ");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (singlePlayerGameAge >= 5 && singlePlayerGameAge <= 9)
                        {
                            System.out.println("Is the game Into the Breach? ");
                            System.out.print(YES_OR_NO);
                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
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
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (singlePlayerCityGameInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game RimWorld? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
                    }
                } else
                {
                    System.out.println(INVALID_INPUT);
                }
            } else
            {
                System.out.println(INVALID_INPUT);
            }
        } else if (isSinglePlayer.equalsIgnoreCase("n"))
        {
            System.out.println("Is the game primarily Co-op?");
            System.out.print(YES_OR_NO);
            String multiplayerCoopInput = input.nextLine();

            if (multiplayerCoopInput.equalsIgnoreCase("y"))
            {
                System.out.println("Is the game's only perspective 1st person?");
                System.out.print(YES_OR_NO);
                String multiplayerFirstPersonInput = input.nextLine();

                if (multiplayerFirstPersonInput.equalsIgnoreCase("y"))
                {
                    System.out.println("Is this game a Looter, Gear based RPG? ");
                    System.out.print(YES_OR_NO);
                    String multiplayerGearBasedRpgInput = input.nextLine();

                    if (multiplayerGearBasedRpgInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("Is the game based in our (Milky way) Galaxy? ");
                        System.out.print(YES_OR_NO);
                        String multiplayerGalaxySettingInput = input.nextLine();

                        if (multiplayerGalaxySettingInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game from the Destiny franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerGalaxySettingInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Borderlands franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else if (multiplayerGearBasedRpgInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Are zombies in this game? ");
                        System.out.print(YES_OR_NO);
                        String multiplayerZombieInput = input.nextLine();

                        if (multiplayerZombieInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game from the Left 4 Dead franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerZombieInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the War-hammer Vermantide franchise?");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
                    }
                } else if (multiplayerFirstPersonInput.equalsIgnoreCase("n"))
                {
                    System.out.println("Is the game an MMO? ");
                    System.out.print(YES_OR_NO);
                    String multiplayerMMOInput = input.nextLine();

                    if (multiplayerMMOInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("What is the max amount of players you can see on screen? ");
                        System.out.print(TELL_USER_INPUT_INT);
                        int multiplayerLobbySize = input.nextInt();
                        input.nextLine();

                        if (multiplayerLobbySize >= 50)
                        {
                            System.out.println("Is the game World of Warcraft? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerLobbySize >= 16 && multiplayerLobbySize <= 49)
                        {
                            System.out.println("Is the game Tower of Fantasy? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerLobbySize > 8 && multiplayerLobbySize <= 15)
                        {
                            System.out.println("Is the game from the Diablo franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerLobbySize <= 8 && multiplayerLobbySize >= 1) // No bots in a lobby so 0 is min size
                        {
                            System.out.println("Is the game Warframe?");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        }
                    } else if (multiplayerMMOInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Is this game 2d? ");
                        System.out.print(YES_OR_NO);
                        String multiplayer2dInput = input.nextLine();

                        if (multiplayer2dInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game Factorio? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayer2dInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game Minecraft? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
                    }
                } else
                {
                    System.out.println(INVALID_INPUT);
                }
            } else if (multiplayerCoopInput.equalsIgnoreCase("n"))
            {
                System.out.println("Is the game a shooter? ");
                System.out.print(YES_OR_NO);
                String multiplayerShooterInput = input.nextLine();

                if (multiplayerShooterInput.equalsIgnoreCase("y"))
                {
                    System.out.println("Does the game have a military focus? ");
                    System.out.print(YES_OR_NO);
                    String multiplayerMilitaryInput = input.nextLine();

                    if (multiplayerMilitaryInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("How many players can fit in a lobby? ");
                        System.out.print(TELL_USER_INPUT_INT);
                        int multiplayerShooterLobbySize = input.nextInt();
                        input.nextLine();

                        if (multiplayerShooterLobbySize >= 13)
                        {
                            System.out.println("Is the game from the Battlefield franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerShooterLobbySize <= 12 && multiplayerShooterLobbySize >= 0) // Bots can be in lobby so min size is 0
                        {
                            System.out.println("Is the game from the Call of Duty franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else if (multiplayerMilitaryInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Did Blizzard develop this game? ");
                        System.out.print(YES_OR_NO);
                        String multiplayerBlizzardInput = input.nextLine();

                        if (multiplayerBlizzardInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game Overwatch? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerBlizzardInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game Paladins? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
                    }
                } else if (multiplayerShooterInput.equalsIgnoreCase("n"))
                {
                    System.out.println("Is this a sports game? ");
                    System.out.print(YES_OR_NO);
                    String isMultiplayerSportsInput = input.nextLine();

                    if (isMultiplayerSportsInput.equalsIgnoreCase("y"))
                    {
                        System.out.println("Is this game based on Basketball or Football? ");
                        System.out.print("Type in 'Basketball' or 'Football': ");
                        String multiplayerSportTypeInput = input.nextLine();

                        if (multiplayerSportTypeInput.equalsIgnoreCase("Basketball"))
                        {
                            System.out.println("Is the game from the NBA 2k franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerSportTypeInput.equalsIgnoreCase("Football"))
                        {
                            System.out.println("Is the game from the Madden franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else if (isMultiplayerSportsInput.equalsIgnoreCase("n"))
                    {
                        System.out.println("Is a ball involved in this game? ");
                        System.out.print(YES_OR_NO);
                        String multiplayerBallInput = input.nextLine();

                        if (multiplayerBallInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("Is the game Rocket League? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else if (multiplayerBallInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Is the game from the Forza Horizon franchise? ");
                            System.out.print(YES_OR_NO);

                            String correctGameChosenInput = input.nextLine();

                            if (correctGameChosenInput.equalsIgnoreCase("y"))
                            {
                                System.out.println(CORRECT_GAME);
                                System.out.print(EXIT_MESSAGE);
                            } else if (correctGameChosenInput.equalsIgnoreCase("n"))
                            {
                                System.out.println(INCORRECT_GAME + "\n" + EXIT_MESSAGE);
                            } else
                            {
                                System.out.println(INVALID_INPUT);
                            }
                        } else
                        {
                            System.out.println(INVALID_INPUT);
                        }
                    } else
                    {
                        System.out.println(INVALID_INPUT);
                    }
                } else
                {
                    System.out.println(INVALID_INPUT);
                }
            } else
            {
                System.out.println(INVALID_INPUT);
            }
        } else
        {
            System.out.println(INVALID_INPUT);
        }
    }
}
