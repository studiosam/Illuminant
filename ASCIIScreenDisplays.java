import org.w3c.dom.Text;

public class ASCIIScreenDisplays {
    public static void startScreen() {
        System.out.println(TextEffects.RESET);
        System.out.println(" ________________________________________________________________");
        System.out.println(" |                                                              | ");
        System.out.println("|                                                                |");
        System.out.println("|                                                                |");
        System.out.println("|                                                                |");
        System.out.println("|________________________________________________________________|");
        System.out.println(" |  __ __    __    __ __ ___  ___ __ __  __  ___  __  __ ______ |");
        System.out.println(" |  || ||    ||    || || ||\\\\//|| || ||\\ || // \\\\ ||\\ || | || | |");
        System.out.println(" |  || ||    ||    || || || \\/ || || ||\\\\|| ||=|| ||\\\\||   ||   |");
        System.out.println(" |  || ||__| ||__| \\\\_// ||    || || || \\|| || || || \\||   ||   |");
        System.out.println(" |______________________________________________________________|");
        System.out.println("|                                                                |");
        System.out.println("|                                                                |");
        System.out.println("|                      PRESS ENTER TO BEGIN                      |");
        System.out.println("|                                                                |");
        System.out.println("|                                                                |");
        System.out.println("|________________________________________________________________|");
    }

    public static void introTunnelChoice() {
        System.out.println(" ________________________________________________________________ ");
        System.out.println("|\\ ______________________________________________________________|");
        System.out.println("|  |                                                             |");
        System.out.println("|  |                                                             |");
        System.out.println("|  |                                                             |");
        System.out.println("|  |                                                             |");
        System.out.println("|  |                                                             |");
        System.out.println("|  |                                                             |");
        System.out.println("|  |      _______             _______              _______       |");
        System.out.println("|  |     |" + TextEffects.BLUE_BACKGROUND + "       " + TextEffects.RESET + "|           |" + TextEffects.PURPLE_BACKGROUND + "       " + TextEffects.RESET + "|            |" + TextEffects.GREEN_BACKGROUND + "       " + TextEffects.RESET + "|      |");
        System.out.println("|  |     |" + TextEffects.BLUE_BACKGROUND + "   " + TextEffects.RESET + TextEffects.BLUE + "1" + TextEffects.RESET + TextEffects.BLUE_BACKGROUND + "   " + TextEffects.RESET + "|           |" + TextEffects.PURPLE_BACKGROUND + "   " + TextEffects.RESET + TextEffects.PURPLE + "2" + TextEffects.RESET + TextEffects.PURPLE_BACKGROUND + "   " + TextEffects.RESET + "|            |" + TextEffects.GREEN_BACKGROUND + "   " + TextEffects.RESET + TextEffects.GREEN + "3" + TextEffects.RESET + TextEffects.GREEN_BACKGROUND + "   " + TextEffects.RESET + "|      |");
        System.out.println("|  |_____|" + TextEffects.BLUE_BACKGROUND + "       " + TextEffects.RESET + "|___________|" + TextEffects.PURPLE_BACKGROUND + "       " + TextEffects.RESET + "| ___________|" + TextEffects.GREEN_BACKGROUND + "       " + TextEffects.RESET + "|______|");
        System.out.println("| /                                                              |");
        System.out.println("|________________________________________________________________|");
        System.out.println("|" + TextEffects.CYAN_BACKGROUND + " ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,( " + TextEffects.RESET + "|");
        System.out.println("|" + TextEffects.CYAN_BACKGROUND + "   `-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `" + TextEffects.RESET + "|");
    }
}
