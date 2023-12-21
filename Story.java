public class Story {
    private int introCounter = 0;

    public Story() {
    }

    public void intro() {
        TextEffects.typewriterPrint("\"...What is this? Where am I?\"");
        TextEffects.typingDelay(1000);
        
        TextEffects.typewriterPrint(
            TextEffects.narratorDialogue("Liquid drips in a steady rhythm, echoing through the dimly lit corridors. Faint light sneaks in through the barred windows, casting ghostly shadows on the cobbled floor. Murmured voices grow nearer, their words muffled by the thick stone walls.")
        );
        TextEffects.typingDelay(500);
        
        TextEffects.typewriterPrint( 
            TextEffects.characterDialogue(
                TextEffects.RESET, 
                "Neebert", 
                "...found 'em sprawled in the ditch, a real mess it was. Couldn't believe my eyes."));
        TextEffects.typingDelay(500);
        
        TextEffects.typewriterPrint("\n" + 
            TextEffects.characterDialogue(
                TextEffects.RESET, 
                "Coakley", 
                "And you're certain of their identity, Neebert? What in the world-"));
        TextEffects.typingDelay(500);
        
        TextEffects.typewriterPrint("\n" + 
            TextEffects.characterDialogue(
                TextEffects.RESET, 
                "Neebert", 
                "When have I ever steered you wrong, Coakley? Plus, my loyalty's bought, not given. No point in fabricating tales, 'specially for you. See for yourself!"));
        TextEffects.typingDelay(1000);

        TextEffects.typewriterPrint(
            TextEffects.narratorDialogue("The two figures peer through the window. Your appearance is disheveled, clothes tattered, hair tangled. You're indistinguishable from the city's common folk, save for your distinctive, glowing eye."));
        TextEffects.typingDelay(500);

        TextEffects.typewriterPrint(
            TextEffects.characterDialogue(
                TextEffects.RESET, 
                "Neebert", 
                "Go on, speak up, prisoner! Tell him who you are!"));
            System.out.println("\n");
        TextEffects.typingDelay(500);
        introCounter++;
    }

    public void intro(Character player) {
        switch(introCounter) {
            case 1:
                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(player.getTextColor(), player.getName(), "I am " + player.getName() + " the " + player.getType() + ". Why am I imprisoned?"));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" + 
                    TextEffects.characterDialogue(
                    TextEffects.RESET, 
                    "Coakley", 
                    "By the gods, it is... and that eye, it glows like the tales say. It lights up with every word."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("They wander off, their voices fading into an indecipherable murmur. You call out, demanding answers."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "HEY! Release me!"));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("As your voice gets louder, the cell is bathed in a " + player.getTextColor() + player.getEyeColor().toLowerCase() + TextEffects.RESET + " luminescence. Your left eye, glowing as it always does when you speak, illuminates the darkness."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(
                    TextEffects.RESET, 
                    "Coakley", 
                    "Incredible... to witness this..."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("Suddenly, a bat darts through the window, swooping towards you!\n\n\tQuick! You must defend yourself!"));     
                TextEffects.typingDelay(1000);
                introCounter++;
                break;

            case 2:
                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("Clarence crashes into the wall, a clinking sound accompanying his fall."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "What the HECK, bro?!"));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("Stunned, you stare in disbelief at the talking bat."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "You can talk?"));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "Yes, I can talk. If you had given me TWO SECONDS, I would have TOLD you that I can talk."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "My guy, you literally BIT me."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "I THOUGHT YOU WERE FOOD! My eyesight's not what it used to be..."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("Shaking off the impact, Clarence retrieves a metal ring and flings it at you with his tiny bat hands."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "THAT is why I'm here. Jerk."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("You catch the ring and notice that it has a small key attached. You try the key in the locks binding you and the shackles fall to the floor with a clang."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "..."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "....."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "..."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "........."));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "So are you gonna explain why you're a talking bat?"));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "...no."));     
                TextEffects.typingDelay(1000);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("In a moment of sheer disbelief, you instinctively raise your arms, palms facing upwards, as if to physically grasp the absurdity of the situation. Your eyes widen, mirroring the silent shock that grips you. It's an unspoken cry of bewilderment, your hands outstretched, vainly seeking answers in a reality that defies understanding. \n\n\tWithout a word, Clarence takes to the air, deftly navigating through the bars of the window."));   
                TextEffects.typingDelay(500);
                
                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "Hey wait! Clarence! Where are you going?!"));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("You press against the bars, straining to see where the enigmatic talking bat has vanished to. The clinking of keys in the rusted iron lock breaks the silence. As the door swings open, flooding the cell with light, there, sprawled on the floor and grinning foolishly, is none other than Clarence."));  
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(player.getTextColor(), 
                        player.getName(), 
                        "Clarence! How did you-"));    
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint("\n" +
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "Look, " + player.getName() + ", explanations can wait. We need to move. That guard might be dim, but he'll notice his missing keys soon enough."));
                TextEffects.typingDelay(1000);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("Clarence leads you through a winding hall. Left. Right. Stairs down. Middle path. You lose track eventually as you are clamoring through the halls chasing after a bat. Eventually, Clarence comes to a stop. He latches onto a rock protruding from the ceiling, hanging upside down as he waits for you to catch up."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "We're almost to the exit, but you have a pretty important decision to make. There are 3 ways out, and each one has it's own...shall we say...price."));
                TextEffects.typingDelay(500);

                TextEffects.typewriterPrint(
                    TextEffects.narratorDialogue("You look up to find three paths forward. The orange flickering of the torches whose light danced across the walls of the previous halls stop and you see something incredible. Each pathway is illuminated with a different color light. Lights so bright and saturated with color like you've never seen. The lights are hypnotizing and eerily welcoming. One pathway, an " + TextEffects.BLUE + "electric blue" + TextEffects.RESET + ", another one " + TextEffects.PURPLE + "radiant purple" + TextEffects.RESET + ", and the last path " + TextEffects.GREEN + "emerald green" + TextEffects.RESET + "."));

                TextEffects.typewriterPrint(
                    TextEffects.characterDialogue(
                    TextEffects.CYAN, 
                    "Clarence", 
                    "So? What'll it be? Which path do you want to take?\" \n\t1. Blue \n\t2. Pink \n\t3. Green"));  
                System.out.println("\n\n");  
                introCounter++;
                break;
        }
    }
}